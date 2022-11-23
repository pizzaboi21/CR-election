import java.util.*;
public class Main
{   
    int a=0;
    int b=0;
    int c=0;
    int d=0;    
    void vote()
    {
        System.out.println("Please Choose the Candidate which you want to vote for. \n Enter 1 for Candidate A \n Enter 2 for candidate B \n Enter 3 for candidate C \n Enter 4 for candidate D ");
        Scanner sc = new Scanner(System.in);
        int vote = sc.nextInt(); 
        // Switch statement with int data type
        switch (vote) {  
        // Case
        case 1:
            a++;
            break;
  
        // Case
        case 2:
            b++;
            break;
  
            // Case
        case 3:
           c++;
           break;
  
            // Case
        case 4:
            d++;
            break;

        // Default case
        default:
            System.out.println("invalid number");
        }           
        
    }    
    void checkvote()
    {
        System.out.println("The current number of votes for candidate A are:"+a+"\n");
        System.out.println("The current number of votes for candidate B are:"+b+"\n");
        System.out.println("The current number of votes for candidate C are:"+c+"\n");
        System.out.println("The current number of votes for candidate D are:"+d+"\n");
        
    }    
   void maxvotes()
    {
        int ab=(Math.max(a,b));
        int cd=(Math.max(c,d));
        int abcd=(Math.max(ab,cd));

        if(abcd==a)
        {
            System.out.println("The winner is a with votes "+a);
        }
        else if(abcd==b)
        {
            System.out.println("The winner is b with votes "+b);
        }
        else if(abcd==c)
        {
            System.out.println("The winner is c with votes "+c);
        }
        else if(abcd==d)
        {
            System.out.println("The winner is d with votes "+d);
        }
        
    }    
	public static void main(String[] args) {
		Main obj = new Main();
        Scanner sc=new Scanner(System.in);
        int i=5;
        while(i>=0)
        {
        System.out.println("Press 1 if you wanna vote \n Press 2 if you wanna check the votes\n and Press 0 if you wanna exit");
        int  choice= sc.nextInt();
        switch(choice)
        {
            case 0:
            System.exit(0);
            break;
        //Case
            case 1:
            obj.vote();
            break;
  
        // Case
            case 2:
            obj.checkvote();
            break;

            default:
            System.out.println("Invalid Input");
        }
        i--;
        }
		obj.maxvotes();		
	}
}