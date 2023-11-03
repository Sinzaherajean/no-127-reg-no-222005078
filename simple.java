public class simple { // this program is going to calculate simple

    public static double data(double principal, double rate,int time) //variable declaration
{
    return(principal*(rate/100)*time); // calculate simple by this formula
}
public static void main(String[] args){// the main method
    simple gain=new simple();
    int p=100000; // variable declaration
    int r=5; // variable
    int t=5; // variable
    double result=gain.data(p,r,t); // decl    System.out.println("the simple interest is:"+" "+result); //print output
}
}