import java.util.*;

public class CalorieCalculator{
    static int  age,activitylevel,gender;
    static double weight,height;
    static double bmr,calorieneeds;
    public static void main(String[] args){
        UserInput();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Please Validate your Entries: ");
        System.out.println("--------------------------------------------------------------------");
        PrintValues();
        CalculateBMR();
        CalorieNeeds();
        System.out.println("Your Basal Metabolic Rate (BMR) is: " + (int) bmr + " calories per day.");
        System.out.println("Your estimated daily calorie needs are: " + (int) calorieneeds + " calories per day.");
    }

    
    public static void UserInput()
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Gender: \n 1.Male \n 2.Female \n 3.Other");
            gender = sc.nextInt();
            if(gender==1 || gender==2 || gender==3)
                break;
            else
                System.out.println("Enter Valid option: ");
        }       
        
        System.out.println("Enter age: ");
        age = sc.nextInt();
        
        System.out.println("Enter weight(in kgs): ");
        weight = sc.nextFloat();
        
        System.out.println("Enter height(in cms): ");
        height = sc.nextFloat();

        while (true) 
        {
            System.out.print("Select your Activity Level : \n");
            System.out.print("1.Sedentary \n 2.Exercise 1-3 times/week \n 3.Exercise 4-5 times/week \n 4.Daily Exercise 3-4 times/week \n 5.Intense Exercise (6-7 times/week) \n 6.Very Intense(physical job) \n" );
            activitylevel = sc.nextInt();
            if(activitylevel==1 || activitylevel==2 || activitylevel==3 || activitylevel==4 || activitylevel==5 || activitylevel==6) 
                break;        
            else
                System.out.println("Enter Valid option");
        }
        sc.close();
    }
    
    public static void CalculateBMR()
    {
        switch (gender) {
            case 1:
                bmr  = Math.round(88.362 + (13.397*weight)+(4.799*height)-(5.677*age));
                break;
            case 2:
                bmr = Math.round(447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
                break;
            case 3:
                bmr = Math.round(88.362 + (13.397*weight)+(4.799*height)-(5.677*age));
                break;
            default:
                break;
        }
        // return bmr;
    }
    
    public static void CalorieNeeds()
    {
        switch (activitylevel) {
            case 1:
                calorieneeds =  bmr*1.2;
                return;              
            case 2:
                calorieneeds =  bmr*1.375;
                return;
            case 3:
                calorieneeds =  bmr*1.418;
                return;
            case 4:
                calorieneeds = bmr*1.55;
                return;
            case 5:
                calorieneeds = bmr*1.725;
                return;
            case 6:
                calorieneeds = bmr*1.9;
                return;
        }
    }

    public static void PrintValues()
    {
        System.out.println("age : "+age);
        System.out.print("gender: ");
        switch (gender) {
            case 1:
                System.out.println("Male");
                break;
            case 2:
                System.out.println("Female");
                break;
            case 3:
                System.out.println("Other");
                break;
            default:
                break;
        }
        System.out.print("Activity Level: ");
        switch (activitylevel) {
            case 1:
                System.out.println("Sedentary");
                break;
            case 2:
                System.out.println("Exercise 1-3 times/week");
                break;
            case 3:
                System.out.println("Exercise 4-5 times/week");
                break;
            case 4:
                System.out.println("Daily Exercise 3-4 times/week");
                break;
            case 5:
                System.out.println("Intense Exercise (6-7 times/week)");
                break;
            case 6:
                System.out.println("Very Intense(physical job)");
                break;
            default:
                break;
        }
        System.out.println("Weight: "+weight);
        System.out.println("Height: "+height);
        System.out.println("--------------------------------------------------------------------");
        
    }

}