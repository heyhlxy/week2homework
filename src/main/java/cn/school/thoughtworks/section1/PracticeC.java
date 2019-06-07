package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        // 选出1集合中跟2对象中value属性中的元素相同的元素
        List<String> collection1_list = new ArrayList<String>(collection1);
        collection1_list.retainAll(collection2.get("value"));
        return collection1_list;
    }
}
