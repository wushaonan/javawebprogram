package IO;

import java.io.*;

/**
 * Created by nan on 17-1-19.
 */
public class TestBufferStream1 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nan/桌面/aaa/BufferStream.java"));
            String s = null;
            for (int i = 0;i<1000;i++){
                s = String.valueOf(Math.random());
                bw.write(s+" ");
                bw.flush();
            }
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("/home/nan/桌面/aaa/BufferStream.java"));
            while ((s = br.readLine())!=null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
