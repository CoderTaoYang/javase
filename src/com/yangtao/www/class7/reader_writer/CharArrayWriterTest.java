package com.yangtao.www.class7.reader_writer;

import java.io.CharArrayWriter;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/
public class CharArrayWriterTest {

    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}