package day12;

public class Father {
    private String name;
    private int age;
    public Father (){

    }
    public Father (String name, int age1){
        this.name = name;
        age = age1;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }

}
