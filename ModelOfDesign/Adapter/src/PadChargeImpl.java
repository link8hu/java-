/**
 * @program: ModelOfDesign
 * @description: pad自带香港充电器接口实现
 * @author: Mr.Hu
 * @create: 2018-11-26 20:41
 */
public class PadChargeImpl implements PadCharge {
    @Override
    public void charge() {
        System.out.println("香港充电接口连接成功，我正在给pad充电");
    }
}
