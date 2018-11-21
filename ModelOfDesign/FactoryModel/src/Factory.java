import java.util.ArrayList;
import java.util.List;

/**
 * @program: ModelOfDesign
 * @description: 全国身份证生产基地
 * @author: Mr.Hu
 * @create: 2018-11-21 21:09
 */
public class Factory {
    /*注册生产后的身份证，防止假冒身份证*/
    private static final List<IdCard> listOfTrue = new ArrayList<>();
    /***
    * @Description: 制造身份证
    * @Param: [name]
    * @return: IdCard
    * @Author: Mr.Hu
    * @Date: 21:34
    */
    private IdCard creat(String name){
        System.out.println(name+"的身份证制造中。。。");
        IdCard idCard= new IdCard();
        idCard.setName(name);
        idCard.setNumber((int)(10000+Math.random()*100000));
        return idCard;
    }
    /***
    * @Description: 注册身份证
    * @Param: [idCard]
    * @return: void
    * @Author: Mr.Hu
    * @Date: 21:35
    */
    private void regist(IdCard idCard){
        listOfTrue.add(idCard);
        System.out.println(idCard.toString()+"身份证注册完成");
    }
    /***
    * @Description: 身份证件生产工厂
    * @Param: [name]
    * @return: IdCard
    * @Author: Mr.Hu
    * @Date: 21:36
    */
    public static IdCard getIdCard(String name){
            Factory factory =new Factory();
            IdCard idCard=factory.creat(name);
            factory.regist(idCard);
            return idCard;
    }
    /***
    * @Description: 身份证真假认证
    * @Param: [idCard]
    * @return: boolean
    * @Author: Mr.Hu
    * @Date: 21:43
    */
    public static boolean confirm (IdCard idCard){
        return listOfTrue.contains(idCard);
    }

}
