/**
 * @program: ModelOfDesign
 * @description: 代理模式 -- 实现和装饰者 模式有些相似，但是两者目的不同
 * @author: Mr.Hu
 * @create: 2018-12-12 13:29
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy =new Proxy();
        proxy.setBrandName("惠普打印机");
        proxy.print("hello World");
    }
}
