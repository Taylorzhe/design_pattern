package decorator.v2;

/**
 * 描述：测试类
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + " 销售价格:" + aBatterCake.cost());
    }
}
