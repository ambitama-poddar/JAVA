// Develop and test a program that inserts 25 random integers from 0 to 100 in order into a linked-list object. 
// For this exercise, you’ll need to modify the List<T> class to maintain an ordered list.
//  Name the new version of the class SortedList.
// Modify the SortedList class to include a merge method that can merge the SortedList 
// it receives as an argument with the SortedList that calls the method. Write an application to test method merge.

import java.util.LinkedList;
import java.util.List;

class SortedList<T extends Comparable<T>>{
    private List<T> list;

    public SortedList(){
        this.list = new LinkedList<T>();
    }

    public void add(T element){
        int index = 0;
        for(T item : this.list){
            if(element.compareTo(item) < 0){
                break;
            }
            index++;
        }
        this.list.add(index, element);
    }

    public void merge(SortedList<T> list){
        for(T item : list.list){
            this.add(item);
        }
    }

    @Override
    public String toString(){
        return this.list.toString();
    }
}

public class Sorting{
    public static void main(String[] args){
        SortedList<Integer> list1 = new SortedList<Integer>();
        SortedList<Integer> list2 = new SortedList<Integer>();

        for(int i = 0; i < 25; i++){
            list1.add((int)(Math.random()*100));
            list2.add((int)(Math.random()*100));
        }

        System.out.println(list1);
        System.out.println(list2);

        list1.merge(list2);

        System.out.println(list1);
    }
}


