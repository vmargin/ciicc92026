package chapter4;

import java.util.ArrayList;

public class Lambda { 


    public static void main(String[] args) {
        List <Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(null, false, false));
    }

    
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String specieName, boolean hopper, boolean swimmer){
        species = specieName;
        canHop = hopper;
        canSwim = swimmer;

    }

    public boolean canHop() { 
        return canHop;}
    public boolean canSwim() {
        return canSwim;}
    public String toString() {
        return species;
    }

    
}

interface CheckTrait{
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){
        return a.canHop();
    }
}


    

