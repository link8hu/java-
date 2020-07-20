/**
 * 本次以库位的状态变化为例子，讲解状态模型
 * 库位起初是空闲状态，想要放商品时检查库位能否容下（此时预占用状态），可以容下就占用库位（占用状态）
 * 释放时类似: 占用 ——》 欲释放 ———》空闲
 */
public abstract class StorageState {
    Context context ;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void occupyCheck();

    public abstract void occupy();

    public abstract void freeCheck();

    public abstract void free();
}
