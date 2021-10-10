package com.java.springbootdemo.fileutil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lch
 * @create 2021-10-10 下午 1:14
 */
public class FileUtil {


    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\000\\test.csv";
        String content = "\"猪蹄蹄\",27,女,160,90,中国,B,山西运城,陕西省运城市河津1234号,陕西省西安市雁塔区长安园配套小区,13500001234,UI设计,山西太原理工大学,流浪的小狗,屌丝最爱的就是她的最爱,煽情老残苦情戏\r\n";
//        for (int i = 0; i < 20000000; i++) {
           // fileWriterMethod(path, content);
//        }

        long start = System.currentTimeMillis();
        // print();
        parseCsvUsingJavaStream(path);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / (1000));
    }

    public static void fileWriterMethod(String filepath, String content) throws IOException {
        // 第二个 append 的参数传递一个 true = 追加文件的意思
        try (FileWriter fileWriter = new FileWriter(filepath, true)) {
            fileWriter.append(content);
        }
    }

    public static void parseCsvUsingJavaStream(String path) {
        int count = 0;
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(System.out :: println);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("总行数:" + count);
    }

    public static void print() {
        File csv = new File("C:\\Users\\Administrator\\Desktop\\000\\test1.csv");  // CSV文件路径
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        String everyLine = "";
        try {
            List<String> allString = new ArrayList<>();
            while ((line = br.readLine()) != null)  //读取到的内容给line变量
            {
                everyLine = line;
                System.out.println(everyLine);
                allString.add(everyLine);
            }
            System.out.println("csv表格中所有行数：" + allString.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
