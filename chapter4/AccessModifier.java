package chapter4;

public class AccessModifier {

    public void greetMe() {
        System.out.println("Hello, World!");
    }

    private void greetMe2() {
        System.out.println("Hello, from JAVA person");
    }

    protected void greetMe3() {
        System.out.println("Hello, from JAVA peeps");
    }

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.greetMe();
        // accessModifier.greetMe2();
        // accessModifier.greetMe3();
    }
}

    /**
     * InnerAccessModifier
     */
    public class InnerAccessModifier {
    
        protected void greetMe3() {
        System.out.println("Hello, from JAVA peeps");
    }
    }

    class Moonflower extends AccessModifier{

        public static void main(String[] args) {
            Moonflower mf = new Moonflower ();
            mf.greetMe();
        }

    }