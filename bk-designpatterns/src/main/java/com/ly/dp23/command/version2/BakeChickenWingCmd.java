package com.ly.dp23.command.version2;

import com.ly.dp23.command.version1.Barbecuer;

/**
 * @author xinre
 * @date 2019/2/28 16:08
 */
public class BakeChickenWingCmd implements Command {
    @Override
    public void excute() {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeChickenWing();
    }
}
