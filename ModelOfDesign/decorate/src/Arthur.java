/**
 * 具体构建者 --盖伦英雄
 */
public class Arthur implements Hero {
    @Override
    public int aggressiveNumber() {
        return 10;
    }

    @Override
    public String skill() {
        return "普攻";
    }
}
