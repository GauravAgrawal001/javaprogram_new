import java.util.Scanner;
public class Max_Of_Three{
public static void main(String[] args){
	Scanner sa=new Scanner(System.in);
	System.out.println("Enter the first number");
		int number1=sa.nextInt();
	System.out.println("Enter the Second number");
	int number2=sa.nextInt();
	System.out.println("Enter the Third number");
		int number3=sa.nextInt();
     System.out.println(( number1<number2)&&(number1<number3));
}
}