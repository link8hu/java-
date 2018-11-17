/**
 * 抽象装饰者  --作为抽象类  所有技能默认返回英雄本身技能  等待具体装饰者重写
 */
public abstract class Decorate implements Hero {

    private Hero hero;

    public Decorate() {
    }

    public Decorate(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int aggressiveNumber() {
        return hero.aggressiveNumber();
    }

    @Override
    public String skill() {
        return hero.skill();
    }
}
