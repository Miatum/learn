package base02;

import java.util.Date;

/**
 * @Description
 * @ClassName 抽象类Blog
 * @Author Miatum
 * @date 2021.03.25 23:16
 */
public abstract class Blog implements BlogInterface{
    public int id;
    public String title;
    public Date date;
    public String author;
    public String content;
    public int state;
    public String stateName;
    // 状态枚举类
    enum StateEnum {
        NEW(0, "新建"), PRIVATE(1, "保密"), PUBLIC(2, "公开");
        int stateId;
        String stateName;
        StateEnum(int stateId, String stateName) {
            this.stateId = stateId;
            this.stateName = stateName;
        }
        public String findName(int id) {
            for (StateEnum s : StateEnum.values()) {
                if (id == s.stateId) {
                    this.stateName = s.stateName;
                    break;
                }
            }
            return this.stateName;
        }
    }
    // 构造方法的overload
    public Blog(){}
    public Blog(int id, String title, Date date, String author, String content, int state) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.author = author;
        this.content = content;
        this.state = state;
        this.stateName = StateEnum.NEW.findName(this.state);
    }
    // 初始化方法的overload
    public Blog init() {
        return null;
    }
    public void init(int id, String title, Date date, String author, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.author = author;
        this.content = content;
    }
    // 多态
    public void showContent() {
        System.out.println("父类中该方法没有实际意义，主要是在子类中的不同实现");
    }
    // 抽象方法
    public abstract void play();
}
