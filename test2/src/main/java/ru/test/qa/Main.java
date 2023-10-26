package ru.test.qa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        hello();
        System.out.println(2 + 3);
        System.out.println( "2 + 2 = " + ("2 + 2"));
        r(5);
        Count c = new Count(4,8);
        System.out.println(c.count());
        //System.out.println(new Count(4,5).count() );
    }

    public static void hello() {
        System.out.println("Hello world!");
    }

    public static int r(int a){
        return a;
    }

}
