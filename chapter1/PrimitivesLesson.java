package chapter1;

public class PrimitivesLesson {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long b = 2147483649L; //this is out of range for int, so it will cause a compile error
        System.out.println(b);

        double d = 1.245d;//this is a double literal, so it will not cause a compile error
        System.out.println(d);
        float f = 1.245f;//the 'f' suffix indicates it is a float literal, so it will not cause a compile error
        System.out.println(f);
        long i = 56L;//this is a valid long literal, so it will not cause a compile error
        System.out.println(i);
    }
    
}
