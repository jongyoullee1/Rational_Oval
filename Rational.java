/*
James Cao, Jongyoul Lee
APCS1 pd9
HW33 -- Do You Even Add, Bro?
2015-11-18
*/
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
	numerator=numerator * s.denominator + denominator * s.numerator;
	denominator = denominator * s.denominator;
    }
    public void subtract(Rational s) {
	Rational r = new Rational (-s.numerator,s.denominator);
	this.add(r);
    }
    
      // Finds the GCD of two integer inputs recursively.
    public static int gcdER (int a, int b){
        if ((a == b) || (b == 0)){
            return a;} //returns the GCD.
        else if (a < b){
            return gcdER (b,a);} //If b is greater than a, the function will be run again with both values swapped.
        else{
            return gcdER (b , (a-b));
        }
    } //Recalls the function with b and the difference between a and b.
    
    public void reduce(){
        int GCD = gcdER (this.numerator, this.denominator);
        numerator /= GCD;
        denominator /= GCD;
    }
    
    
    
    public static void main(String[] args) {
        /*Rational r = new Rational(2,3); 
        Rational s = new Rational(1,2); 
        r.multiply(s);
        System.out.println(r);
        Rational t = new Rational(2,3); 
        Rational u = new Rational(1,2); 
        t.divide(u);
        System.out.println(t);*/
	    Rational v = new Rational(2,3); 
        Rational w = new Rational(1,2); 
        Rational x = new Rational (7,6);
        v.add(w);
        System.out.println(v);
        v.subtract (x);
        System.out.println(v);
        Rational y = new Rational (2,4);
        System.out.println (y);
        y.reduce();
        System.out.println (y);
        
       
    }
}
