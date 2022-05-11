package eva3_11_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_11_THROW {

    public static void main(String[] args) {
        
        try {
            throw new Exception("Excepción personalizada");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
