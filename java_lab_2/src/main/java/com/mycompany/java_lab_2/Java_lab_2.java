
package com.mycompany.java_lab_2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 *
 * @author ermak
 */
public class Java_lab_2 {

    public static void main(String[] args) {
        String _reg = "([A-Z]+)([a-z]+)([0-9]+)(_*){8,}";
        Pattern temp = Pattern.compile(_reg);
        String password = "CPass111_";
        Matcher a = temp.matcher(password);
        System.out.println(a.matches());
        
    }
}
