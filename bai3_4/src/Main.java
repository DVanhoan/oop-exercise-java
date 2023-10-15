public class Main {
    public static void main(String[] args) {
        MyTime m = new MyTime(14,59,9);
        System.out.println(m.toString());
        System.out.println(m.nextSecond());
        System.out.println(m.nextMinute());
        System.out.println(m.nextHour());
        System.out.println(m.previousSecond());
        System.out.println(m.previousMinute());
        System.out.println(m.previousHour());


    }
}