public class Free extends StorageState {

    @Override
    public void occupyCheck() {
        System.out.println("检查通过");
        super.context.setStorageState(Context.preOccupy);
    }

    @Override
    public void occupy() {
        //不合法
    }

    @Override
    public void freeCheck() {
        //不合法
    }

    @Override
    public void free() {
        //本来就空闲
    }
}
