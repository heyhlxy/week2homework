package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection (List<String> collectionA, Map<String, List<String>> object) {
        // 统计出collection1中相同的元素的个数，形成collection3，collection3是一个map,其中元素key是collection1中的元素,value是该元素在collection1中出现次数
        // 然后选出collection3跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合

        // 统计出collection1中相同的元素的个数，形成collection3，collection3是一个map,其中元素key是collection1中的元素,value是该元素在collection1中出现次数
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>();
        for (String string : collectionA) {
            if (!set.add(string)) {
                collection3.put(string, collection3.get(string).intValue() + 1);
            } else {
            	collection3.put(string, new Integer(1));
            }
        }

        // 然后选出collection3跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        List<String> objectList = object.get("value");
        for (String string1 : objectList) {
            if (collection3.containsKey(string1)) {
                int collection3Value = collection3.get(string1).intValue();
                collection3.put(string1, collection3Value - collection3Value/3);
            }
        }
        return collection3;
    }
}
