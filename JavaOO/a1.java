import java.util.Scanner;
public class a1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오.");
				
		int a= scanner.nextInt();
		int	b= scanner.nextInt();
		int sum;
		int mul;
		
		sum=a+b;
		mul=a*b;
		
		System.out.printf("두 수의 합 : %d\n",sum);
		System.out.printf("두 수의 곱 : %d\n",mul);
		
		
		

	}

}
