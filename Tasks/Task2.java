package Tasks;

public class Task2 {
    public static void main(String[] args) {

        char h = 'H';
        byte e = 3;
        short l = 1; 
        int o = 0;
        float decimal = 2.0f;
        boolean bol = true;
        String output = h +"" + e + l + l + o + " W" + o +"r"+ l +
        "d " + decimal +" "+ bol;
        System.out.println(output);


        StringBuilder output2 = new StringBuilder().append('H').append(e).append(l).append(l).append(o).append(" W").append(o).append("r").append(l).append("d ").append(decimal).append(" ").append(bol);
        System.out.println(output2);

        String output3 = new String().concat("H").concat(String.valueOf(e)).concat(String.valueOf(l)).concat(String.valueOf(l)).concat(String.valueOf(o)).concat(" W").concat(String.valueOf(o)).concat("r").concat(String.valueOf(l)).concat("d ").concat(String.valueOf(decimal)).concat(" ").concat(String.valueOf(bol));
        System.out.println(output3);

    }
    
}
