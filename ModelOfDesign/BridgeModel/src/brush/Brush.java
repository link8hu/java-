package brush;

import color.Color;

/**
 * @program: ModelOfDesign
 * @description: 蜡笔的抽象类 -- 这里接入了颜色类-实现了更换颜色的函数  桥接模式
 * 桥接模式 vs 装饰者模式
 * 装饰者模式的抽象或具体装饰者 必须全部实现主体（构建者）的所有方法并加以改造
 * 桥接模式两个类基本不相关 比如这里的蜡笔和颜色 只是在某一个类里组合了另一个类 （传统是写继承，而桥接模式用的是复合）继承容易造成类膨胀 粗细两种笔 * 12种颜色 =24类
 *
 * @author: Mr.Hu
 * @create: 2018-11-22 21:06
 */
public abstract class Brush {
    //颜色
    protected Color color;
    //子类实现绘画
    public abstract void pain();
    //具体实现颜色的改变 -- 可以使用构造函数或者set()方法  (使用set的方法代表换颜色不用换笔  使用构造代表新笔新颜色）
//    public Brush(Color color){
//        this.color= color;
//    }
    public void setColor(Color color){
        this.color=color;
    }

}
