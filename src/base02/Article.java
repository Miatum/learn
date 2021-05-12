package base02;

import java.util.Date;

/**
 * @Description
 * @ClassName article
 * @Author Miatum
 * @date 2021.03.25 23:18
 */
// extends子类继承父类
public class Article extends Blog {
    public void print() {
        System.out.println(this.id);
    }
    public Article(int id, String title, Date date, String author, String content, int state) {
        super(id, title, date, author, content, state);
    }
    @Override
    // 多态，父类方法在子类中的不同实现
    public void showContent() {
        System.out.println("this article's content is: " + this.content);
    }
    @Override
    public void play() {
        System.out.println("the record of article is playing.");
    }
}
