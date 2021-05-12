package base02;
public interface BlogInterface {
    // 接口中可以有成员变量
    int id = 1;
    // 接口中的方法都是抽象方法
    Blog init();
    void showContent();
    void play();
}
