package base06;

import java.io.*;
import java.net.Socket;

/**
 * @Description
 * @ClassName Client socket客户端
 * @Author Miatum
 * @date 2021.04.08 15:42
 */
public class Client {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream infromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(infromServer);
            System.out.println("服务器响应：" + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
