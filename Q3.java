/**
 *
 * @author Henrique Miranda
 */

public class Q3 {

    public static void getCripto(String str) {
        
        String result = str.replace(" ", "");
        int l = result.length();
        int cont = 0;
        int m = (int) Math.ceil(Math.sqrt(l));
        char s[][] = new char[m][m];
        String cript = "";
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(cont < l) {
                    s[i][j] = result.charAt(cont);
                }
                cont++;
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
               cript  = cript + s[j][i];
            }
            cript = cript + " ";
        }
        
        System.out.print(cript.replace("\0", ""));
    }
    
    public static void main(String args[]) {
        
        String str = "tenha um bom dia";
        
        getCripto(str);
        
    }
}
