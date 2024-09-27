package Classes;
import java.util.Scanner;

/**
 * Класс пользовательского интерфейса
 */
public class UI {
    /**
     *  Сообщение для пользователя
     */
    private String _message; 
    /**
     *  Объект сканера
     */
    private Scanner _sc; 
    /**
     * Сообщение для пользователя по умолчанию
     */
    static private final String _defaultMess = "Enter password with at least 1 "
            + "upper case letter, 1 lower case and 1 number. Password can "
            + "include '_'. At least 8 characters: ";
    /**
     * Конструктор с параметром
     * @param message - сообщение для пользователя 
     */
    public UI(String message) {
        _sc = new Scanner(System.in);
        _message = message;
    }
    
    /**
     * Конструктор по умолчанию
     */
    public UI(){
        this(_defaultMess);
    }
    
    /**
     * Запуск приложения
     */
    public void startApplication(){
        System.out.println(_message);
        Password[] inputUser = Password.stringToArray(scanInput());
         for (var pass: inputUser){
             System.out.println(pass.getString());
         }
    }
    
    /**
     * Получение ввода пользователя
     * @return введённую строчку
     */
    private String scanInput(){
        String inputUser = _sc.nextLine();
        return inputUser;
    }
    
}
