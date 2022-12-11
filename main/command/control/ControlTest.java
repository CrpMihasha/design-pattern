package command.control;

public class ControlTest {
    public static void main(String[] args) {
        // 遥控器
        ApplianceControl applianceControl = new ApplianceControl();

        // 接收者
        Light light = new Light();

        // 命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // 给遥控器插槽设置命令
        applianceControl.setCommand(6,lightOnCommand,lightOffCommand);

        //  按下遥控器按钮
        applianceControl.onButtonPress(6);
        applianceControl.offButtonPress(6);
    }
}
