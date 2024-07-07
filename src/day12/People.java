package day12;

public interface People <T>{
    void doSomething(T toDo);

    void insert(T object);
    void delete( T object);
    void update(T object);
    void findAll();

}
