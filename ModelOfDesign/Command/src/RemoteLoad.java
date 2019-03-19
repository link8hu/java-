import Thing.AirCondition;
import Thing.DVD;

/**
 * @program: ModelOfDesign
 * @description: 命令模式典型：遥控器
 * 引入了第三方可以记录命令执行，实现撤销动作,实现了将动作封装为对象，这样我们就可以存储（做成日志以便回滚）、传递、调用它们。
 * @author: Mr.Hu
 * @create: 2019-03-19 11:47
 */
public class RemoteLoad {

    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        DVD dvd=new DVD();                                  //实例
        AirCondition airCondition=new AirCondition();

        DvDCommandOn dvDCommandOn=new DvDCommandOn(dvd);            //命令实例（第三方）实现命令发出者和执行者隔离
        DvDCommandOff dvDCommandOff=new DvDCommandOff(dvd);
        AirConCommanOn airConCommanOn=new AirConCommanOn(airCondition);
        AirConCommanOff airConCommanOff=new AirConCommanOff(airCondition);

        remoteControl.setCommandS(0,dvDCommandOn);          //命令实例绑定遥控按键
        remoteControl.setCommandS(1,dvDCommandOff);
        remoteControl.setCommandS(2,airConCommanOn);
        remoteControl.setCommandS(3,airConCommanOff);

        for (int i = 0; i < 4; i++) {               //测试
            remoteControl.pressButtom(i);
        }
        remoteControl.undoButton();
    }
}
