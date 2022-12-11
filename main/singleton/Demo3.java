package singleton;

public class Demo3 {
    private Demo3() {
    }

    private static volatile Demo3 demo3;
    public static Demo3 getInstance(){
        if (demo3 == null) {
            synchronized (Demo3.class) {
                if(demo3 == null) {
                    demo3 = new Demo3();
                }
            }
        }
        return demo3;
    }
}
