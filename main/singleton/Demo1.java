package singleton;

public class Demo1 {
    private Demo1() {
    }

    private static Demo1 demo1;
    public static Demo1 getInstance(){
        if (demo1 == null) {
            return new Demo1();
        }
        return demo1;
    }
}
