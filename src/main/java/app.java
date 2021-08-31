import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("\nNhập mật :");
            password = input.nextLine();
            if (!lengthCheck(password)) {
                System.out.println("Mật khẩu yếu!");
            }
            if (!specialCharacterCheck(password)) {
                System.out.println("Mật khẩu chưa đủ mạnh!");
            }
        }while (!lengthCheck(password) || !upperCaseCheck(password) || !specialCharacterCheck(password) || !numericCheck(password));
        System.out.println("Thành công!");
    }

    public static boolean lengthCheck(String pw){
        if (pw.length() >= 10) {
            return true;
        }
        return false;
    }

    public static boolean upperCaseCheck(String pw){
        char[] ch = pw.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean numericCheck(String pw){
        Pattern p = Pattern.compile("[^A-Za-z]");
        Matcher m = p.matcher(pw);
        if (m.find())
            return true;
        return false;
    }

    public static boolean specialCharacterCheck(String pw){
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(pw);
        if (m.find())
            return true;
        return false;
    }


}
