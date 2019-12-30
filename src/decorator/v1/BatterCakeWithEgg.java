package decorator.v1;

import decorator.v1.BatterCake;

/**
 * 描述：加一个鸡蛋的煎饼
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
