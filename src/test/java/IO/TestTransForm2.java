package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nan on 17-1-19.
 */
public class TestTransForm2 {
    public static void main(String[] args) {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            String s = br.readLine();
            while (s!=null){
                System.out.println(s.toUpperCase());
                s = br.readLine();
                if (s.equals("exit")){
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
