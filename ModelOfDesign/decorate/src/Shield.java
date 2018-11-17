/**
 * 父类实现了有参数的构造函数，则默认无参构造函数自动消失，子类则必须实现构造函数且显示调用父类构造方法
 * 创建子类对象前，会先创建父类对象，所以子类构造函数必选显示调用super()
 * 之前不显示调用，是因为系统默认在子类构造函数中调用父类无参构造函数
 * 本工程的的Shield和BloodsuckingSword 实现了两种调用父类构造函数的方法
 * Shield采用系统默认调用（为此我特地补充了父类的无参构造函数）
 */

public class Shield extends Decorate {
    private Hero hero;
    private int num =0;
    private String ki ="防御";

    public Shield(Hero hero) {
        this.hero=hero;
    }
    @Override
    public int aggressiveNumber() {
        return hero.aggressiveNumber()+num;
    }

    @Override
    public String skill() {
        return hero.skill()+ki;
    }
}
