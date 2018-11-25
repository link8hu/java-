public class Singleton {
    private  static  final Singleton sing =new Singleton();
    private Singleton(){
        System.out.println("helloWorld");
    }
    public static Singleton getInstance(){
        return sing;
    }
}

 class main{
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        if(s1==s2) System.out.println("同一个对象");
        else System.out.println("两个对象");
    }
}
