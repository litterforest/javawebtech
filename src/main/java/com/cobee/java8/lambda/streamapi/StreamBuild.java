package com.cobee.java8.lambda.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
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
    public static void generateStream()
    {
        // 在流对象里面，无限生成hello
        Stream<String> stream = Stream.generate(() -> "hello");
        // 使用limit中间操作来限定生成的个数
        stream = stream.limit(10);
        stream.forEach(System.out::println);
    }

    /**
     * 通过stream.iterator方法来创建stream对象，传入参数1是种子数，参数2是UnaryOperator函数式接口
     * @return
     */
    public static void iteratorStream()
    {
        Stream<Integer> stream = Stream.iterate(1, (x) -> { return x + 1; } );
        stream = stream.limit(3);
        stream.forEach(System.out::println);
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

        //generateStream();

        //iteratorStream();

        // 在没有遇到终止操作的时候，出现廷迟处理
//        Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> {
//            //System.out.println("abc");
//            return x % 2 == 0;
//        }).forEach(System.out::println);

        // 求和
//        int sum = Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
//        System.out.println(sum);

        // 求最大值
//        int max = Arrays.asList(1, 2, 3, 4, 5).stream().max((a, b) -> { return a - b; }).get();
//        System.out.println(max);

        // 查找任意
//        Optional<Integer> optional = Arrays.asList(1, 2, 3, 4, 5).stream().findAny();
//        int data = optional.get();
//        System.out.println(data);

        // 查找第一个
//        Optional<Integer> optional = Arrays.asList(1, 2, 3, 4, 5).stream().findFirst();
//        int data = optional.get();
//        System.out.println(data);

        // 列表中的元素是否存在匹配的值
//        boolean flag = Arrays.asList(1, 2, 3, 4, 5).stream().anyMatch(x -> x % 2 == 0);
//        System.out.println(flag);

        // 集合中的元素是否都匹配
//        boolean flag = Arrays.asList(1, 2, 3, 4, 5).stream().allMatch(x -> x % 2 == 0);
//        System.out.println(flag);


//        // 排序，升序
//        Arrays.asList(3, 4, 5, 1,2).stream().sorted().forEach(System.out::println);
//
//        // 排序，降序
//        Arrays.asList(3, 4, 5, 1,2).stream().sorted((a, b) -> b - a).forEach(System.out::println);

        // 字符串按长度升序
        //Arrays.asList("abc", "12", "华为", "cobee").stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);

        // 把1到50中的偶数，收集到list集合里面
//        List<Integer> list = Stream.iterate(1, x -> x+1).limit(50).filter(x -> x %2==0).collect(Collectors.toList());
//        System.out.println(list);

        // 去重操作
        //Arrays.asList(1,3, 4, 5, 3, 1,2).stream().distinct().forEach(System.out::println);

        // 有50个元素，模拟分页操作。第一页
//        List<Integer> list = Stream.iterate(1, x -> x+1).limit(50).sorted((a, b) -> b-a).limit(10).collect(Collectors.toList());
//        System.out.println(list);
//        // 第二页
//        list = Stream.iterate(1, x -> x+1).limit(50).sorted((a, b) -> b-a).skip(10).limit(10).collect(Collectors.toList());
//        System.out.println(list);

        // 把字符串分割，然后转换成int类型，最后计算求和
//        String str = "11,22,33,44,55";
//        int sum = Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum();
//        System.out.println(sum);

        // 把字符串中的名称，转换成Person对象
//        String str = "tomcat,spring,nginx,redis,kafka,hadoop";
//        Stream.of(str.split(",")).map(Person::new).forEach(System.out::println);

        // 使用并行处理，并行处理是一个中间操作 parallel() , sequential()串行操作

        // 可设置stream处理的并行线程数，设置java.util.concurrent.ForkJoinPool.common.parallelism这个系统属性来控制。也可以通过-Djava.util.concurrent.ForkJoinPool.common.parallelism=5在起动的时候给定
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "5");

        int sum = Stream.iterate(1, x -> x+1).limit(200).peek((x) -> {
            System.out.println(Thread.currentThread().getName());
        }).parallel().mapToInt(x -> x).sum();
        System.out.println(sum);
    }

}
