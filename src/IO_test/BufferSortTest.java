package IO_test;

import java.io.*;
import java.util.HashMap;

public class BufferSortTest {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> text = new HashMap<>();
        File test1 = new File("C:\\Users\\天上乱飞的狗\\Desktop\\你好.docx");
        File test2 = new File("C:\\Users\\天上乱飞的狗\\Desktop\\排序.docx");
        BufferedReader reader = new BufferedReader(new FileReader(test1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(test2));
        String line = "";
        String[] str = new String[2];
        while((line=reader.readLine())!=null) {
            str = line.split("\\.");
            text.put(Integer.getInteger(str[0]), str[1]);
        }
        for(Integer i:text.keySet()){
            System.out.println(text.get(i));
            writer.write(text.get(i));
            writer.newLine();
        }
        writer.close();
        reader.close();
    }
}
