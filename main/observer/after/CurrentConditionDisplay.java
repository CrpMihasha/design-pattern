package observer.after;

public class CurrentConditionDisplay implements Observers{

    /**
     * 这里在观察者中定义一个主题成员，可以在初始化观察者时，直接订阅主题
     */
    private Subject subject;

    /**
     * 入参如此定义不利于扩展，应该定义一个接口对象，如果后续气象站的参数有变化，可以不用修改接口
     */
    @Override
    public void update(Float temp, Float hudity, Float pressure) {
        System.out.println("temp：" + hudity + ", hudity: " + hudity + ", presure：" + pressure);

        // 如果这里需要实现拉数据的行为，可以什么都不做，主动从subject对象中获取自己需要的数据
    }

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
    }
}
