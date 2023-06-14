// Write down a high-level abstraction of the following specification on the answer sheet; implement it
// using Java collections framework and test it.
// A member of a Gym is characterized by her/his mobile number, name, age and the number of successful
// referrals made by her/him to the Gym. Make an array list of member objects, display information about
// the members using iterator, use Comparator interface to compare two members based on a measure
// (metric) defined by the sum of the number of successful referrals and age, list the members in the
// collection in descending order of the value of the metric and display the name of the member with the
// minimum value of the metric. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
    
class GymMember{
    private String mobileNo;
    private String name;
    private int age;
    private int referrals;
    
    public GymMember(String mobileNo, String name, int age, int referrals) {
        this.mobileNo = mobileNo;
        this.name = name;
        this.age = age;
        this.referrals = referrals;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if(mobileNo.length()==10){
            this.mobileNo = mobileNo;
        }
        else{
            System.out.println("Invalid mobile number");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0){
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    public int getReferrals() {
        return referrals;
    }

    public void setReferrals(int referrals) {
        if(referrals>0){
            this.referrals = referrals;
        }
        else{
            System.out.println("Invalid referrals");
        }
    }

    @Override
    public String toString() {
        return "Gym Member [mobileNo=" + mobileNo + ", name=" + name + ", age=" + age + ", referrals=" + referrals + "]";
    }
}

public class Gym{
    public static void main(String[] args) {
        ArrayList<GymMember> member=new ArrayList<>();

        member.add(new GymMember("1234567890", "Sam", 25, 10));
        member.add(new GymMember("1234567891", "John", 30, 5));
        member.add(new GymMember("1234567892", "Mary", 20, 15));
        member.add(new GymMember("1234567893", "Jane", 35, 20));
        member.add(new GymMember("1234567894", "Peter", 40, 25));

        Iterator<GymMember> it = member.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(member, new Comparator<GymMember>(){
            @Override
            public int compare(GymMember o1, GymMember o2) {
                return (o1.getAge()+o1.getReferrals())-(o2.getAge()+o2.getReferrals());
            }
        });

        System.out.println("Sorted by age and referrals");
        it = member.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Minimum value of the metric");
        System.out.println(member.get(0).getName());
    }
}