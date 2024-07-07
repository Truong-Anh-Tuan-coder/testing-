package excercise;

public class Application {
    public static void main(String[] args){
        int x =5;
        int y = 10;
        String result = getStringMethod(Dog::park);
        System.out.println(result);
    }
//    public static int  ToDo(int x,int y,BaseInterface a){
//        return a.Calculation(x, y);
//    }
    public static String getStringMethod( BaseInterface s){
        return s.aString();
    }
}
