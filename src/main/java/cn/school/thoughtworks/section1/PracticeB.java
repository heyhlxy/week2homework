package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        // 选出1集合中与2集合中子数组的元素相同的元素
        List<String> collection1_list = new ArrayList<String>(collection1);
        collection1_list.retainAll(collection2.get(0));
        return collection1_list;
    }
}
