/**
 * @program: ModelOfDesign
 * @description: 匿名内部类demo
 * @author: Mr.Hu
 * @create: 2018-11-18 16:25
 */

import javax.imageio.stream.MemoryCacheImageInputStream;

/**
 * 匿名内部类直接new的接口或者抽象类，没有类名---》无法定义构造器
 *内部类比外部类可以多用三个修饰符： private protected static
 */
interface report{
    public int  NumOfPeople();
}
public class Anonymous {
    private void getNum(report report){
        System.out.println("今年公司一共"+report.NumOfPeople()+"人");
    }
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.getNum( new report(){
            @Override
            public int NumOfPeople() {
                return 100;
            }
        });

    }
}

class hello { }
/* 以下报错
private class hello {}
*/