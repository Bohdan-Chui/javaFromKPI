import java.math.BigInteger;
import java.util.regex.Pattern;

/**
 * Преобразование аргументов, задаваемых при запуске программы.
 * Программа определяет тип аргумент – шестнадцатеричное число без знака
 * (шаблон: шестнадцатеричным числом без знака считается строка, которая содержит
 * цифры от 0 до 9 и буквы A(a), B(b), C(c), D(d), E(e),F(f)) или строка. Введенные
 * аргументы-числа преобразуются в двоичные числа. Программа выводит количество заданных
 * аргументов, их значения, а также количество аргументов-чисел и их двоичные значения.
 *
 *
 * Для запуска открить терминал, скомпилировать файл, запустись байт код з параметрами типа C/78
 */
public class Task39 {
    public static StringBuffer hexToBinary(String arg){
        StringBuffer result = new StringBuffer();
        String regex = "^[0-9a-zA-Z]+$";
        if (Pattern.matches(regex, arg)) {
            result.append("hex-> " + arg + " binary-> " + hexToBin(arg));
        } else {
            result.append("isnt hex");
        }
        return  result;
    }

    static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }

    public static void main(String[] args) {
        try{
            System.out.println("args len " + args.length);
            for (String i:args ) {
                System.out.println(hexToBinary(i));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
