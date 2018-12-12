/**
 * @program: ModelOfDesign
 * @description: 代理类
 * @author: Mr.Hu
 * @create: 2018-12-12 13:35
 */
public class Proxy implements Printable {
    private Print print;
    private String name;
    @Override
    public void setBrandName(String brandName) {
        if (print != null) print.setBrandName(name);
        name = brandName;
    }

    @Override
    public String getBrandName() {
        return name;
    }

    @Override
    public void print(String str) {
        realized();
        print.print(str);

    }
    private synchronized void realized(){
        if (print == null)  print = new Print(name);
        return;
    }
}
