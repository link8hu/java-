/**
 * 具体装饰者 --吸血剑
 */

public class BloodsuckingSword extends Decorate{
    private int num =10;
    private String ki ="吸血";

    public BloodsuckingSword(Hero he) {
        super(he);
    }
    @Override
    public int aggressiveNumber() {
        return super.aggressiveNumber()+num;
    }

    @Override
    public String skill() {
        return super.skill()+ki;
    }
}
