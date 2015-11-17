public class Rational {
    private int numerator;
    private int denominator;
    public Rational() {
	numerator = 0;
	denominator = 1;
    }
    public Rational(int numer, int denomer) {
	this();
	if (denomer == 0) {
	    System.out.println("ERROR! Rational created with zero denominator");
	} else {
	    numerator = numer;
	    denominator = denomer;
	}
    }
    public String toString() {
	return numerator + "/" + denominator;
    }
    public double floatValue() {
	return (double)numerator / (double)denominator;
    }
}
