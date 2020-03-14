package singleton;

/**
 * 描述：通过静态内部类实现单例模式，延时加载，降低内存开销，线程安全
 */
public class StaticInnerClassSingleton {
    private static class Inner{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return Inner.staticInnerClassSingleton;
    }
}
