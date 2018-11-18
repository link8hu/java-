/**
 * @program: ModelOfDesign
 * @description: 等待克隆对象
 * @author: Mr.Hu
 * @create: 2018-11-18 21:06
 */
public class HomeWork implements Cloneable{
    String couse;             //作业名
    int time;                 //作业提交时间


/***实现克隆方法******/
    public HomeWork clone(){
        HomeWork a = null;
        try {
            a = (HomeWork) super.clone();
        } catch (CloneNotSupportedException e) {
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
