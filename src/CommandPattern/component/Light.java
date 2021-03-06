package CommandPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 灯泡
 */
public class Light {
    private String name; // 地点名

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    // 开灯
    public void on() {
        System.out.println("已开灯");
    }

    // 关灯
    public void off() {
        System.out.println("已关灯");
    }

}
