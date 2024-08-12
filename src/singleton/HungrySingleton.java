package singleton;

/**
 * 饿汉式
 * Description: <br/>
 *
 * @author mjh8 <br/>
 * @date: 2024/8/12 上午10:22 <br/>
 * @since JDK 17
 */
public class HungrySingleton {
    private static final HungrySingleton singleInstance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getSingleInstance() {
        return singleInstance;
    }
}
