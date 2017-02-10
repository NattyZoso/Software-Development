import java.util.Scanner;
public class PayrollConsole {

	public static void main(String[] args) {
		//get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		
		//process data
		double grossPay = (hours * payRate);
		double fedWithholding = (grossPay * fedRate);
		double stateWithholding = (grossPay * stateRate);
		double totalDeduction = (fedWithholding + stateWithholding);
		double netPay = (grossPay - totalDeduction);
		
		//output results
		System.out.printf("\nEmployee Name: %s\n" , name);
		System.out.printf("Hours Worked: %.2f\n", hours);
		System.out.printf("Pay Rate: $%.2f\n", payRate);
		System.out.printf("Gross Pay: $%.2f\n", grossPay);
		System.out.println("Deductions: ");
		System.out.printf("   Federal Withholding (%.2f%%): $%.2f\n",100 * fedRate, fedWithholding);
		System.out.printf("   State Withholding (%.2f%%): $%.2f\n",100 * stateRate, stateWithholding);
		System.out.printf("   Total Deduction: $%.2f\n", totalDeduction);				
		System.out.printf("Net Pay: $%.2f\n", netPay);	
	}

}
