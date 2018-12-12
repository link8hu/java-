/**
 * @program: ModelOfDesign
 * @description: 观察者模式：订阅与订阅者的故事 -- 订阅天气预报
 * @author: Mr.Hu
 * @create: 2018-11-30 22:38
 */
public class Main {
    public static void main(String[] args) {
        /*有三个用户订阅了天气变化*/
        Observer o1 = new Observer();
        Observer o2 = new Observer();
        Observer o3 = new Observer();
        Subject subject = new Subject();
        subject.setList(o1);
        subject.setList(o2);
        subject.setList(o3);
        subject.notifyObserver();

        subject.removeList(o1);
        subject.notifyObserver();
    }
}
