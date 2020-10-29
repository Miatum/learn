package JavaIO;
import java.io.*;
/**
 * 使用FileReader、FileWriter可以实现文本文件的复制
 * 对于非文本文件（视频文件、音频文件、图片），只能使用字节流
 */
public class FileRead {
    //字节流
    InputStream is;
    OutputStream os;
    public void ByteRead(String path_from , String path_to) throws IOException {
        is = new FileInputStream(path_from);
        //如果路径path_to不存在，FileOutputStream会自动创建文件
        os = new FileOutputStream(path_to);
        byte[] buf = new byte[4];
        int hasRead = 0;
        try{
            //is.read(buf) ==> is.read(buf,0,buf.length),返回值为buf.length
            while ((hasRead = is.read(buf)) > 0){
                os.write(buf,0,hasRead);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
    }
    //字符流
    Reader reader;
    Writer writer;
    public void CharRead(String path_from , String path_to) throws IOException{
        try {
            File file_from = new File(path_from);
            reader = new FileReader(file_from);
            File file_to = new File(path_to);
            writer = new FileWriter(path_to);
            char[] temp = new char[(int)file_from.length()];
            int size = reader.read(temp);
            writer.write(temp);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            reader.close();
            writer.close();
        }
    }
}
