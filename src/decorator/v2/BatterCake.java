package decorator.v2;

/**
 * 描述：
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
