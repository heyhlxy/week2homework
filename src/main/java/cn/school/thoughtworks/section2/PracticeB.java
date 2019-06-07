package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        // 把1集合中相同的元素统计出数量
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String string : collection1) {
            if (string.contains("-")) {
                String stringValue = string.substring(string.indexOf("-") + 1);
                String stringKey = string.substring(0, string.indexOf("-"));
                int inteValue = Integer.valueOf(stringValue);
                if (stringValue != null) {
                    if (map.get(stringKey) != null) {
                        map.put(stringKey, inteValue + map.get(stringKey).intValue()); // 考虑字符串顺序
                    } else {
                         map.put(stringKey, inteValue);
                    }
                }
            } else if (map.containsKey(string)) {
                    map.put(string, map.get(string).intValue() + 1);
            } else {
                    map.put(string, new Integer(1));
            }
        }
        return map;
    }
}
