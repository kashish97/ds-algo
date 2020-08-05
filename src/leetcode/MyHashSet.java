package leetcode;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    ArrayList<Integer> integerArrayList;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.integerArrayList = new ArrayList<>();


    }

    public void add(int key) {
        if(integerArrayList!=null && integerArrayList.size()>0 && !integerArrayList.contains(key)){
            integerArrayList.add(key);}
        if(integerArrayList==null || integerArrayList.size()==0){
            integerArrayList.add(key);
        }

    }

    public void remove(int key) {
        ArrayList<Integer> abc = new ArrayList<>();
        abc.add(key);
        integerArrayList.removeAll(abc);
    }
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(integerArrayList.contains(key)){
            //System.out.print(true);
            return true;
        }
        //System.out.print(false);
        return false;
    }

    public static void main(String [] args){
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);    // returns true
        hashSet.contains(3);    // returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);    // returns true
        hashSet.remove(2);
        hashSet.contains(2);    // returns false (already removed)
    }
}