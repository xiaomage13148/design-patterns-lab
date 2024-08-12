package singleton;

/**
 * 静态内部类实现
 * Description: <br/>
 *
 * @author mjh8 <br/>
 * @date: 2024/8/12 上午11:05 <br/>
 * @since JDK 17
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    private static class StaticInnerClassHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassHolder.INSTANCE;
    }
}
