import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: ModelOfDesign
 * @description: 代理模式 -- 实现和装饰者 模式有些相似，但是两者目的不同
 * 这里我使用了两种方法 1.静态代理  Proxy类就是具体实现
 * 2. 动态代理 ：即JDK的动态代理，是通过一个叫Proxy的类的静态方法newProxyInstance来实现的
 *
 * @author: Mr.Hu
 * @create: 2018-12-12 13:29
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //保存动态生成的代理类字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        byte[]classFile = ProxyGenerator.generateProxyClass("Proxy0",ProxyFactory.class.getInterfaces());
        File file =new File("../Proxy0.class");
        FileOutputStream fos =new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();

        /***********静态代理**********/
        Proxy1 proxy =new Proxy1();
        proxy.setBrandName("惠普打印机");
        proxy.print("hello World");
        /**********动态代理************/
        //目标对象
        Print print =new Print("杂牌");
        System.out.println(print.getClass());
        //创建代理对象
        Printable proxy1 = (Printable)new ProxyFactory(print).getProxyInstance();
        proxy1.print("dong态代理");
    }
}
