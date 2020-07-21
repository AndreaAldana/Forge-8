public class pruebaDeStringBuilder {
    public static void main(String[] args) {
        String a = "holaaaa";
        String b = "*-'x";

        StringBuilder aa = new StringBuilder(a);

        aa.setCharAt((int)(Math.random()*aa.length()),b.charAt((int)(Math.random()*b.length())));

        aa.toString();
        System.out.println(aa);
    }
}
