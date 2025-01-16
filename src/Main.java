public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluirNoPlano = true;

        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println("\nMédia entre 3 valores: " + media);

        //Text Blocks - Metodo de formatação de String
        String sinopse;
        sinopse = """
                \nFilme top Gun
                Filme Top Gan de Aventura dos anos 80
                Muito bom!
                Ano de Lançamento:""" + anoDeLancamento ;
        System.out.println(sinopse);
    }
}