package chapter1;

public class GarbageCollection {

    public static void main(String[] args) {

        AnObject obj1 = new AnObject();
        AnObject obj2 = new AnObject();
        AnObject obj3 = new obj1;
        obj1 = null;

    
}
}
