package IO;

import java.io.*;

/**
 * Created by nan on 17-1-19.
 */
public class TestBufferStream {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/home/nan/桌面/aaa/Hello.java");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c =  0;
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.mark(3);
            for(int i = 0;i<115&&((c=bis.read())!=-1);i++){
                System.out.print((char)c);
            }
            System.out.println();
            bis.reset();
            for(int i = 0;i<10&&((c=bis.read())!=-1);i++){
                System.out.print((char)c);
            }
            bis.close();
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));
//            bufferedOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
