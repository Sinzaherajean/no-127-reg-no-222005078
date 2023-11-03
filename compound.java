     //this program is going to calculate compound interest
public class compound{
    static double simp(double p, double r, double t, double n){ //variable declaration
        return p*(Math.pow(1+(r/(n*100)),n*t)); //the formula to colculate the CI 
    }
    public static void main(String[] args) { // the main method
        compound c= new compound();
        System.out.println("the amount  he will have paid after 3 yearsperiod is equal to: " + simp(500000,18,3,12));
    //this generete the output of compound interest
}
    
}
