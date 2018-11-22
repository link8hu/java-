import brush.BigBrush;
import brush.Brush;
import color.Red;

/**
 * @program: ModelOfDesign
 * @description: 桥接模式的实现
 * 桥接模式 适合解决的问题：两个抽象类差别很大（可以说是两个维度的事：粗细蜡笔和颜色）的组合 在蜡笔类里面组合使用颜色类
 * 桥接模式 在jdk中的典型应用是JDBC驱动程序 -- 将抽象与实现分离 所以两者可以很好地独立的变化
 * 桥接模式 Vs 适配器模式
 * 当我们先拿到两个模块再组合 -- 适配器
 * 如果什么都没有 但是想分开实现 --桥接
 * **********名词解析********
 * 抽象：依赖于抽象方法的类   --比如Brush依赖Color抽象类
 * @author: Mr.Hu
 * @create: 2018-11-22 21:39
 */
public class Main {
    public static void main(String[] args) {
        //先拿起笔
        Brush b =new BigBrush();
        //再选择颜色
        b.setColor(new Red());
        //最后画画
        b.pain();
    }
}
