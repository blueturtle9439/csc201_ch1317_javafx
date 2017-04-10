package sample;

public class Complex implements Cloneable {
    double a, b;

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public Complex(double temp) {
        this.a = 0;
        this.b = temp;
    }

    public Complex(double temp1, double temp2) {
        this.a = temp1;
        this.b = temp2;
    }

    public String add(Complex temp) {
        double a = this.a;
        double b = this.b;
        double c = temp.a;
        double d = temp.b;
        String result = (a + c) + " + " + (b + d) + "i";
        return result;
    }

    public String subtract(Complex temp) {
        double a = this.a;
        double b = this.b;
        double c = temp.a;
        double d = temp.b;
        String result = (a - c) + " + " + (b - d) + "i";
        return result;
    }

    public String multiply(Complex temp) {
        double a = this.a;
        double b = this.b;
        double c = temp.a;
        double d = temp.b;

        String result = ((a * c) - (b * d)) + " + " + ((b * c) + (a * d)) + "i";
        return result;
    }

    public String divide(Complex temp) {
        double a = this.a;
        double b = this.b;
        double c = temp.a;
        double d = temp.b;

        String result = String.format("%.4f", ((a * c + b * d) / (c * c + d * d))) + " + " + String.format("%.1f", ((b * c - a * d) / (c * c + d * d))) + "i";
        return result;
    }

    public String abs() {
        double a = this.a;
        double b = this.b;

        String result = String.valueOf(Math.sqrt(a * a + b * b));
        return result;
    }

    @Override
    public String toString() { //returns (a + bi)
        if (this.b == 0) {
            return String.valueOf(this.a);
        }

        return "(" + String.valueOf(this.a) + " + " + String.valueOf(this.b) + "i)";
    }

    public double getRealPart() {
        return this.a;
    }

    public double getImaginaryPart() {
        return this.b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
