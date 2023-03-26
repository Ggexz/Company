import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to employee program");
      String firstmessage="Choices.....\n"
    		  +"1.Sofware Developer Operations\n"
    		  +"2.Executive Operations\n"
    		  +"if u want quit press q...\n";
      System.out.println("****************************");
      System.out.println(firstmessage);
      System.out.println("****************************");
      while(true) {
    	  System.out.println("Choose operations");
    	  String operations=scanner.nextLine();
    	  if(operations.equals("q")) {
    		  System.out.println("Exiting.....");
    		  break;
    	  }
    	  else if(operations.equals("1")) {
    		  softwaredev sf1=new softwaredev("Steven", "Jab", 205, "Python , Java , C# ");
    		  String softwareop="1.Reset Os....\n"
    				  +"2.Show info....\n"
    				  +"if u want quit press q...\n";
    		  System.out.println(softwareop);
    		  while(true) {
    			  System.out.println("Choose operations");
    			  String yOperations=scanner.nextLine();
    			  if(yOperations.equals("q")) {
    				  System.out.println("Exiting software developer program.. ");
    				  break;
    			  }
    			  else if(yOperations.equals("1")) {
    				  System.out.println("Enter OS");
    				  String operating_System = scanner.nextLine();
    				  sf1.reset(operating_System);
    			  }
    			  else if(yOperations.equals("2")) {
    				  sf1.showinfo();
    			  }
    			  else {
    				  System.out.println("Incorrect operaiton");
    			  }
    		  }
    	  }
    	  else if(operations.equals("2")) {
    		  executive ex1=new executive("Mark", "Yans", 12, 1045);
    		  String executiveop="1.Make a raise....\n"
    				  +"2.Show info....\n"
    				  +"if u want quit press q...\n";
    		  System.out.println(executiveop);
    		  while(true) {
    			  System.out.println("Choose operations");
    			  String eOperations=scanner.nextLine();
    			  if(eOperations.equals("q")) {
    				  System.out.println("Exiting executive program.." );
    				  break;
    			  }
    			  else if(eOperations.equals("1")) {
					System.out.println("Enter the amount of money");
					int money=scanner.nextInt();
					ex1.raise(money);
				  }
    			  else if(eOperations.equals("2")) {
    				  ex1.showinfo();
    			  }
    			  else {
    				  System.out.println("Incorrect operaiton");
    			  }
    		  }
    	  }
    	  else {
    		  System.out.println("Incorrect operaiton");
    	  }
      }
	}

}