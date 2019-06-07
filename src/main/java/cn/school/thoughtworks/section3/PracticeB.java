package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection (Map<String, Integer> collectionA, Map<String, List<String>> object) {
        // 选出collection1中key跟collection2中value对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        List<String> listA = new ArrayList<String>(collectionA.keySet());
        listA.retainAll(object.get("value"));
        for (String string : listA) {
            if (collectionA.containsKey(string)) {
                int collectionAvalue = collectionA.get(string).intValue();
                collectionA.put(string, collectionAvalue - collectionAvalue / 3);
            }
        }
        return collectionA;
    }
}
