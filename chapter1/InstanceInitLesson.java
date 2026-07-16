package chapter1;

public class InstanceInitLesson {


    int code = 1;

    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        InstanceInitLesson ini = new InstanceInitLesson();
        System.out.println("feathers");
        System.out.println(ini.code);
    }


    {System.out.println("Snowy");
        code = 23231414;
    }

    InstanceInitLesson(){
        System.out.println("constructor");
    }
}
