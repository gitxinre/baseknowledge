package com.ly.dp23.command.version2;

import com.ly.dp23.command.version1.Barbecuer;

/**
 * @author xinre
 * @date 2019/2/28 15:28
 */
public class ClientCall {
    public static void main(String[] args) {

        ClientCall cc = new ClientCall();
        cc.bake(10, BarbecueTypeEnum.MUTTON);
        cc.bake(5, BarbecueTypeEnum.CHICKEN_WING);
    }

    private void bake(final int i, BarbecueTypeEnum barbecueTypeEmun) {
        switch (barbecueTypeEmun) {
            case MUTTON:
                for (int j = 0; j < i; j++) {
                    System.out.print("--- " + (j + 1) + " ---");
                    Waiter waiter = new Waiter(new BakeMuttonCmd());
                    waiter.notifyExcute();
                }
                break;
            case CHICKEN_WING:
                for (int j = 0; j < i; j++) {
                    System.out.print("--- " + (j + 1) + " ---");
                    Waiter waiter = new Waiter(new BakeChickenWingCmd());
                    waiter.notifyExcute();
                }
                break;
            default:
                System.out.println("不能烤:" + barbecueTypeEmun.toString() + "，按照菜单点，谢谢！！！");
                break;
        }
    }

    enum BarbecueTypeEnum {
        /**
         * 羊肉串
         */
        MUTTON,
        /**
         * 鸡翅
         */
        CHICKEN_WING
    }


}
