package ch3_dataType;

public class Substring {

    public void separateIdNum(String id) {

        String front = id.substring(0, 6);
        String back = id.substring(7, 14);

        System.out.println("19" + front);
        System.out.println(back);
    }

    public static void main(String[] args) {

        String id = "881120-1068234";

        Substring substring = new Substring();
        substring.separateIdNum(id);
    }
}
