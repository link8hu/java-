/**
 * @program: ModelOfDesign
 * @description: 遥控器
 * @author: Mr.Hu
 * @create: 2019-03-19 16:19
 */
public class RemoteControl {
    CommandI[] commandS;
    CommandI cLast;
    public RemoteControl(){
        commandS =new CommandI[4];   //支持4个按键
    }
    public void setCommandS(int slot,CommandI c){   //设置按键
        commandS[slot] =c;
    }
    public void pressButtom(int slot){          //按下按键
        commandS[slot].execute();
        cLast=commandS[slot];
    }
    public void undoButton(){       //按下撤销
        cLast.undo();
    }
}
