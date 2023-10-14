public class MyPolynomial {
    double[] coeffs = new double[n + 1];

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length - 1;
    }
}
