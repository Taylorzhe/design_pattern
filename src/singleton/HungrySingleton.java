package singleton;

/**
 * 描述：饿汉式
 * 优点：写法简单，类加载的时候就完成初始化，避免了线程同步的问题
 * 缺点：没有了延迟的效果，如果类从始至终没有用过，就会浪费内存
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
