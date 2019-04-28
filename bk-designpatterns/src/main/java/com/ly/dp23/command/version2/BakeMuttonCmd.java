package com.ly.dp23.command.version2;

import com.ly.dp23.command.version1.Barbecuer;

/**
 * @author xinre
 * @date 2019/2/28 16:04
 */
public class BakeMuttonCmd implements Command{

    @Override
    public void excute() {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeMutton();
    }
}
