package com.cmax.Project3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Clint on 4/27/2016.
 */

class TaskCollection implements Iterable<Task> {
    List<Task> taskc = new ArrayList<>();

    public void addTask(Task newTask) {
        taskc.add(newTask);
    }

    public List<Task> getContacts () {
        return taskc;
    }

    @Override
    public Iterator<Task> iterator() {
        return taskc.iterator();
    }

    @Override
    public void forEach(Consumer<? super Task> action) {

    }
    /*
    @Override
    public String toString() {
        return "Name: " + Task + ", Desc: " + Desc;
    }
*/
    @Override
    public Spliterator<Task> spliterator() {
        return null;
    }
}