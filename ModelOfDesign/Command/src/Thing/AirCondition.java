package Thing;

/**
 * @program: ModelOfDesign
 * @description: 空调实现
 * @author: Mr.Hu
 * @create: 2019-03-19 15:15
 */
public class AirCondition {
    public void on(){
        System.out.println("空调打开");
    }
    public void setAuto(){
        System.out.println("空调自动模式");
    }
    public void upTemperature(){
        System.out.println("空调上调温度");
    }
    public void downTemperature(){
        System.out.println("空调下调温度");
    }
    public void off(){
        System.out.println("空调关机");
    }
}
