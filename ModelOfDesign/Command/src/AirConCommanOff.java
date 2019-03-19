import Thing.AirCondition;

/**
 * @program: ModelOfDesign
 * @description: 空调命令对象 关机按键
 * @author: Mr.Hu
 * @create: 2019-03-19 15:56
 */
public class AirConCommanOff implements CommandI{
    private AirCondition air;
    /***
     * 构造函数传入 代表这个对象只使用一个空调
     * 定义为static并初始化 代表这个类（所有对象）只服务这一个空调
     * 使用set 方法传入代表此命令可以重复使用
     */
    public AirConCommanOff(AirCondition a) {
        this.air=a;
    }

    @Override
    public void execute() {
        air.off();

    }

    @Override
    public void undo() {
        air.on();
        air.setAuto();
    }
}
