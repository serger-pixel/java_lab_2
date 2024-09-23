package Classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author ermak
 */
public class Password {
    static final String _reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]{8,}";
    // Регулярное выражение
    private Pattern _pattern; // Объект-шаблон 
    
    /**
     * Конструктор по умолчанию
     */
    public Password(){
        _pattern = Pattern.compile(_reg);
    }
    
    /**
     * Проверка пароля на соответствие шаблону
     * @param pass - введённый полььзователем пароль
     * @return true/false в зависимости от результата проверки
     */
    public boolean passVerification(String pass){
        Matcher matcher = _pattern.matcher(pass);
        return matcher.matches();
    }
}
