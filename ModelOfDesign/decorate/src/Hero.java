/**
 * 本类是最基础的接口
 * 无论是具体构建者还是抽象装饰者都是实现这个类
 *
 * 构建者就是各种英雄
 * 装饰者就是各种武器
 */
public interface Hero {
    public int aggressiveNumber();

    public String skill();
}
