package com.yangtao.www.class7.reader_writer;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/
public class CharArrayReaderTest {
    public static void main(String[] args) {

        char[] chars = "马士兵教育".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;
            while((read = charArrayReader.read())!=-1){
                System.out.println((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }

    }
}