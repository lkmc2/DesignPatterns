package TemplatePattern.CaffeineDemo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 咖啡因饮料（模板类，带钩子方法）
 */
public abstract class CaffeineBeverageWithHook {

    // 准备食谱（防止方法被重写）
    protected final void prepareRecipe() {
        boilWater(); // 煮沸水
        brew(); // 冲泡
        pourInCup(); // 把咖啡倒进杯子

        // 自定义是否添加调料
        if (customerWantsCondiments()) {
            addCondiments(); // 添加调味料
        }
    }

    // 冲泡
    protected abstract void brew();

    // 添加调味料
    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("煮沸水");
    }

    private void pourInCup() {
        System.out.println("把饮料倒进杯子");
    }

    // 自定义是否加调料（钩子方法的应用例子，钩子方法一般用来占位，让子类看情况重写）
    protected boolean customerWantsCondiments() {
        return true;
    }

}
