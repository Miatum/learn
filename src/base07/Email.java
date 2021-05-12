package base07;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * @Description 有错误，此方法暂未实现
 * @ClassName Email
 * @Author Miatum
 * @date 2021.04.08 16:30
 */
public class Email {
    public static void main(String[] args) {
        String to = "zhoumq@pvirtech.com";
        String from = "443398600@qq.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("this is the Subject lien");
            message.setText("this is the actual message");
            Transport.send(message);
            System.out.println("Send Email successfully");
        } catch (MessagingException mse) {
            mse.printStackTrace();
        }
    }
}
