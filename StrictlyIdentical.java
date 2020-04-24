import java.util.Scanner;
public class StrictlyIdentical {
    
    public static void StrictlyIdentical(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //assigning array size of 5 to both arrays
        int array1[] = new int[5];
        int array2[] = new int[5];

        //Prompt user for input and store the input of 5 elements for list1
        System.out.println("Enter 5 elements of list1: ");
        for(int n = 0;n<5;n++)
        {
          array1[n] = scanner.nextInt();
        }

        //Prompt user for input and store the input of 5 elements for list2
        System.out.println("Enter 5 elements of list2: ");
        for(int n = 0;n<5;n++)
        {
          array2[n] = scanner.nextInt();
        }

        //Calls on outside method if array1 & array2 are identical 
        if(equals(array1,array2))
        {
          System.out.println("Two lists are strictly identical.");
        }
        else{
          System.out.println("Two lists are not strictly identical.");
        }
    }
        //Pass the reference of list1 and list2 to the array variables array1 and array2  
        public static boolean equals (int[]array1, int[]array2){
        for(int n = 0;n<array1.length;n++)
        {
            if(array1[n]!=array2[n])
            {
                return false;
            }
        }
        return true;
    }

}

//Sample Run:
//Enter 5 elements of list1: 
//1 2 3 4 5
//Enter 5 elements of list2: 
//1 2 3 4 5
//Two lists are strictly identical.
 