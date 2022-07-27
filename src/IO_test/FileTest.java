package IO_test;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        默认名称分隔符或文件分割符widnows\,linux/
        String separator = File.separator;
        char separatorC = File.separatorChar;
//        环境变量中分割一个个路径的符号，Windows是；，Linux是：
        String separatorPath = File.pathSeparator;
        char separatorCPath = File.pathSeparatorChar;
        System.out.println(
                "默认名称分隔符"+separator+"\n"
                +"字符版"+separatorC+"\n"
                +"默认路径分隔符"+separatorPath+"\n"
                +"字符版"+separatorCPath+"\n"
        );
        File test = new File("C:\\Users\\天上乱飞的狗\\Desktop\\你是一个大猪头，呸！.docx");
        //File test = new File("liyue.txt");
        File dirs = new File("C:\\Users\\天上乱飞的狗\\Desktop");
        for(File dir:dirs.listFiles()){
            System.out.println(dir.getName());
        }
        String abPath = test.getAbsolutePath();
        String path = test.getPath();
//        getName获取的是路径的结尾部分，结尾是文件就获取文件，结尾是文件夹就获取文件夹（无论是相对路径还是绝对路径）
        String name = test.getName();
        long len = test.length();
        System.out.println("abpath  " +abPath+"\n"+
                "path  " +path+"\n"+
                "name  " +name+"\n"+
                "文件或目录是否存在"+test.exists()+"\n"+
                "是否为文件"+test.isFile()+"\n"+
                "是否为目录"+test.isDirectory()+"\n"+
                "len  "+len
        );
    }
}
