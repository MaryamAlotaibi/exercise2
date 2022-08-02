import java.lang.reflect.Array;
import java.util.Arrays;
public class round {
    //exercise1~~~~~~~

    public static void main(String[] args) {
        String userName[] = new String[3];
        userName[0] = "Saleh";
        userName[1] = "Khalid";
        userName[2] = "Majed";

        System.out.println(Arrays.toString(userName));
        //exercise2


        for (int num = 1; num <= 33; num = num + 1) {
            if (num % 5 == 0) {
                continue;
            }else
            {
                System.out.println("This is don't accept multiple 5 " + num);
            }
        }

    }
}


import java.util.*;
        import java.util.stream.*;
//exercise3~~~~~~~~~~
public class factorial1
{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};

        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + " ");

        System.out.println();

        System.out.println("reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + " ");
    }
}


import java.util.*;
        import java.util.stream.*;
//exercise4~~~~~~~~~~~
public class factorial1
{
    public static void main(String[] args) {
        String[] names = {"Muneer","Maryam", "Faisal", "Areej", "Ahmed", "Asma",
                "Abeer", "Lamia", "Saud", "Sara"};

        for (int i =0; i< names.length; i++)
        {
            if (names[i].charAt(0) != 'A')
            {
                System.out.println(names[i]);
            }
        }
    }
}
import java.util.*;
        import java.util.stream.*;
//exercise5$6~~~~
public class factorial1
{
    public static void main(String[] args) {
        int number[] = new int[3];
        number[0]=100;
        number[1]=500;
        number[2]=1000;
        System.out.println(Arrays.toString(number));

        fullName("Ali","Mohammed");
        fullName("Reem","Abduallah");


    }
    public static void fullName(String firstName ,String lastName ){

        if(firstName.equals("Reem")){
            return;
        }
        System.out.println("Hey "+ firstName + " "+ lastName +" "+ " from  helloMessage ");


    }
}