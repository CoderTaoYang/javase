package com.yangtao.www.class7.handlestream;

import java.io.*;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/
public class OutputStreamWriterDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        OutputStreamWriter outputStreamWriter = null;
        FileOutputStream fileOutputStream = null;


        try {
            long time = System.currentTimeMillis();
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"iso8859-1");
            outputStreamWriter.write(99);
            outputStreamWriter.write("马士兵教育");
            outputStreamWriter.write("abcdefg",0,5);
            long end = System.currentTimeMillis();
            System.out.println(end-time);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流对象的时候，建议按照创建的顺序的逆序来进行关闭
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}