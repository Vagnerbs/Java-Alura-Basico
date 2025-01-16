public class Main {
    public static void main(String[] args) {

        /*  Metodo ".equals" é a forma correta de comparar Strings, pois o "=="
            verifica apenas se duas variaveis apontam para o mesmo objeto na memoria,
            e não se o conteúdo das Strings são iguais.*/

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}