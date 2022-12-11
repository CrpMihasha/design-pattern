package singleton;

public class Demo2 {
    private Demo2() {
    }

    private static Demo2 demo2;
    public synchronized static Demo2 getInstance(){
        if (demo2 == null) {
            return new Demo2();
        }
        return demo2;
    }
}
