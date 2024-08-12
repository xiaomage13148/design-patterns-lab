package singleton;

/**
 * 双重校验锁
 * Description: <br/>
 *
 * @author mjh8 <br/>
 * @date: 2024/8/12 上午10:57 <br/>
 * @since JDK 17
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton singleInstance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getSingleInstance() {
        if (singleInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleInstance == null) {
                    singleInstance = new DoubleCheckSingleton();
                }
            }
        }
        return singleInstance;
    }
}
