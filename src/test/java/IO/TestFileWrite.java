package IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by nan on 17-1-19.
 */
public class TestFileWrite {
    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            fw = new FileWriter("/home/nan/桌面/aaa/fileWriter.txt");
            for (int i = 0;i<6000;i++){
                fw.write(i);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
