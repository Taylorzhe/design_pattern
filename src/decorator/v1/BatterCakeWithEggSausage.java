package decorator.v1;

import decorator.v1.BatterCakeWithEgg;

/**
 * 描述：加一个鸡蛋和一根香肠的煎饼
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
