package chapter19codes.genericdesignandimplementation;

import java.util.ArrayList;

/**
 * class is GenericStack, not GenericStack<E>. Thats why constructor for this class is
 * public GenericStack(){}, but not public GenericStack<E>{}.
 * @param <E>
 */
public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return  list.size();
    }

    public E peek(){
        return  list.get(list.size()-1);
    }
    public void push(E o){
        list.add(o);
    }

    public E pop(){
        return list.remove(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "list=" + list.toString() +
                '}';
    }
}
