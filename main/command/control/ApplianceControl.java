package command.control;

public class ApplianceControl {
    Command[] onCommands;
    Command[] offCommands;

    public ApplianceControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new DoNothingCommand();
            offCommands[i] = new DoNothingCommand();
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand) {
        assert  slot > 0 && slot < 7 : "没有这个插槽";
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPress(int slot){
        assert  slot > 0 && slot < 7 : "没有这个插槽";
        onCommands[slot].execute();
    }

    public void offButtonPress(int slot){
        assert  slot > 0 && slot < 7 : "没有这个插槽";
        offCommands[slot].execute();
    }


}
