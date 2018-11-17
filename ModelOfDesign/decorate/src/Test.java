public class Test {
    public static void main(String[] args) {
        /***
         * 如果 都定义为Hero 则是装饰模式的透明模式，此模式下不能调用Shield和吸血剑BloodsuckingSword的技能，只能调用Hero的技能（函数）
         * 如果 定义成子类型 shield 和BloodsuckingSword 就成了半透明模式，此时可以发动子类装备的技能
         *
         *
         * */
        Hero gailun=new Arthur();
        Hero shield = new Shield(gailun);
        Hero sword =new BloodsuckingSword(shield);
        System.out.println("你的攻击力是"+sword.aggressiveNumber());
        System.out.println("你的技能是"+sword.skill());

    }


}
