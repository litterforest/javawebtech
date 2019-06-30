package com.cobee.pio.ppt;


import org.apache.poi.hslf.usermodel.HSLFSlideShow;
import org.apache.poi.hslf.usermodel.HSLFTable;
import org.apache.poi.hslf.usermodel.HSLFTableCell;
import org.apache.poi.hslf.usermodel.HSLFTextShape;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.Slide;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2019/6/30.
 */
public class ReadPPTTester {

    public static void main(String[] args) {
        testPpt();
    }

    public static void testPpt() {
        String path = "E:\\我的项目\\智能家居报价系统\\GD-SZ-项目名称-SHMP-V1.pptx";
        // String path = "D:\\temp\\temp\\test.pptx";
        File file = new File(path);
        InputStream is = null;
        SlideShow slideShow = null;
        try {
            is = new FileInputStream(file);
            if (path.endsWith(".ppt")) {
                slideShow = new HSLFSlideShow(is);
            } else if (path.endsWith(".pptx")) {
                slideShow = new XMLSlideShow(is);
            }
            if (slideShow != null) {
                // 文本内容
                StringBuilder content = new StringBuilder();
                // 一页一页读取
                for (Slide slide : (List<Slide>) slideShow.getSlides()) {
                    List shapes = slide.getShapes();
                    if (shapes != null) {
                        for (int i = 0; i < shapes.size(); i++) {
                            Shape shape = (Shape) shapes.get(i);
                            if (shape instanceof HSLFTextShape) {// 文本框
                                String text = ((HSLFTextShape) shape).getText();
                                content.append(text);
                            }
                            if (shape instanceof XSLFTextShape) {// 文本框
                                String text = ((XSLFTextShape) shape).getText();
                                content.append(text);
                            }
                            if (shape instanceof HSLFTable) {// 表格
                                int rowSize = ((HSLFTable) shape).getNumberOfRows();
                                int columnSize = ((HSLFTable) shape).getNumberOfColumns();
                                for (int rowNum = 0; rowNum < rowSize; rowNum++) {
                                    for (int columnNum = 0; columnNum < columnSize; columnNum++) {
                                        HSLFTableCell cell = ((HSLFTable) shape).getCell(rowNum, columnNum);
                                        if (cell != null) {
                                            String text = cell.getText();
                                            content.append(text);
                                        }
                                    }
                                }
                            }
                            if (shape instanceof XSLFTable) {// 表格
                                int rowSize = ((XSLFTable) shape).getNumberOfRows();
                                int columnSize = ((XSLFTable) shape).getNumberOfColumns();
                                for (int rowNum = 0; rowNum < rowSize; rowNum++) {
                                    for (int columnNum = 0; columnNum < columnSize; columnNum++) {
                                        XSLFTableCell cell = ((XSLFTable) shape).getCell(rowNum, columnNum);
                                        if (cell != null) {
                                            String text = cell.getText();
                                            content.append(text);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (content.length() > 0) {
                        System.out.println(content);
                        content.delete(0, content.length());
                    }
                }

                // 图片内容
                List pictures = slideShow.getPictureData();
                for (int i = 0; i < pictures.size(); i++) {
                    PictureData picture = (PictureData) pictures.get(i);
                    byte[] data = picture.getData();
                    String imgPath = "E:\\我的项目\\智能家居报价系统\\tmp\\" + UUID.randomUUID().toString().replaceAll("-", "") + ".jpg";
                    File imgFile = new File(imgPath);
                    //imgFile.createNewFile();
                    FileOutputStream out = new FileOutputStream(imgFile);
                    out.write(data);
                    out.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (slideShow != null) {
                    slideShow.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
            }
        }
    }

}
