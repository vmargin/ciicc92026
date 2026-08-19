package chapter4;

public class OverloadingLesson {
    
    public void fly(int numMiles) {
        System.out.println("integer");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet){
        System.out.println("int short");
    }
    
    public static void main(String[] args) {
        OverloadingLesson oll = new OverloadingLesson();
        short s =1;
        oll.fly();
        oll.fly(s);
        oll.fly(1);
        System.out.println(oll.fly());
        oll.fly(1,(short)1);

    }
}
