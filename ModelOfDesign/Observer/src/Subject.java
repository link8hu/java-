import java.util.ArrayList;
import java.util.List;

/**
 * @program: ModelOfDesign
 * @description: 天气预报站
 * @author: Mr.Hu
 * @create: 2018-11-30 22:42
 */
public class Subject {
    private List<Observer> list = new ArrayList<>();
    /***
    * @Description: 获取现在天气
    * @return: java.lang.String
    * @Author: Mr.Hu
    * @Date: 22:46
    */
    public String getForecast(){
        return "今天天气很好";
    }
    /***
    * @Description: 增加订阅者
    * @Author: Mr.Hu
    * @Date: 22:47
    */
    public void setList(Observer observer){
        list.add(observer);
        System.out.println(list.size()+"个用户订阅了天气预报");
    }
    /***
    * @Description: 移除某个observer订阅者
    * @Author: Mr.Hu
    * @Date: 22:49
    */
    public void removeList(Observer observer){
        list.remove(observer);
        System.out.println("移除了一个用户，还剩下"+list.size()+"个用户订阅了天气预报");
    }
    /***
    * @Description: notifyObserver通知用户天气更新了
    * @Author: Mr.Hu
    * @Date: 22:55
    */
    public void notifyObserver(){
        System.out.println("开始通知每个设备更新信息");
        for (Observer ob:list
             ) {
            ob.update(this);
        }
    }
}
