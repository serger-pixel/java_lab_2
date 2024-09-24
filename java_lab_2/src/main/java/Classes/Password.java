package Classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Password {
    static final String _reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]"
            + "{8,}"; //регулярное выражение
    private String _defaultValue = "None"; //Значение по умолчанию
    private String _value; // Значение пароля
    private boolean _status; // Статус пароля
    
    /**
     * Конструктор по умолчанию
     */
    public Password(){
        _value = _defaultValue;
        _status = false;
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
    private boolean passVerification(String pass){
        return Pattern.matches(_reg, pass);
    }
    
    /**
     * Выводит пароль
     */
    public void printPass(){
        String statusStr;
        if (_status){
            statusStr = "Correct!";
        }
        else{
            statusStr = "Wrong";
        }
        System.out.println(getPass() + " " + statusStr);
    }
    
    /**
     * Переводит строку в массив паролей
     * @param input - ввод пользователя
     * @return массив паролей
     */
    static public Password[] stringToArray(String input){
        String[] passwordsStr = input.split(", ");
        Password[] mass = new Password[passwordsStr.length];
         for (int i = 0; i<passwordsStr.length; i++){
             mass[i] = new Password(passwordsStr[i]);
         }
         return mass;
    }
    
    /**
     * Получение статуса пароля
     * @return строку "wrong"/"correct"
     */
    public boolean getStatus(){
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
