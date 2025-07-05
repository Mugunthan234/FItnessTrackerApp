import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome the FitnessTrackerApp \nEnter Your details to Start");

        System.out.println("Enter Your UserName: ");
        String userName = sc.nextLine();
        userName = Character.toUpperCase(userName.charAt(0)) + userName.substring(1);
        System.out.println("Enter Your Age " + userName+": ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Gender " + userName+" if age 1-8 (Children) or 6-12 Months (Baby) or 0-6 Months (Infant): ");

        String gender = sc.nextLine();
        gender= Character.toUpperCase(gender.charAt(0)) + gender.substring(1);

        if(age>0){
        if(age>=60 && Objects.equals(gender, "Male")){
            System.out.println("Drink Water Around 2.5 to 3.0 Liters/Day (Based on activity & health)");

        } else if(age>=60 && Objects.equals(gender, "Female")){
            System.out.println("Drink Water Around 2.0 to 2.5 Liters/Day (Based on activity & health)");

        } else if(age>=19 && Objects.equals(gender,"Male")){
            System.out.println("Drink Water 3.7 Liters/Day");

        } else if(age>=19 && Objects.equals(gender,"Female")){
            System.out.print("As an Adult Drink Water 2.7 Liters/Day\nInCase You're a Pregnant Women: Drink Water 3.0 Liters/Day\nIncase You're a Breastfeeding Women: Drink Water 3.8 Liters/Day\n");

        } else if(age>=14 && age<=18 && Objects.equals(gender,"Male")){
            System.out.println("Drink Water 3.3 Liters/Day");

        } else if(age>=14 && age<=18 && Objects.equals(gender,"Female")){
            System.out.println("Drink Water 2.3 Liters/Day");

        } else if(age>=9 && age<=13&& Objects.equals(gender,"Male")){
            System.out.println("Drink Water 2.4 Liters/Day");

        } else if(age>=9 && age<=13&& Objects.equals(gender,"Female")){
            System.out.println("Drink Water 2.1 Liters/Day");

        } else if(age>=4 && age<=8&& Objects.equals(gender,"Children")){
            System.out.println("Drink Water 1.7 Liters/Day");

        } else if(age<= 3 && Objects.equals(gender, "Children")){
            System.out.println("Drink Water 1.3 Liters/Day");

        }
        } else{
            System.out.println("You Entered the Wrong Age.");

        }
    }
}