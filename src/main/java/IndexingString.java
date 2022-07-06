import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class IndexingString {
    public void getGenderNumber(String pin) {
        System.out.println(pin.charAt(7));
    }

    public void changeString(String a) {
        System.out.println(a.replaceAll(":", "#"));
    }

    public void makeDescending() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));

        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }

    public void combineString() {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));

        String result = String.join(" ", myList);
        System.out.println(result);
    }

    public void searchKey() {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        grade.remove("B");
        System.out.println(grade);
    }

    public static void main(String[] args) {
        IndexingString indexingString = new IndexingString();

        String pin = "881120-1068234";
        indexingString.getGenderNumber(pin);

        String a = "a:b:c:d";
        indexingString.changeString(a);

        indexingString.makeDescending();

        indexingString.combineString();

        indexingString.searchKey();
    }
}
