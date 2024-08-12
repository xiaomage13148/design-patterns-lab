package singleton;

/**
 * 懒汉式 线程安全
 * Description: <br/>
 *
 * @author mjh8 <br/>
 * @date: 2024/8/12 上午10:24 <br/>
 * @since JDK 17
 */
public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton singleInstance;

    private LazyThreadSafeSingleton() {

    }

    public static synchronized LazyThreadSafeSingleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new LazyThreadSafeSingleton();
        }
        return singleInstance;
    }
}
