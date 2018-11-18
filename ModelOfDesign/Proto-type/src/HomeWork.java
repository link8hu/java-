import java.io.*;

/**
 * @program: ModelOfDesign
 * @description: 等待克隆对象
 * @author: Mr.Hu
 * @create: 2018-11-18 21:06
 */
public class HomeWork implements Cloneable , Serializable{
    private static final long serialVersionUID = 7362717931684462047L;
    String couse;             //作业名
    int time;                 //作业提交时间


    /***实现浅克隆方法******/
    public HomeWork clone(){
        HomeWork a = null;
        try {
            a = (HomeWork) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return a;
    }
    /***实现深克隆方法******/
    public HomeWork DeepClone(){
        HomeWork a = null;
        try {
            /**将对象序列化成流 而序列化时原对象仍在jVM中，所以利用这个特性可以实现深度拷贝**/
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oot =new ObjectOutputStream(bao);
            oot.writeObject(this);
            //将流序列化成对象
            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream obi = new ObjectInputStream(bai);
            a = (HomeWork) obi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a;
    }

    public String getCouse() {
        return couse;
    }

    public void setCouse(String couse) {
        this.couse = couse;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "家庭作业{" +
                "课程名='" + couse + '\'' +
                ", 截止日期=" + time +
                "号}";
    }
}
