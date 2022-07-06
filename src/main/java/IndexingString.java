public class IndexingString {
    public void getGenderNumber(String pin) {
        System.out.println(pin.charAt(7));
    }

    public static void main(String[] args) {
        String pin = "881120-1068234";

        IndexingString indexingString = new IndexingString();
        indexingString.getGenderNumber(pin);
    }
}
