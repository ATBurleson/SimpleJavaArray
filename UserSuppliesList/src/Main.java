import java.util.Scanner;//import the scanner class to get user input

public class Main {
    public static void main(String[] args)
    {
        //instantiate a scanner object and assign it to a scanner constructor.
        //Scanner object = new constructor -> Scanner(method)
        Scanner MyObj = new Scanner(System.in);

        //we need to get the number of items from the user and pass as the size of an array
        //and to be sure, print the array size to the screen.
        System.out.print("How many items do you need:");
        int NumberOfItems = MyObj.nextInt();

        //Java style array is datatype[] name or C style array datatype name[] both is fine.
        //allocate that array size by using the 'new' keyword.
        String[] MyListArray = new String[NumberOfItems];
        System.out.println("The user needs: " + MyListArray.length + " items.");

        //let the user enter the items in the array of size NumberOfItems.
        System.out.println("Enter a list of items:");
        for(int i = 0; i < NumberOfItems; i++)
        {
            MyListArray[i] = MyObj.next();
        }

        //print the users entered items in the array of size NumberOfItems to the screen.
        System.out.println("The Array consists of:");
        for(int x = 0; x < NumberOfItems; x++)
        {
            System.out.println(MyListArray[x]);
        }

        System.out.println(" ");

        //print the users entered items in the array of size NumberOfItems to the screen with the index location.
        for(int y = 0; y < NumberOfItems; y++)
        {
            System.out.println( MyListArray[y] + " is in index " + y);
        }


    }
}