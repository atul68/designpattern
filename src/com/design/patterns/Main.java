package com.design.patterns;

import com.sun.scenario.effect.Merge;

import java.util.*;
class Node {
    public int data;
    public Node next;
    Node(int d) {
        data =d;
        next = null;
    }



}


 class MergeList {
    Node head;

    public void addToTheLast(Node node)  {
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
                temp.next = node;
            }
        }
    }
}

class Test1 {
    void sortedMerge(Node headA,Node headB) {

        Node test = headA;
        Node prev = null;
        // 10,30,50 // 20,40,60
        while(test != null) {
            if (test.data <= headB.data) {
                test = headA.next;
            } else {
                int temp = test.data;
                test.data = headB.data;
                headB.data = temp;
            }
            prev =test;
            test = test.next;
        }
        prev.next = headB;

    }
}


public class Main {

    public static void main(String[] args) {
        Node head1 = new Node(10);
        Node node12 = new Node(30);
        head1.next= node12;
        Node node13 = new Node(50);
        node12.next= node13;


        Node head2 = new Node(20);
        Node node21 = new Node(40);
        head2.next= node21;
        Node node23 = new Node(60);
        node21.next= node23;

//        while(head1!=null ) {
//            System.out.println(head1.data+ ", ");
//            head1 = head1.next;
//        }
        new Test1().sortedMerge(head1,head2);
        while(head1!=null ) {
            System.out.println(head1.data+ ", ");
            head1 = head1.next;
        }
//       list1.head = new Test1().SortedMerge(list.head,list1.head);
//
//       Node temp =  list1.head;
//       while(temp !=null ) {
//           System.out.println(temp.data + ", ");
//           temp = temp.next;
//        }

//        int[] arr = {0,1,1,1,0,0,0,0,1,1,1};
//
//        int size = arr.length-1;
//
//
//        int left = 0;
//        int right = size;
//
//        while(left< right) {
//
//            if(arr[left] == 0) {
//                left++;
//            }
//            else if (arr[right] == 1) {
//                right--;
//            }
//            else {
//                arr[left] = 0;
//                arr[right] = 1;
//                left++;
//                right--;
//            }
//        }
//
//        for(int i =0; i<size;i++) {
//            System.out.println( arr[i]);
//        }

        //System.out.println(Main.getIntValue());

//        String s = "acabdbccd";
//        Map<Character, Integer> m = new LinkedHashMap<>();
//        for(int i=0;i<s.length();i++) {
//            char key = s.charAt(i);
//            if(m.get(key)== null) {
//                m.put(key,1);
//            }else {
//              int value = m.get(key)+1;
//                m.put(key,value);
//            }
//        }
//
//        for(Character c : m.keySet()) {
//            System.out.println(c +"  freq is :: " + m.get(c));
//        }

//        Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
//        Output: 12, 3, 9
//        Explanation: There is a triplet (12, 3 and 9) present
//        in the array whose sum is 24.

//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 9;
//        int size = array.length;
//
//        for(int i =0; i< size; i ++) {
//            HashSet<Integer> set = new HashSet<>();
//            int curr_sum = sum - array[i];
//            //curr =12
//
//            for(int j = i+1; j<size; j++) {
//                if(set.contains(curr_sum-array[j])) {
//                    System.out.printf("triple are %d,%d,%d",array[i],array[j],curr_sum -array[j]);
//                    return;
//                }
//                set.add(array[j]);
//            }
//        }

//        int[] value = {10, 15, 40};
//        int[] weight = {1,2,3};
//        int cap = 6;
//        int size = value.length;
//        System.out.println(problem1(cap, weight,value,size));

    }


//    value = [10, 15, 40]
//    weight = [1, 2, 3]
//    capacity = 6


//    private static int problem1(int cap, int[] weight, int[] value, int size) {
//        if(size== 0 || cap ==0)
//            return 0;
//
//        if(weight[size-1] > cap) {
//            return problem1(cap,weight,value,size-1);
//        } else {
//            return max(value[size-1]+problem1(cap-weight[size-1],weight,value,size-1),
//                    problem1(cap,weight,value,size-1));
//        }
//
//    }
//
//    private static int max(int a,int b) {
//        return a > b? a:b;
//    }
//
//
//    public static int getIntValue(){
//            try{
//                //code throwing exception
//                return 1;
//            }catch(Exception e){
//                return 2;
//            }finally{
//                return 3;
//            }
//        }

}
