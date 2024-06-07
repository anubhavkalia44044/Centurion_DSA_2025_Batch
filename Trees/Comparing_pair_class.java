package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Comparing_pair_class {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<pair> lst=new ArrayList<>();
        pair arr[]=new pair[n];
        for(int i=0;i<n;i++){
            int marks=sc.nextInt();
            String name=sc.next();
            int age=sc.nextInt();
            lst.add(new pair(age,name,marks));
            arr[i]=new pair(age,name,marks);
        }
        Arrays.sort(arr);
        Collections.sort(lst);
        System.out.println(arr);
        System.out.println(lst);
        for(int i=0;i<n;i++){
            System.out.println(arr[i].marks+"\t"+arr[i].name+"\t"+arr[i].age);
            //System.out.println(lst.get(i).marks+"\t"+lst.get(i).name+"\t"+lst.get(i).age);
        }

    }
}
/*

7
99 abc 24
99 xyz 21
99 abc 30
89 sfd 21
99 mxy 20
89 kartik 22
100 abir 27
 */
// marks,name,age
class pair implements Comparable<pair>{
    int age;
    String name;
    int marks;

    public pair(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(pair o) {
        if(this.marks!=o.marks){
            return o.marks-this.marks;// ascending
        } else if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);// ascending
        }else{
            return o.age-this.age;// descending
        }
    }
}
