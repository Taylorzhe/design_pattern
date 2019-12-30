package decorator.v1;

import decorator.v1.BatterCakeWithEgg;

/**
 * 描述：
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
