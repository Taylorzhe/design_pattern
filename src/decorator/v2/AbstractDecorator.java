package decorator.v2;

/**
 * 描述：抽象的装饰者类,根据类中是否有抽象发放来决定是否将类定义为抽象类
 */
public /*abstract */ class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

//    public abstract void doSomething();
    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
