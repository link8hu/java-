import java.util.HashMap;
import java.util.Random;

public class FlyweightFactory {
    private static HashMap<String, FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyweight(String Extrinsic){
        FlyWeight result = null;

        if (pool.containsKey(Extrinsic)){
            result = pool.get(Extrinsic);
            System.out.print("池中已有***");
        }else {
            result = new ConcreteFlyweight(Extrinsic);
            Random random = new Random(10);
            result.setIntrinsic(random.toString());
            pool.put(Extrinsic,result);
            System.out.print("新创建***");
        }
        return result;
    }
}
