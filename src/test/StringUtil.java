package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtil {
    /**
     * 自定义分割字符串方法
     *
     * @param str
     * @param delimiter
     * @return
     */
    public static List<String> customSplit(String str, String delimiter) {
        List<String> result = new ArrayList<>();

        int start = 0;
        int end;

        // 当找到分隔符时，使用 substring 提取子字符串
        while ((end = str.indexOf(delimiter, start)) != -1) {
            result.add(str.substring(start, end));
            start = end + delimiter.length();
        }

        // 添加最后一个子字符串
        result.add(str.substring(start));

        return result;
    }

    public static void main(String[] args) {
        List<String> strings = customSplit("apple,banana,orange", "a");
        strings.forEach(item -> {
            System.out.println(item);
        });

        String[] as = "apple,banana,orange".split("a");
        System.out.println(Arrays.asList(as));
    }
}
