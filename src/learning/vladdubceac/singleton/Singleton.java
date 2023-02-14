package learning.vladdubceac.singleton;

public class Singleton {

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    private static class SingletonHelper{
        // Nested class is referenced after getInstance() is called
        private static final Singleton UNIQUE_INSTANCE = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonHelper.UNIQUE_INSTANCE;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData(){
        return data;
    }
}
