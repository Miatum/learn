package base02;

import java.io.Serializable;

/**
 * @Description
 * @ClassName Movie
 * @Author Miatum
 * @date 2021.03.25 23:18
 */
// extends子类继承父类
public class Movie extends Blog implements Cloneable, Serializable {
    private String resource_path;
    public void transcoding() {}

    @Override
    public void play() {
        System.out.println("the movie is playing...");
    }
}
