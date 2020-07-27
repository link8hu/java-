public class Client {

    public static void main(String[] args) {
        FlyWeight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate();
        FlyWeight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate();

        FlyWeight flyweightZ = FlyweightFactory.getFlyweight("X");
        flyweightZ.operate();

        }
}
