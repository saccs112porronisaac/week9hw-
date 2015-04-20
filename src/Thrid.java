import  java.util.Scanner;


public class Thrid 


{
	public void next()
	{
	
	
	Scanner Input = new Scanner(System.in);
	
	int playerguess;
	int computerguess;
	String playerInput;
	int count = 1;
	String convertion;
	String odd;
	String even;
	
	while ( count < 6)
	{
		computerguess = 0 + (int)(Math.random ()*6);
		
		
		System.out.println("Please guess if it's even or odd:");
		playerInput = Input.next();
		
		System.out.println("Computer guess is " + computerguess );
		
		if (computerguess == 0)
		{
			System.out.println("0 is neither even nor odd. Try again.");
			System.out.printf( "Round %d \n" , count++);
		}
		
		switch ( computerguess )
		{
		case 1: convertion = "odd"; 
			switch ( playerInput )
			{
			case "even": System.out.println("It's odd. You lose!");break;
			case "odd": System.out.println("It's odd. You win!");break;
			}
			System.out.printf( "Round %d \n" , count++);
			break;
		case 2: convertion = "even"; 
			switch ( playerInput ){
			case "even": System.out.println("It's even. You win!");break;
			case "odd": System.out.println("It's even. You lose!");break;
			}
			System.out.printf( "Round #%d \n" , count++);
			break;
		case 3: convertion = "odd"; 
			switch ( playerInput ){
			case "even": System.out.println("It's odd. You lose!");;break;
			case "odd": System.out.println("It's odd. You win!");break;
			}
			System.out.printf( "Round #%d \n" , count++);
			break;
		case 4: convertion = "even"; 
			switch ( playerInput ){
			case "even": System.out.println("It's even. You win!");break;
			case "odd": System.out.println("It's even. You lose!");break;
			}
			System.out.printf( "Round #%d \n" , count++);
			break;
		case 5: convertion = "odd"; 
			switch ( playerInput )
			{
			case "even": System.out.println("It's odd. You lose!");break;
			case "odd": System.out.println("It's odd. You win!");break;
			}
			System.out.printf( "Round #%d \n" , count++);
			break;
		case 6: convertion = "even";
			switch ( playerInput )
			{
			case "even": System.out.println("It's even. You win!");break;
			case "odd": System.out.println("It's even. You lose!");break;
			}
			System.out.printf( "Round #%d \n" , count++);
			break;
		}
		}
	}
}
