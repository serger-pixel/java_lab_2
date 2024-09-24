package Classes;
import java.util.Scanner;

public class UI {
    private String _message; // Сообщение для пользователя
    private Scanner _sc; // Объект сканнера
    static private final String _defaultMess = "Enter password with at least 1 "
            + "upper case letter, 1 lower case and 1 number. Password can "
            + "include '_'. At least 8 characters: "; // Сообщение для пользователя по умолчанию
    static private final String _wrongPassMess = "Wrong password"; // Сообщение
    // для пользователя в случае некорректного пароля

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
        String[] inputUser = (scanInput()).split(", ");
         for (var str: inputUser){
             Password password = new Password(str);
             System.out.println(password.getPass() + " " + password.getStatus());
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
