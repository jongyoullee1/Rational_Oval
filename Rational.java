public class Rational {
    private int numerator;
    private int denominator;
    public Rational() {
	    numerator = 0;
	    denominator = 1;
    }
    public Rational(int numer, int denom) {
	    this();
	    if (denom == 0) {
	        System.out.println("ERROR! Rational created with zero denominator");
	    } else {
	        numerator = numer;
	        denominator = denom;
    	}
    }
    public String toString() {
    	return numerator + "/" + denominator;
    }
    public double floatValue() {
    	return (double)numerator / denominator;
    }
    public void multiply (Rational s) {
        this.numerator=this.numerator*s.numerator;
        this.denominator=this.denominator*s.denominator;
    }
    public void divide (Rational s) {
        Rational a = new Rational(s.denominator,s.numerator);
        this.multiply(a);
    }
    public void add(Rational s) {
	this.numerator=this.numerator * s.denominator + this.denominator * s.numerator;
	this.denominator = this.denominator * s.denominator;
    }
    public void subtract(Rational s) {
	new Rational r = new Rational (-s.numerator,s.denominator);
	this.add(r);
    }
    public static void main(String[] args) {
        Rational r = new Rational(2,3); 
        Rational s = new Rational(1,2); 
        r.multiply(s);
        System.out.println(r);
        Rational t = new Rational(2,3); 
        Rational u = new Rational(1,2); 
        t.divide(u);
        System.out.println(t);
	Rational v = new Rational(2,3); 
        Rational w = new Rational(1,2); 
        v.add(w);
        System.out.println(v);
    }
}
