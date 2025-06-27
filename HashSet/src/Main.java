import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet h =new HashSet();
        h.add("12 str");
        h.add(12);
        h.add(12.00);
        h.add(true);
        h.add(null);
      Iterator itr=h.iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }
      h.forEach(item-> System.out.println(item +" "));
    }
}