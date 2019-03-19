import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: ModelOfDesign
 * @description: 动态代理：动态代理不需要实现接口,但是需要指定接口类型
 * @author: Mr.Hu
 * @create: 2018-12-12 16:32
 */
public class ProxyFactory implements InvocationHandler{
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始事务");
        //执行目标方法
        Object returnValue = method.invoke(target,args);
        System.out.println("提交事务");
        return returnValue;
    }
}
