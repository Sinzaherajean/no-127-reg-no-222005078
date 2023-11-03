public class switch1 { //this program will display number of workers
public static void main(String[] args){ //main method which will display the program 
    int numberworkers = 4; //declar and initialize one variable int numberworkers=4
    switch(numberworkers){ //condition
        case 1: //case 1
        System.out.println("serve 10clients");//output if case one is equal to variable
        break;//stop to excute the condition
        case 2://to excute the condition
        System.out.println("serve 20 clients") // output
        break;
        case 3: // case 3
        System.out.println("serve 30 clients"); // output
        break;
        case 4: // condition
        System.out.println("serve 40 clients"); // output
        break; // excut condition
        default: // if no cases match with the condition
        System.out.println("no client to serve"); //print disable if all conditions does not match

    }

}    
}
