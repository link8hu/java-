/**
 * @program: ModelOfDesign
 * @description: 原型模式的浅克隆
 * @author: Mr.Hu
 * @create: 2018-11-18 21:02
 */

/**
 * 拓展cloneable() 实现的是浅拷贝
 * 实现深克隆：1.覆盖object的clone()方法（如果引用类型里面还包含很多引用类型，或者内层引用类型的类里面又包含引用类型，使用clone方法就会很麻烦。这时我们可以用序列化的方式来实现对象的深克隆。）
 *           2.使用序列化的方式
 *           Java语言提供的Cloneable接口和Serializable接口的代码非常简单，它们都是空接口，这种空接口也称为标识接口，标识接口中没有任何方法的定义，其作用是告诉JRE这些接口的实现类是否具有某个功能，如是否支持克隆、是否支持序列化等。
 */
public class Proto {
    public static void main(String[] args) {
        HomeWork homeWork1 = new HomeWork();
        homeWork1.setCouse("高数");
        homeWork1.setTime(1);
        System.out.println("--------homework1-------");
        System.out.println(homeWork1.toString());
        HomeWork homeWork2 =homeWork1.clone();
        System.out.println("--------homework2-------");
        System.out.println(homeWork2.toString());
        System.out.println("接下来开始判断");
        System.out.print("判断是否是同一对象：");
        System.out.println(homeWork1 == homeWork2);
        System.out.print("判断是否是浅拷贝：");
        System.out.println(homeWork1.couse == homeWork2.couse);

    }
}
