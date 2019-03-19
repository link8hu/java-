import Thing.DVD;

/**
 * @program: ModelOfDesign
 * @description: DVD命令中间人
 * @author: Mr.Hu
 * @create: 2019-03-19 15:34
 */
public class DvDCommandOn  implements CommandI{
    private DVD d;

    public DvDCommandOn(DVD d) {
        this.d = d;
    }

    @Override
    public void execute() {
        d.on();
        d.setCD();
        d.setVol();
    }

    @Override
    public void undo() {
        d.off();
    }
}
