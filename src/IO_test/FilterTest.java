package IO_test;

import java.io.File;
import java.io.FileFilter;

public class FilterTest {
    public static void main(String[] args) {
        File dirs = new File("C:\\Users\\天上乱飞的狗\\Desktop");
//        for(File dir:dirs.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
////                return pathname.getName().equals("你是一个大猪头，呸！.docx");
//                return pathname.getName().endsWith(".docx");
//            }
//        })){
//            System.out.println(dir.getName());
//        }
        File[] d = dirs.listFiles((File p)->{
            return p.getName().endsWith(".docx");
        });
        for(File dir:d){
            System.out.println(dir.getName());
        }

    }


}
