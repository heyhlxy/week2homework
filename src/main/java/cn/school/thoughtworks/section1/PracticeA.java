package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        // 选出1集合中与2集合中相同的元素
        List<String> collection1_list = new ArrayList<String>(collection1);
        collection1_list.retainAll(collection2);
        return collection1_list;
    }
}
