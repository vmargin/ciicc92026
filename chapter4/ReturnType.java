package chapter4;

public class ReturnType {
    void StartEngine(){
        System.out.println("Engine is running");
        return;
    }

    int getAge(){
        return 23;
    }

    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        System.out.println("goodmorning you are now " + rt.getAge() + " years old");
    }
    
}
