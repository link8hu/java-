/**
 * @program: ModelOfDesign
 * @description: 身份证实体
 * @author: Mr.Hu
 * @create: 2018-11-21 21:17
 */
public class IdCard {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
