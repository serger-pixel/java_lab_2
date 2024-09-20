package Classes;
import java.util.regex.Pattern;

/**
 *
 * @author ermak
 */
public class Password {
    private String _value;
    private String _reg = "[A-Z+a-z+0-9]{8,}";
    private Pattern _temp;
    
    public Password(String value){
        _value = value;
    }
    
    public Password(){
        
    }
}
