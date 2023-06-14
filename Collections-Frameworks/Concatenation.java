// Develop and test a program that concatenates two linked list objects of characters. 
// The class ListConcatenate should include a static method concatenate that takes 
// references to both list objects as arguments and concatenates the second list to the first list.

import java.util.LinkedList;
import java.util.List;

class ListConcatenate{
    public static void concatenate(List<Character> list1, List<Character> list2){
        list1.addAll(list2);
    }
}

public class Concatenation{
    public static void main(String[] args){
        List<Character> list1 = new LinkedList<Character>();
        List<Character> list2 = new LinkedList<Character>();

        list1.add('a');
        list1.add('b');
        list1.add('c');

        list2.add('d');
        list2.add('e');
        list2.add('f');

        ListConcatenate.concatenate(list1, list2);

        System.out.println(list1);
    }
}
