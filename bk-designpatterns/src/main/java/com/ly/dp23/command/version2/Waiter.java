package com.ly.dp23.command.version2;

/**
 * @author xinre
 * @date 2019/2/28 16:10
 */
public class Waiter {
    private Command cmd;

    public Waiter(Command cmd) {
        this.cmd = cmd;
    }

    public void notifyExcute() {
        cmd.excute();
    }
}
