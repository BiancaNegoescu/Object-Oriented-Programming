package task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
      this(0,0);
    }

    public Complex(Complex nr){
        this.real = nr.real;
        this.imaginary = nr.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

     public void addWithNumber(Complex nr){
        this.real = this.real + nr.real;
        this.imaginary = this.imaginary + nr.imaginary;
    }


    public void showNumber(Complex nr){
        System.out.println("numarul complex este:" + this.real + "+" + this.imaginary+"i");
    }

    public static void main(String[] args){
        Complex nr = new Complex(1,2);
        nr.showNumber(nr);
        Complex nr2 = new Complex(1,2);
        nr.addWithNumber(nr2);
        nr.showNumber(nr2);

    }


}
