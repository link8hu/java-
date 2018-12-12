/**
 * @program: ModelOfDesign
 * @description: 用户的设备
 * @author: Mr.Hu
 * @create: 2018-11-30 22:43
 */
public class Observer {
    public void update(Subject subject){
        System.out.println("设备开始获取变化后的天气");
        System.out.println(subject.getForecast());
    }
}
