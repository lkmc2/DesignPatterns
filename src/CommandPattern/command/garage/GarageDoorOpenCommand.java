package CommandPattern.command.garage;

import CommandPattern.command.Command;
import CommandPattern.component.GarageDoor;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 打开车库门命令
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor; // 车库门

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up(); // 车库门升起
    }

    @Override
    public void undo() {
        garageDoor.down(); // 车库门下降
    }
}
