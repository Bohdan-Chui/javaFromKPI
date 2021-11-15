/**
 * Создайте программу, которая осуществляет шифрование / расшифровка методом простой замены.
 * В нем каждый символ незашифрованного текста из исходного алфавита заменяется другим из алфавита,
 * символы в каком представлены в соответствии с ключом шифрования.
 */


public class Task13 {

    public static StringBuffer code(String text, int key){
        char temp;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (Character.isLetter(temp)){
                if (Character.isUpperCase(temp)){
                    char charecter = (char)((temp + key - 'A') % 26 + 'A');
                    result.append(charecter);
                } else {
                    char charecter = (char)((temp + key - 'a') % 26 + 'a');
                    result.append(charecter);
                }
            } else
                result.append(temp);
        }
        return result;
    }
    public static StringBuffer decode(String text, int key){
        char temp;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (Character.isLetter(temp)){
                if (Character.isUpperCase(temp)){
                    char charecter = (char)((temp - key - 'Z') % 26 + 'Z');
                    result.append(charecter);
                } else {
                    char charecter = (char)((temp - key - 'z') % 26 + 'z');
                    result.append(charecter);
                }
            } else
                result.append(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        String string = new String("string");
        System.out.printf("Strind as usual-> %s |coded-> %s |decoded-> %s",
                string,code(string,2),decode("uvtkpi",2));
        System.out.println("  "+ code(args[0],4));
        System.out.println("  "+ decode( new String(code(args[0],4)),4));
    }

}
