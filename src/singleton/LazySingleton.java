package singleton;

/**
 * 懒汉式 线程不安全
 * Description: <br/>
 *
 * @author mjh8 <br/>
 * @date: 2024/8/12 上午10:15 <br/>
 * @since JDK 17
 */
public class LazySingleton {
    private static LazySingleton singleInstance;

    private LazySingleton() {

    }

    public static LazySingleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new LazySingleton();
        }
        return singleInstance;
    }
}
