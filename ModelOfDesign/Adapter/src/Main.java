/**
 * @program: ModelOfDesign
 * @description: 适配器模式
 * 现实中：
 *      很多同学买了香港的pad，发现充电口(接口)不适配，他们需要购买(创建)转接器(适配器)。
 * 本实例：
 *      pad自带香港接口充电器：
 *      中国大陆标准充电口：
 *      购买的转接口(适配器):
 *
 *注意：：：：：
 * ：：：：注释掉得实现的方式是委托
 * ：：：：现在的实现方式是使用继承的适配器
 * @author: Mr.Hu
 * @create: 2018-11-26 20:15
 */
public class Main {
    public static void main(String[] args) {
        /*拿出pad充电器*/
        PadCharge padCharge =new PadChargeImpl();
        /*连上适配器*/
       // AdaPter adaPter =new AdaPter(padCharge);
        AdaPter adaPter =new AdaPter();
        /*使用适配器*/
        adaPter.charge();
    }
}
