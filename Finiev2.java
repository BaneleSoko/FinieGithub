import java.text.DecimalFormat;
import java.util.Scanner;

public class Finiev2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        String sPassword, sStudent, sPlan;
        double rMonthlyIncome, rExpense, rAfterExpense, rSaving, rLeft, rInvest;
        final String USER_NAME="Banele Soko",PASSWORD="banele";


        while(true){
            // Asking for user input
            System.out.print("Welcome "+USER_NAME+" TO FINIE \n Enter your password ");
            sPassword = kb.nextLine();

       

            if(sPassword.equals(PASSWORD)){
                System.out.print("Are you a student? (Y/N) ");
                sStudent = kb.nextLine();

                while (true) {
                    if (sStudent.equalsIgnoreCase("Y")) {
                        // Student branch
                        System.out.print("How much money do you receive in a month? ");
                        rMonthlyIncome = kb.nextDouble();

                        System.out.println("From R" + formatter.format(rMonthlyIncome) + ", how much do you spend on expenses?");
                        rExpense = kb.nextDouble();

                        rAfterExpense = rMonthlyIncome - rExpense;

                        
                        kb.nextLine(); 

                        System.out.print("Would you like a savings/spending plan? (Y/N) ");
                        sPlan = kb.nextLine();

                        while (true) {
                            if (sPlan.equalsIgnoreCase("Y")) {
                                final double SAVE_PER = 0.40;  // Save 40% after expenses
                                rSaving = SAVE_PER * rAfterExpense;
                                rLeft = rAfterExpense - rSaving;

                                System.out.println("This plan helps you save 40% of your money after expenses. "
                                        + "You will be saving R" + formatter.format(rSaving)
                                        + " and have R" + formatter.format(rLeft) + " left to spend freely. \n thank you for using finie");
                                break;
                            } else if (sPlan.equalsIgnoreCase("N")) {
                                System.out.println("You have R" + formatter.format(rAfterExpense)
                                        + " left. Remember to spend wisely :) \n Thank you for using finie");
                                break;
                            } else {
                                System.out.println("Please select only Y(YES) or N(NO).");
                            }
                        }
                        break;

                    } else if (sStudent.equalsIgnoreCase("N")) {
                        // Non-student branch
                        System.out.print("How much money do you receive in a month? ");
                        rMonthlyIncome = kb.nextDouble();

                        System.out.println("From R" + formatter.format(rMonthlyIncome) + ", how much do you spend on expenses?");
                        rExpense = kb.nextDouble();

                        rAfterExpense = rMonthlyIncome - rExpense;

                        
                        kb.nextLine();

                        System.out.print("Would you like a savings/spending/investing plan? (Y/N) ");
                        sPlan = kb.nextLine();

                        while (true) {
                            if (sPlan.equalsIgnoreCase("Y")) {
                                final double SAVE_PER = 0.30, INVEST_PER = 0.30;
                                rSaving = SAVE_PER * rAfterExpense;
                                rInvest = INVEST_PER * rAfterExpense;
                                rLeft = rAfterExpense - rSaving - rInvest;

                                System.out.println("This plan helps you save 30% of your money and invest another 30% after expenses. "
                                        + "You will be saving R" + formatter.format(rSaving)
                                        + ", investing R" + formatter.format(rInvest)
                                        + ", and have R" + formatter.format(rLeft) + " left to spend freely. \n Thank you for using finie");
                                break;

                            } else if (sPlan.equalsIgnoreCase("N")) {
                                System.out.println("You have R" + formatter.format(rAfterExpense)
                                        + " left. Remember to save, invest, and spend wisely :) \n thank you for using finie");
                                break;

                            } else {
                                System.out.println("Please select only Y(YES) or N(NO).");
                            }
                        }
                        break;

                    } else {
                        System.out.println("Please select only Y(YES) or N(NO).");
                        sStudent = kb.nextLine();
                    }
                }//while for the Student or not.
                break;
            }
            else{
                System.out.println("Wrong pasword");
            }
            
            
            

            

        }
        
        kb.close();
    }//public static void
}
