package base01;

import java.io.File;
import java.io.IOException;
public class FileOperation {
    private File file;
    public FileOperation(String filePath) {
        file = new File(filePath);
    }
    public boolean isExists() {
        return file.exists();
    }
    // 创建一个文件夹和他的所有父文件夹
    public void makeDirectory() {
        file.mkdirs();
    }
    public void createFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void deleteFile() {
        file.delete();
    }
    public File getFile() {
        return file;
    }
    public String getSpace() {
        return file.getTotalSpace() / (1024 * 1024 *1024) + "G";
    }
    public String getName() {
        return file.getName();
    }
    public String getParent() {
        return file.getParent();
    }
}
