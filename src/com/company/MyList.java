package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyList {
    private LinkList head;
    public static java.util.List<String> list = new ArrayList<String>();
    public static String[] arr;

    public MyList() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(String data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }

    public void clear() {
        head = null;
    }


    public static MyList arrayToList(String[] arr) {
        MyList list = new MyList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public Set<String> toSet() {
        Set<String> set =new HashSet<String>();
        LinkList temp = head;

        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }
        return set;
    }

    public Set findLongestWords() {
        list.clear();
        MyList myList = new MyList();
        LinkList temp = head;
        int maxLength = 0;
        while (temp != null) {
            if (temp.data.length() > maxLength) {
                myList.clear();
                myList.add(temp.data);
                maxLength = temp.data.length();
            } else {
                if (temp.data.length() == maxLength) {
                    myList.add(temp.data);
                }
            }
            temp = temp.next;
        }
        System.out.println(myList.toSet());
        return myList.toSet();
    }

    public int find(String key) {
        LinkList temp = head;
        int n = 0;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return n;
            }
            temp = temp.next;
            n++;
        }
        return -1;
    }

    public void print() {
        LinkList temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            System.out.println();
            temp = temp.next;
        }
    }

//    public void sort() {
//        LinkList cur = head;
//        int temp;
//        for (int i = 0; i < size(); i++) {
//            for (int j = 0; j < size() - 1; j++) {
//                if (cur.data.length() < cur.next.data.length()) {
//                    temp = cur.data.length();
//                    cur = cur.next;
//                    cur.next.data.length() = temp;
//                }
//            }
//        }
//        print();
//    }

    public void remove(String i) {
        list.clear();
        LinkList cur = head;
        if (isEmpty()) {
            return;
        } else {
            while (cur != null) {
                if (find(cur.data) != Math.abs(i.length() - size())) {
                    list.add(cur.data);
                    cur = cur.next;
                } else {
                    cur = cur.next;
                }
                arr = new String[list.size()];
            }
        }
    }

    public static String[] coupList() {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        String[] result = arr;

        for (int i = 0; i < result.length / 2; i++) {
            String tmp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = tmp;
        }

        return result;
    }

    //    public String get(String key){
//        LinkList cur = head;
//        if (isEmpty()) {
//        return null;
//        } else {
//            while (cur != null) {
//                if (cur.equals(key)) {
//                    return cur.data;
//                }
//            }
//    }
//
    public int size() {
        LinkList cur = head;
        int counter = 0;
        while (cur != null) {
            counter++;
            cur = cur.next;
        }
        return counter;
    }
}
