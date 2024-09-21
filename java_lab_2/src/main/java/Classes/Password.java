package Classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author ermak
 */
public class Password {
    //static final String _reg = "([A-Z]+)([a-z]+)([0-9]+)(_*){8,}";
    static final String _reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]{8,}";
    private Pattern _pattern;
    
    public Password(){
        _pattern = Pattern.compile(_reg);
    }
    
    public boolean passVerification(String pass){
        Matcher matcher = _pattern.matcher(pass);
        return matcher.matches();
    }
}
