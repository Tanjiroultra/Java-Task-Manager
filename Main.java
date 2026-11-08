import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int choice;
         ArrayList<Task> tasks = new ArrayList<>();

        do{
        System.out.println("================================");
        System.out.println("       MY TASK MANAGER          ");
        System.out.println("================================");

        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice ");

         choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Write your Task");
            
           scanner.nextLine(); // Consume remaining newline
             String task = scanner.nextLine();
             tasks.add(new Task(task));
             System.out.println(task + " Task added");
        }
        else if(choice == 2){
            System.out.println("Your Task are");

            for(int i = 0;i<tasks.size();i++){
                String px = "[Pending]";
                String qx = "[Completed]";
                if(tasks.get(i).completed == false){
                System.out.println((i+1) +" "+ px+" " +tasks.get(i).description);
                }
                else{
                    System.out.println((i+1) +" "+ qx+" " +tasks.get(i).description);
                }
            }

        }
        
        else if(choice ==3){
            System.out.println("Your Task are");
            String px = "[Pending]";
            String qx = "[Completed]";

            for(int i = 0;i<tasks.size();i++){
                
                if(tasks.get(i).completed == false){
                System.out.println((i+1) +" "+ px+" " +tasks.get(i).description);
                }
                else{
                    System.out.println((i+1) +" "+ qx+" " +tasks.get(i).description);
                }
            }
            System.out.print("Enter task number to complete: ");
            int opt = scanner.nextInt();

            int fopt = opt - 1; 

            if (opt >= 1 && opt <= tasks.size()) {
                 tasks.get(fopt).completed = true;
}
             else {
              System.out.println("Invalid task number!");
     }

            

        }


        else if(choice == 4){
            System.out.println("Exiting Task Manager");
        }
        else{
            System.out.println("Invalid Choice");
        }
    }while(choice != 4);

        
        scanner.close();
    }
}