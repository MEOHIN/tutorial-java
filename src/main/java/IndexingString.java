public class IndexingString {
    public void getGenderNumber(String pin) {
        System.out.println(pin.charAt(7));
    }

    public void changeString(String a) {
        System.out.println(a.replaceAll(":", "#"));
    }

    public static void main(String[] args) {
        IndexingString indexingString = new IndexingString();

        String pin = "881120-1068234";
        indexingString.getGenderNumber(pin);

        String a = "a:b:c:d";
        indexingString.changeString(a);
    }
}
