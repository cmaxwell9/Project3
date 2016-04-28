
package com.cmax.Project3;

/**
 * Created by Clint on 3/3/2016.
 */

class Task implements Comparable<Task>{

    public String Name;
    public String Desc;
    public Integer Pri;


    public Task(String Name, String Desc, Integer Pri){
        this.Name = Name;
        this.Desc = Desc;
        this.Pri = Pri;

    }

    public void display(){
        System.out.println("Name: " + Name + ", Desc: " + Desc + ", Pri: " + Pri);
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Desc: " + Desc + "Pri: " + Pri   ; }



    @Override
    public int compareTo(Task o) {
        if (!Pri.equals(o.Pri)) {
            return Pri.compareTo(o.Pri);
        }
        else {
            return Name.compareTo(o.Name);
        }
    }

}
