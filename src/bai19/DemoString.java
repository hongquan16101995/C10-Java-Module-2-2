package bai19;

public class DemoString {
    public static void main(String[] args) {
        //object literal
        String string = "abc";

        //string builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");

        //string buffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");

        System.out.println(string.equals(stringBuffer));
        System.out.println(string.equals(stringBuilder));
        System.out.println(stringBuffer.toString().equals(string));
        System.out.println(stringBuilder.toString() == string);
    }
}
