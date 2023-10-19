package counter;

import java.util.Scanner;

public class Counter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parameterOne = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parameterTwo = sc.nextInt();
		
		try {
			// Calling the method containing the counting logic
			count(parameterOne, parameterTwo);
			
		} catch (InvalidParametersException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	
	static void count(int parameterOne, int parameterTwo) throws InvalidParametersException	{
		
		// Validate if parameterOne is GREATER than parameterTwo and throw the exception
		if (parameterTwo < parameterOne) {
			throw new InvalidParametersException();
		}
		
		int count = parameterTwo - parameterOne;
		
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			
		}
	}

}
