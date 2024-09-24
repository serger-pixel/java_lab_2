package Classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Password {
    static final String _reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]"
            + "{8,}"; //регулярное выражение
    private String _defaultValue = "None"; //Значение по умолчанию
    private String _value; // Значение пароля
    private String _status; // Статус пароля
    
    /**
     * Конструктор по умолчанию
     */
    public Password(){
        _value = _defaultValue;
        _status = _defaultValue;
    }
    
    /**
     * Конструктор с параметром
     * @param value - значение пароля
     */
    public Password(String value){
        _value = value;
        _status = passVerification(value);
    }
    
    /**
     * Проверка пароля на соответствие шаблону
     * @param pass - введённый пользователем пароль
     * @return true/false в зависимости от результата проверки
     */
    private String passVerification(String pass){
        boolean result = Pattern.matches(_reg, pass);
        if (result){
            return "Correct";
        }
        return "Wrong";
    }
    
    /**
     * Получение статуса пароля
     * @return строку "wrong"/"correct"
     */
    public String getStatus(){
        return _status;
    }
    
    /**
     * Получение значения пароля
     * @return значение пароля
     */
    public String getPass(){
        return _value;
    }
}
