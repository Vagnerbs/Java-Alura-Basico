public class VerificarTipos {

    public static boolean verificaAlpha(String name){
        for (char alpha : name.toCharArray() ){
            if (!Character.isLetter(alpha)){
                return false;
            }
        }
        return true;
    }
}
