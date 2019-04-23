/*
 * File: Main.java
 * Description: Prompts User for names, and searches for specified names in the data structure
 * Developer: Jose Ceballos
 * Email: Josec5064@student.vvc.edu
 * */

import java.util.ArrayList; //Gives access to ArrayList

import java.util.Scanner; //Allows ability to get user input 

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        String choice;
        
        boolean isOver = false; //Controls Menu
        
        //Menu Prompt
        while(!isOver)
        {    
            
            System.out.printf("\n\n==================================\n");
            System.out.printf("To Add Names Enter(1)\n");
            System.out.printf("To Search For A Name Enter(2)\n");
            System.out.printf("To Quit the program Enter (3)\n");
            System.out.printf("==================================\n\n");
            choice = readInput();
            if(choice.equals("1"))
            {
                getNames(names); //Adds More Names to List
            }
            else if(choice.equals("2"))
            {
                if(names.size() <= 0)
                {
                    System.out.printf("\n\nPlease add a Name first before Search\n\n");
                }
                else
                {
                    System.out.printf("\n\nThe Position of the Specified Name is: %d\n\n",findNamePos(names));
                }
            }
            else
            {
                isOver = true;
            }
        }
    }

    /* Method: 
     *        - Will read inInput from user and return it as a String variable
     * */
    public static String readInput()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine(); 
    }

    /* Method:
     *        - Will prompt the User for a given name 
     *        - Store the name in the ArrayList<String> parameter names
     *        - And Ask them if they would like another name
     * */
    public static void getNames(ArrayList<String> names)
    {
        boolean done = false; //Will control the loop
        String choice; //Determines if more names should be entered 
        do
        {
            System.out.println("Please Enter a Name");
            names.add(readInput()); //Getting user input and storing it in ArrayList
            System.out.printf("\nWould You like to input another name? (y/n)\n\n");
            choice = readInput(); 
        }while(choice.equals("Y") || choice.equals("y"));  
    }
 
    /* Method: 
     *        - Will prompt the User for a name in the ArrayList<String> 
     *        - Check if the name entered is valid 
     *        - And Return the position of where the name is in the list 
     * */   
    public static int findNamePos(final ArrayList<String> names)
    {
        String nameToSearch; //Variable will hold the name the user wants to search for 
        System.out.printf("\n\nNow Enter a Name from the collection of the previous names entered\n");
        nameToSearch = readInput(); //Getting User input
        nameToSearch = validate(nameToSearch, names); //Validating User Input
        return names.indexOf(nameToSearch); //Returns Position
    }

    /* Method: 
     *        - Will compare the String toCheck with the ArrayList of validAnswers
     *        - It will guarantee a valid answer 
     *        - return the valid answer at the end 
     * */
    public static String validate(String toCheck, final ArrayList<String> validAnswers)
    {
       boolean isValid = false; //Loop controller
       String temp = toCheck; 
       while(!isValid)
       {
           //Checking if the toCheck String is a Valid Answer
           for(String element : validAnswers)
           {
               if(temp.equals(element))
               {
                   isValid = true; //We have a valid Answer
               }
           }
           if(!isValid) //If not a valid answer
           {
                System.out.println("Please Enter Valid Answer (TRY AGAIN)");
                temp = readInput(); //Getting their input again
           }
       }
       return temp; //Returning the Valid Answer
    }
}

