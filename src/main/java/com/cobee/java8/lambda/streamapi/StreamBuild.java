package com.cobee.java8.lambda.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream对象创建
 */
public class StreamBuild {

    /**
     * 通过数组创建流对象
     * @return
     */
    public static void genStream4Arr()
    {
        // 通过数组创建流对象
        String[] arr = {"a", "b", "1", "2", "3"};
        Stream<String> arrStream = Stream.of(arr);
        arrStream.forEach(System.out::println);
    }

    /**
     * 通过list创建流对象
     * @return
     */
    public static Stream<?> genStream4List()
    {
        List<String> list = Arrays.asList("a", "b", "1", "2", "3");
        Stream<String> stream = list.stream();
        return stream;
    }

    /**
     * 通过stream.generate方法来创建stream对象，传入参数是Supplier函数式接口
     * @return
     */
    public static Stream<?> generateStream()
    {
        Stream<String> stream = Stream.generate(() -> "hello");
        return stream;
    }

    /**
     * 通过stream.iterator方法来创建stream对象，传入参数1是种子数，参数2是UnaryOperator函数式接口
     * @return
     */
    public static Stream<?> iteratorStream()
    {
        Stream<Integer> stream = Stream.iterate(1, (x) -> { return x + 1; } );
        return stream;
    }

    /**
     * 通过其它方式来生成stream对象
     * @return
     */
    public static IntStream otherGenerate()
    {
        String str = "abcd";
        return str.chars();
    }

    /**
     * 通过文件方式来生成stream对象，并打印文件内容
     *
     * @return
     */
    public static void fileStream()
    {
        try {
            Stream<String> stream = Files.lines(Paths.get("F:\\51cto\\devOps\\jenkins安装与使用.txt"));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //IntStream intStream = StreamBuild.otherGenerate();
        // forEach终止操作，加实例方法引用
        //intStream.forEach(System.out::println);

        // 通过Files + stream折方式打印文件中的内容
        //StreamBuild.fileStream();

    }

}
