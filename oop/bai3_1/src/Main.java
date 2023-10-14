public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1,2.2);
        System.out.println("so phuc 1 la: "+ c1);

        MyComplex c2 = new MyComplex(3.3,4.4);
        System.out.println("so phuc 2 la: "+ c2);

        System.out.println(c1.toString()+" "+c1.isReal());
        System.out.println(c2.toString()+" "+c2.isImaginary());
        System.out.println(c1.toString()+" "+c1.equals(c2));
        System.out.println(c2.toString()+" "+c2.magnitude());

        System.out.println("tong hai so phuc la:  "+c1.add(c2));
        System.out.println("hieu hai so phuc la:  "+c1.subtract(c2));
        System.out.println("tich hai so phuc la: "+c1.multiply(c2));
        System.out.println("thuong hai so phuc la: "+c1.divide(c2));
        System.out.println("lien hop cua so phuc la"+c1.conjugate());

    }
}