package singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 描述：单例模式懒汉式，线程不安全，延迟初始化，降低内存的开销
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    private LazySingleton() {
        if (false) flag = false;
        else throw new RuntimeException("单例构造器禁止通过反射来调用");
    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        LazySingleton o1 = LazySingleton.getInstance();
        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }
}
