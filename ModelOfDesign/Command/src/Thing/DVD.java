package Thing;

/**
 * @program: ModelOfDesign
 * @description: DVD播放器
 * @author: Mr.Hu
 * @create: 2019-03-19 15:09
 */
public class DVD {
    public void on(){
        System.out.println("DVD开机");
    }
    public void setCD(){
        System.out.println("DVD放入碟片");
    }
    public void setVol(){
        System.out.println("DVD调整音量");
    }

    public void off() {
        System.out.println("DVD关机");
    }
}
