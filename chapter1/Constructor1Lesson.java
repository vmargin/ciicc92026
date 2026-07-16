package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    }
    
}


class Chicken{
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}

class Chick{ //🥚
    public Chick(){
        System.out.println("🐣 in constructor");
    }
    public void Chick(){
        System.out.println("🐥💬 I'm a method");
    }
}


class Swan {
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; //writing Object fields
        System.out.println("Swan number of eggs: " + mother.numberEggs); //reading Object fields
    }
}


class Name{
    String first = "Marc";
    String last = "Yim";
    String full = first + last;

    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first = "Anton";
        name1.last = "Racal";
        System.out.println(name1.full); //full is not updated
    }
}