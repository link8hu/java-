import java.text.NumberFormat;

/**
 * @program: ModelOfDesign
 * @description: 模板模式
 * @author: Mr.Hu
 * @create: 2018-11-25 22:22
 */
public class Main {
    /***
     * 模板模式 有一个抽象类父类比如（登录qq），定义了子类需要实现的接口(开机、联网、登录)和操作步骤--登录qq方法（先开机，再联网，再打开qq登录）
     * 不同操作系统的设备（手机、mac电脑、Windows电脑）分别实现自己的开机方法、联网方法、打开qq登录方法等
     * 主函数直接调用父类的登录qq方法就好了
     * 意图：
     *      定义一个操作算法的骨架，将一些步骤交给子类具体实现。可以不改变算法结构而改变步骤实现方法。
     *      适用于那些高层次上实现相同比如登录不同数据库的步骤，但是具体实现如：每个步骤不同数据库实现不同。
     * 优点：
     *      减少代码冗余
     *
     * 生活举例：
     *      火车站买票，步骤都一样（进站 去购票大厅，安检 进候车室，安检 上火车）但是不同火车站实际每个步骤实现有差别（有的候车厅在一起，有的按高铁、普通火车分开有的...）
     * 使用情况：
     *       模板模式是在做一件事情时，宏观步骤都相同，但是不同事物的具体步骤实现方法不同，--每个步骤都需要判断具体执行对象，执行不同方法
     *       策略模式：（只有一个步骤需要判断对象时）
     */
}
