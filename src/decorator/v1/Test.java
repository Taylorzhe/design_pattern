package decorator.v1;

import decorator.v1.BatterCake;
import decorator.v1.BatterCakeWithEgg;
import decorator.v1.BatterCakeWithEggSausage;

/**
 * 描述：测试类
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 销售价格" + batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格" + batterCake.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格" + batterCakeWithEggSausage.cost());
    }
}
