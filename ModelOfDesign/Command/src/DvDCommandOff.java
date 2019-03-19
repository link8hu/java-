import Thing.DVD;

/**
 * @program: ModelOfDesign
 * @description: DVD命令对象（中间人）  关机按键
 * @author: Mr.Hu
 * @create: 2019-03-19 15:57
 */
public class DvDCommandOff implements CommandI {
    private DVD d;

    public DvDCommandOff(DVD d) {
        this.d = d;
    }

    @Override
    public void execute() {
        d.off();
    }

    @Override
    public void undo() {
        d.on();
        d.setCD();
        d.setVol();
    }
}
