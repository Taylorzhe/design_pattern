package singleton.lazy;

/**
 * 描述：在getInstance或者在条件判断语句上加synchronized锁。
 */
public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton synchronizedLazySingleton = null;

    private SynchronizedLazySingleton() {
    }

    public synchronized static SynchronizedLazySingleton getInstance(){
        if (synchronizedLazySingleton == null){
            synchronizedLazySingleton = new SynchronizedLazySingleton();
        }
        return synchronizedLazySingleton;
    }

    public static SynchronizedLazySingleton getInstance1(){
        synchronized (SynchronizedLazySingleton.class){
            if (synchronizedLazySingleton == null){
                synchronizedLazySingleton = new SynchronizedLazySingleton();
            }
        }
        return synchronizedLazySingleton;
    }
}
