/**
 * @program: ModelOfDesign
 * @description: 打印机实体
 * @author: Mr.Hu
 * @create: 2018-12-12 13:33
 */
public class Print implements Printable {
    String brandName ;

    public Print(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }
    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void print(String str) {
        System.out.println("==== "+brandName+" ====");
        System.out.println(str);
    }
}
