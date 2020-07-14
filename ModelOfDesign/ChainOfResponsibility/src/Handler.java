public abstract class Handler {
    public Handler next;
    public abstract void handel();

    public void filter(){
        handel();

        if (next != null){
            next.filter();
        }
    }

    public static void main(String[] args) {
        Handler time = new TimeFilter();
        Handler group = new GroupFilter();

        time.next = group;

        time.filter();
    }
}
