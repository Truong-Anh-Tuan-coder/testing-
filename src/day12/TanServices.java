package day12;

import java.util.ArrayList;

public class TanServices<T> implements  People<T> {
    private ArrayList<T>  list = new ArrayList<T>();
        public void doSomething(T toDo){
            System.out.println("hello World");
        }

    @Override
    public void insert(T object) {
        list.add(object);
    }

    @Override
    public void delete(T object) {

    }

    @Override
    public void update(T object) {

    }

    @Override
    public void findAll() {

            for(var item: list){
                System.out.println(item);
            }
    }

}
