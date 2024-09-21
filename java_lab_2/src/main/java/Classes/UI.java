package Classes;
import java.util.Scanner;

public class UI {
    private String _message; // Сообщение для пользователя
    private Scanner _sc; // Объект сканнера
    static private final String _defaultMess = "Enter password with at least 1 "
            + "upper case letter, 1 lower case and 1 number. Password can "
            + "include '_': "; // Сообщение
    // для пользователя по умолчанию
    static private final String _wrongPassMess = "Wrong password";

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
        Password pass = new Password();
        String inputUser;
//        do{
//            inputUser = scanInput();
//        }while(!pass.passVerification(inputUser));
        inputUser = scanInput();
        while(!pass.passVerification(inputUser)){
            System.out.println(_wrongPassMess);
            System.out.println(_defaultMess);
            inputUser = scanInput();
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
