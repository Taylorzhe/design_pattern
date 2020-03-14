package singleton;

/**
 * 描述：
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadInstance = new ThreadLocal<>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    private static ThreadLocalInstance getInstance(){
        return threadInstance.get();
    }
}
