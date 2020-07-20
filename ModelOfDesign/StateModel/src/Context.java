public class Context {

    public static final StorageState  free      = new Free();
    public static final StorageState  preOccupy = new preOccupy();
    public static final StorageState  occupy    = new Occupy();
    public static final StorageState  preFree   = new PreFree();

    private StorageState storageState;

    public StorageState getStorageState() {
        return storageState;
    }

    public void setStorageState(StorageState storageState) {
        this.storageState = storageState;
    }


    public void occupyCheck() {
        this.storageState.occupyCheck();
    }

    public void occupy() {
        this.storageState.occupy();
    }

    public void freeCheck() {
        this.storageState.freeCheck();
    }

    public void free() {
        this.storageState.free();
    }

}
