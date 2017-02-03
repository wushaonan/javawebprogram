package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by nan on 17-1-19.
 */
public class TestTransForm {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/home/nan/桌面/aaa/TransForm.txt"));
            osw.write("从那一刻起，我忘记了呼吸！");
            System.out.println(osw.getEncoding());
            osw.flush();
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("/home/nan/桌面/aaa/TransForm.txt",true),"iso8859-1");
            osw.write("aaaaaaaaaaaasdasdasdsadsdsdsads！");
            System.out.println(osw.getEncoding());
            osw.flush();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
