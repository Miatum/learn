package JavaIO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardRead {
    public static void read() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out , true);
        String input = null;
        try{
            System.out.println("请输入：");
            while ((input = br.readLine()) != null){
                if (input.equals("exit")){
                    System.exit(1);
                }
                pw.println(input);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            br.close();
            pw.close();
        }
    }
}
