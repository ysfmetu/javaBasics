//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String result= reverseString("yusuf");
        System.out.println("sonuç = " +result);

    }
    static String reverseString(String word){
        StringBuilder reversed=new StringBuilder();
            for (int i=word.length()-1; i>= 0; i--){
                reversed.append(word.charAt(i));
            }
        return reversed.toString();
    }

}