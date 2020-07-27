public class ConcreteFlyweight extends FlyWeight{
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }
//根据外部状态业务逻辑处理
    @Override
    public void operate() {
        System.out.println("得到" + extrinsic + "的内部状态" + intrinsic);
    }
}
