public class BirthMonth {

    public static void main(String[] args) {

        int birthMonth = 7;

        System.out.println("Please enter your birth month.");

        //user input, but instead I'll assign the variable

        if(birthMonth >= 1 & birthMonth <= 12)
        {
            if(birthMonth == 1)
            {
                System.out.println("Your birth month is: January!");
            }
            else if (birthMonth == 2){
                System.out.println("Your birth month is: February!");
            }
            else if (birthMonth == 3){
                System.out.println("Your birth month is: March!");
            }
            else if (birthMonth == 4){
                System.out.println("Your birth month is: April!");
            }
            else if (birthMonth == 5){
                System.out.println("Your birth month is: May!");
            }
            else if (birthMonth == 6){
                System.out.println("Your birth month is: June!");
            }
            else if (birthMonth == 7){
                System.out.println("Your birth month is: July!");
            }
            else if (birthMonth == 8){
                System.out.println("Your birth month is: August!");
            }
            else if (birthMonth == 9){
                System.out.println("Your birth month is: September!");
            }
            else if (birthMonth == 10){
                System.out.println("Your birth month is: October!");
            }
            else if (birthMonth == 11){
                System.out.println("Your birth month is: November!");
            }
            else{
                System.out.println("Your birth month is: December!");
            }
        }
        else
        {
            System.out.println("You entered an incorrect month value:" + birthMonth + ".");
        }
    }
}
