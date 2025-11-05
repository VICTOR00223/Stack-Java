import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack myStack = new Stack();

        String choice;
        System.out.println("Enter I to insert, R to remove, P to print, E to exit");
        choice = sc.nextLine();
        while(!choice.equals("E"))
        {
            switch(choice)
            {
                case "I":
                {
                    System.out.print("Enter key = ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    if (myStack.exist(key))
                    {
                        System.out.println("This key already exists.");
                    }
                    else
                    {
                        myStack.insert(key);
                    }
                    break;
                }
                case "R":
                {
                    myStack.remove();
                    break;
                }
                case "P":
                {
                    myStack.print();
                    break;
                }
                case "E":
                {
                    break;
                }
            }
            System.out.println("Enter I to insert, R to remove, P to print, E to exit");
            choice = sc.nextLine();
        }
        System.out.println("End of program.");
    }
}
