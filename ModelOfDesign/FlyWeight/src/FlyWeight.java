/**
 * 说到享元模式，第一个想到的应该就是池技术了，String常量池、数据库连接池、缓冲池等等都是享元模式的应用，所以说享元模式是池技术的重要实现方式。
 * 享元模式（Flyweight），运用共享技术有效地支持大量细粒度的对象。
 *
 * Flyweight是抽象享元角色。它是产品的抽象类，同时定义出对象的外部状态和内部状态（外部状态及内部状态相关内容见后方）的接口或实现；
 * ConcreteFlyweight是具体享元角色，是具体的产品类，实现抽象角色定义的业务；
 * UnsharedConcreteFlyweight是不可共享的享元角色，一般不会出现在享元工厂中；
 * FlyweightFactory是享元工厂，它用于构造一个池容器，同时提供从池中获得对象的方法。
 *
 * 其中内部状态指可以共享出来的 不会随环境改变而改变；
 */
public abstract class FlyWeight {
//内部状态
public String intrinsic;
//外部状态
protected final String extrinsic;
//要求享元角色必须接受外部状态

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }
    //定义业务操作
 public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
