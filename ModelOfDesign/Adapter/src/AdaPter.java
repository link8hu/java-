/**
 * @program: ModelOfDesign
 * @description: 我是电源标准转换器
 * @author: Mr.Hu
 * @create: 2018-11-26 20:45
 */
public class AdaPter implements ChinaCharge{
    /**
     *适配器先实现中国标准的接口，这样才能供电。
     * 然后提供一个本身的功能（属性）pad充电口 padCharge放在构造函数里面，代表生产时要确定转换成哪种标准
     */
    /*将国标供电口转换为香港标准*/
    PadCharge padCharge=null;
    AdaPter(PadCharge padCharge){
        this.padCharge=padCharge;
    }

    @Override
    public void charge() {
        padCharge.charge();
    }

}
