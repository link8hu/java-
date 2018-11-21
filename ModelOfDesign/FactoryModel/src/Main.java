/**
 * @program: ModelOfDesign
 * @description: 工厂模式实例--身份证的申请与生产分离（现实世界中去公安局申请注册身份证，由工厂统一注册生产：好处--即使身份证具体制造流程改变（工厂类中的逻辑实现）,或者身份证换代升级（IDCard类名及函数改变）公安局也无需更改变更。实现了两者的解耦
 * 本模式适用于解耦 -- 相当于创建实例对象的new
 * 本实现可以在Factory和IDcard上再抽象一层，factory可以变为生产各种卡片的工厂并抽象实现出相同部分（先生产再注册的逻辑）
 * @author: Mr.Hu
 * @create: 2018-11-21 21:37
 */
public class Main {
    public static void main(String[] args) {
        IdCard idCard=Factory.getIdCard("胡新帅");

        System.out.println("身份证验证中:");
        if(Factory.confirm(idCard)) System.out.println("真身份证");
        else System.out.println("假的身份证");
    }
}
