package test;

import java.util.Arrays;
import java.util.List;

public class Convert {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = convert(s, numRows);
        System.out.println(res);
    }

    public static String convert(String s, int numRows) {
        char[] arr = s.toCharArray();
        if (numRows == 1 || arr.length <= numRows) {
            return s;
        }
        int index = 0;
        int flag = 1; // 1 向下 0 向上
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        for (char c : arr) {
            if (index == 0) {
                flag = 1;
            }

            if (index == numRows - 1) {
                flag = 0;
            }

            stringBuilders[index].append(c);
            if (flag == 1) {
                index++;
            } else {
                index--;
            }
        }

        StringBuilder str = new StringBuilder();
        for (StringBuilder stringBuilder : stringBuilders) {
            str.append(stringBuilder.toString());
        }

        return str.toString();
    }
}
