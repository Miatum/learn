package base01;
import java.io.*;
import java.util.Scanner;

public class IO {
    private File file;
    // 字符流
    private Reader reader;
    private Writer writer;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Scanner scanner = new Scanner(System.in); // 常用方法：next(), nextDateType(), nextLine()

    //字节流
    private InputStream is;
    private OutputStream os;
    private PrintStream ps = new PrintStream(System.out);

    // 控制台输入
    public void getCharFromConsole () throws IOException {
        int temp;
        String input = "";
        System.out.println("read()读取单个字符，q键退出。");
        while ( (temp = br.read()) > 0) {
            if ((char)temp != 'q') {
                input += (char)temp;
            } else {
                br.close();
                System.out.println(input);
            }
        }
    }
    public void getStringFromConsole() throws IOException {
        String input = "";
        System.out.println("请输入：");
        do {
            input = br.readLine();
            System.out.println(input);
        } while (!input.equals("end"));
    }
    // 控制台输出
    public void outToConsole (String content, char c) {
        ps.print(content);
    }
    // 字符流读写文件
    public String getInputFromFile (FileOperation fileOperation) throws IOException {
        String fileContent = "";
        is = new FileInputStream(fileOperation.getFile());
        // is = new FileInputStream(filePath);
        int num = 0;
        byte[] cache = new byte[1024];
        while ((num = is.read(cache)) != -1) {
            System.out.print(new String(cache, 0, num));
            fileContent += new String(cache, 0, num);
        }
        is.close();
        return fileContent;
    }
    public void outToFile_Cover (FileOperation fileOperation, String content) throws IOException {
        if (!fileOperation.isExists()) {
            fileOperation.makeDirectory();
            fileOperation.createFile();
        }
        os = new FileOutputStream(fileOperation.getFile());
        os.write(content.getBytes());
        os.close();
    }
    public void outToFile_Append (FileOperation fileOperation, String content) throws IOException {
        if (!fileOperation.isExists()) {
            fileOperation.makeDirectory();
            fileOperation.createFile();
        }
        os = new FileOutputStream(fileOperation.getFile(), true);
        os.write(content.getBytes());
        os.close();
    }
    // 字节流读写文件
    // 序列化
}
