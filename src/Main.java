public class Main {
    public static void main(String[] args) {

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println("\nMédia entre 3 valores: " + media);

        //Casting explicito- conversão de tipos - decimal para inteiro
        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        // casting implícito - Quando o tipo de dado de origem é "compatível" com o tipo de dado de destino
        int x = 10;
        double y = x;
        System.out.println(y);

        // casting explícito - Quando o tipo de dado de origem é "incompatível" com o tipo de dado de destino
        double a = 10.5;
        int b = (int) a;
        System.out.println(b);
    }
}