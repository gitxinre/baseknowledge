package com.ly.dp23.command.version1;

/**
 * @author xinre
 * @date 2019/2/28 15:28
 */
public class ClientCall {
    public static void main(String[] args) {

        ClientCall cc = new ClientCall();
        cc.bake(10, BarbecueTypeEnum.MUTTON);
        cc.bake(5, BarbecueTypeEnum.CHICKEN_WING);
        cc.bake(5, BarbecueTypeEnum.other);
    }

    private void bake(final int i, BarbecueTypeEnum barbecueTypeEmun) {
        Barbecuer b = new Barbecuer();
        switch (barbecueTypeEmun) {
            case MUTTON:
                for (int j = 0; j < i; j++) {
                    System.out.print("--- " + (j + 1) + " ---");
                    b.bakeMutton();
                }
                break;
            case CHICKEN_WING:
                for (int j = 0; j < i; j++) {
                    System.out.print("--- " + (j + 1) + " ---");
                    b.bakeChickenWing();
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
        CHICKEN_WING,
        other
    }


}
