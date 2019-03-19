/**
 * @program: ModelOfDesign
 * @description: 原型模式的浅克隆
 * 原型模式的工作原理很简单：将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝自己来实现创建过程。由于在软件系统中我们经常会遇到需要创建多个相同或者相似对象的情况，因此原型模式在真实开发中的使用频率还是非常高的。原型模式是一种“另类”的创建型模式，创建克隆对象的工厂就是原型类自身，工厂方法由克隆方法来实现。
 *
 * 需要注意的是通过克隆方法所创建的对象是全新的对象，它们在内存中拥有新的地址，通常对克隆所产生的对象进行修改对原型对象不会造成任何影响，每一个克隆对象都是相互独立的。通过不同的方式修改可以得到一系列相似但不完全相同的对象。
 * @author: Mr.Hu
 * @create: 2018-11-18 21:02
 */

/**
 * 拓展cloneable() 实现的是浅拷贝
 * 实现深克隆：1.覆盖object的clone()方法（如果引用类型里面还包含很多引用类型，或者内层引用类型的类里面又包含引用类型，使用clone方法就会很麻烦。这时我们可以用序列化的方式来实现对象的深克隆。）
 *           2.使用序列化的方式  （序列化就是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中。通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此通过序列化将对象写到一个流中，再从流里将其读出来，可以实现深克隆。需要注意的是能够实现序列化的对象其类必须实现Serializable接口，否则无法实现序列化操作。）
 *           Java语言提供的Cloneable接口和Serializable接口的代码非常简单，它们都是空接口，这种空接口也称为标识接口，标识接口中没有任何方法的定义，其作用是告诉JRE这些接口的实现类是否具有某个功能，如是否支持克隆、是否支持序列化等。
 */
public class Proto {
    private void test(HomeWork homeWork1,HomeWork homeWork2){
        System.out.println("--------homework1-------");
        System.out.println(homeWork1.toString());
        System.out.println("--------homework2-------");
        System.out.println(homeWork2.toString());
        System.out.println("接下来开始判断");
        System.out.print("判断是否是同一对象：");
        System.out.println(homeWork1 == homeWork2);
        System.out.print("判断是否是浅拷贝：");
        System.out.println(homeWork1.couse == homeWork2.couse);
    }
    public static void main(String[] args) {
        Proto proto =new Proto();
        HomeWork homeWork = new HomeWork();
        homeWork.setCouse("高数");
        homeWork.setTime(1);
        /**进行浅深克隆****/
        HomeWork homeWork1 =homeWork.clone();
        HomeWork homeWork2 =homeWork.DeepClone();
        proto.test(homeWork,homeWork1);
        proto.test(homeWork,homeWork2);
    }
}
