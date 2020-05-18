package com.yangtao.www.class7.reader_writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/
public class BufferReaderTest {
    public static void main(String[] args) {

        BufferedReader  reader = null;

        try {
            reader = new BufferedReader(new FileReader("aaa.txt"));
            String read = null;
            while((read = reader.readLine())!=null){
                System.out.println(read);
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}