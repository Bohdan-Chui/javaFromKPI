import java.util.regex.Pattern;

/**
 * Анализ типов аргументов, задаваемых при запуске программы.
 * Если аргумент является десятичным числом с целой и дробной частью
 * (шаблон: состоит из одной или нескольких цифр, одной десятичной точки,
 * которая может быть в начале, в середине или в конце числа,  и, кроме того,
 * первым символом числа может быть знак "+" или "-"), то  тип аргумента "Decimal",
 * иначе "String". Программа выводит количество заданных аргументов и, для каждого аргумента,
 * его тип и значение.
 *
 *
 * Для запуска открить терминал, скомпилировать файл, запустись байт код з параметрами типа +1.2/1.2
 */
public class Task17 {

    public static StringBuffer analiseStr(String[] arguments){
        StringBuffer input = new StringBuffer();
        for (String argument : arguments) {
            input.append(argument);
            String regex = "^[+-]?\\d+\\.\\d+$";
            if (Pattern.matches(regex, argument)) {
                input.append(" is Decimal Type\n");
            } else {
                input.append(" is String Type\n");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No arguments to check!");
            return;
       }
        System.out.printf("There are %d arguments:\n%s", args.length, analiseStr(args));
    }
}
