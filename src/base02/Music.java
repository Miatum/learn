package base02;

/**
 * @Description
 * @ClassName Music
 * @Author Miatum
 * @date 2021.03.25 23:18
 */
// extends子类继承父类
public class Music extends Blog {
    private String resource_path;
    public void transcoding() { }

    @Override
    public void play() {
        System.out.println("the music is playing...");
    }

    // 多态方法在
    public void showContent() {
        System.out.println("this Music's content is: " + this.content);
    }
}
