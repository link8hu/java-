package brush;

/**
 * @program: ModelOfDesign
 * @description: 粗蜡笔的实现
 * @author: Mr.Hu
 * @create: 2018-11-22 21:24
 */
public class BigBrush extends Brush {
    /*如果父类用的是构造函数实现两个类的组合，这里必须重写构造函数-显示调用Super(Color color)*/
    @Override
    public void pain() {
        System.out.println("正在使用粗蜡笔画"+this.color.color+"的线");
    }
}
