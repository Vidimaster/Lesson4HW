package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }
    public double mul(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }
    public double div(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        list.remove(0);
        for (Number number : list) {
            result /= number.doubleValue();
        }
        return result;
    }

    public <T> AbstractList<T> bin(List<T> list) {
        String resultstr = "";

        ArrayList<T> res = new ArrayList<>();
        for (T number : list) {
            String[] parts = number.toString().split("\\.");
            Stack<Integer> st = new Stack<>();
            int num = Integer.parseInt(parts[0]);
            int count = 0;
            boolean fl = true;
            Double num2 = 0.0;

            while (num > 0) {
                st.push(num % 2);
                num = num / 2;
            }

            while (!(st.isEmpty())) {
                resultstr += st.pop().toString();
            }
            if (parts.length == 2) {
                resultstr += "00101110";

                String str = "0." + parts[1];
                num2 = Double.valueOf(str);
                String[] strbin = num2.toString().split("\\.");
                while (fl) {

                    num2 = num2 * 2;
                    strbin = num2.toString().split("\\.");
                    st.push(Integer.parseInt(strbin[0]));
                    str = "0." + strbin[1];
                    num2 = Double.valueOf(str);
                    count++;
                    if (strbin[1] == "0" || count < 10) {
                        fl = false;
                    }
                }

                while (!(st.isEmpty())) {
                    resultstr += st.pop().toString();
                }


            }
            res.add((T) resultstr);
            resultstr = "";
        }
        return res;
    }
}
