package TasksTest;

public class Task2 {

    public static void main(String[] args) {
        byte e = 3;
        short l = 110 ;
        int o = 0;
        float dec = 2.0f;
        boolean bol = true;
        char h = 'H';

        String output = h + (e + (l + " w" + o + "rld " + dec +" "+ bol));
        System.out.println(output);

        StringBuilder output2 = new StringBuilder().append('H').append(e)
        .append(l).append(" w"+(o)+"rld ").append(dec+" ").append(bol);
        System.out.println(output2);
        
    
}}
