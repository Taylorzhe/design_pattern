package singleton.lazy;

/**
 * 描述：双重检查懒汉单例模式
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        synchronized (LazyDoubleCheckSingleton.class){
            if (lazySingleton == null){
                lazySingleton = new LazyDoubleCheckSingleton();
            }
        }
        return lazySingleton;
    }
}
