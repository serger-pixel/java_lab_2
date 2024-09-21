package Classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author ermak
 */
public class Password {
    private String _value;
    private static final String _reg = "([A-Z]+)([a-z]+)([0-9]+)(_*){8,}";
    
    public Password(String value){
       // _value = value;
        Pattern temp = Pattern.compile(_reg);
        //_matcher = temp.matcher(value);
        setPassword()
    }
    
    public Password(){
        
    }
    
    public boolean setPassword(String value){
        Pattern temp = Pattern.compile(_reg);
        Matcher matcher = temp.matcher(value);
        if (!matcher.matches()){
            
            setPassword();
        }
        _value = value;
        
    }
}
