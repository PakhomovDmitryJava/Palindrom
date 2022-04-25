import java.util.Locale;

/**Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.

 Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

 Madam, I'm Adam!
 */

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(isPalindrome("arozaupalanalapuazora"));

    }

    public static boolean isPalindrome(String text) {
        boolean yes;

        String onlyText = text.replaceAll("\\W+","");
        StringBuilder sb = new StringBuilder(onlyText);

        String onlyTextIgnoredCase = sb.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb1 = new StringBuilder(onlyTextIgnoredCase);
        String reversedText = sb1.reverse().toString();

       if (onlyTextIgnoredCase.compareTo(reversedText) == 0)
       {
           yes = true;
       }
       else
       {
           yes = false;
       }
       return yes;
    }
}



