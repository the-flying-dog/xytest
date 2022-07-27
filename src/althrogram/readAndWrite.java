package althrogram;

import java.io.*;

import java.text.SimpleDateFormat;

import java.util.Date;

public class readAndWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\新建文件夹\\duibi\\Malware-detection-by-system-call-graph-using-Machine-Learning-main\\Malware-detection-by-system-call-graph-using-Machine-Learning-main\\data\\Train_data - 副本.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileReader fr = new FileReader(file);
        BufferedReader bufr = new BufferedReader(fr);
        String string = null;
        StringBuilder cin = new StringBuilder();
        int countCin = 0;
        while ((string=bufr.readLine())!=null){
            String hashName = string.split("/")[3];
            cin.append(hashName);
            cin.append("\n");
            countCin++;
        }
        System.out.println("数据数："+countCin);
        fr.close();
        File fileCout = new File("D:\\新建文件夹\\duibi\\Malware-detection-by-system-call-graph-using-Machine-Learning-main\\Malware-detection-by-system-call-graph-using-Machine-Learning-main\\data\\hashCode.txt");
        if (!fileCout.exists()) {
            fileCout.createNewFile();
        }
        FileWriter fw = null;
        fw = new FileWriter(fileCout,true);
        fw.write(cin.toString());
        System.out.println("成功写入");
        fw.close();
    }
}
