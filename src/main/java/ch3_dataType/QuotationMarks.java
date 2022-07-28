package ch3_dataType;

public class QuotationMarks {
    public static void main(String[] args) {
        String str = "공백을 제외한 글자수";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result++;
            }
        }
        System.out.println(result);

        System.out.println("H"+"I");    // HI
        System.out.println('H'+'I');    // 145
        System.out.println('H'+'i');    // 177
        System.out.println("H"+'I');    // HI
    }
}
