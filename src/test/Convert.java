package test;

import java.util.Arrays;

public class Convert {

    public static void main(String[] args) {
        String s = "ABCDE";
        int numRows = 4;
        String res = convert(s, numRows);
        System.out.println(res);
    }

    public static String convert(String s, int numRows) {
        char[] arr = s.toCharArray();
        if (arr.length <= numRows) {
            return s;
        }
        int index = 0;
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < res.length; i++) {
            res[i] = new StringBuilder();
        }
        loop:
        while (index < arr.length) {
            int i = 0;
            while (i < numRows) {
                res[i].append(arr[index]);
                i++;
                index++;
                if (index == arr.length) {
                    break loop;
                }
            }
            if (i == numRows) {
                i--;
                for (int temp = 0; temp < numRows - 2; temp++) {
                    res[i].append(' ');
                }
                i--;
                int ext = 0;
                while (i > 0) {
                    for (int temp = 0; temp < numRows - 2; temp++) {
                        if (temp == ext) {
                            res[i].append(arr[index]);
                            index++;
                            if (index == arr.length) {
                                break loop;
                            }
                        } else {
                            res[i].append(' ');
                        }
                    }
                    ext++;
                    i--;
                }
                for (int temp = 0; temp < numRows - 2; temp++) {
                    res[i].append(' ');
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (StringBuilder re : res) {
            char[] temp = re.toString().toCharArray();
            for (char c : temp) {
                if (c != ' ') {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}
