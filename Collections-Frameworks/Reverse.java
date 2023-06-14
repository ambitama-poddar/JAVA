// Write a static method reverseCopy that receives a List<T> as an argument 
// and returns a copy of that List<T> with its elements reversed. 
// Test this method in an application.

import java.util.LinkedList;
import java.util.List;

class ReverseList{
    public static <T> List<T> reverseCopy(List<T> list){
        List<T> copy = new LinkedList<T>();
        for(int i = list.size()-1; i >= 0; i--){
            copy.add(list.get(i));
        }
        return copy;
    }
}

public class Reverse{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(ReverseList.reverseCopy(list));
    }
}
