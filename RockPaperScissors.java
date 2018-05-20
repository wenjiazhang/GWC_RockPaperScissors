import java.util.*;
public class RockPaperScissors {
	public static void main(String[] hello){
		String response;
		double rand = Math.random();
		Scanner sc = new Scanner(System.in);
		Long start = System.currentTimeMillis();
		boolean running = true, running1 = true;
		
		System.out.println("Welcome to Wendy's Rock, Paper, Scissors game! "
				+ "Enter your hand ('rock', 'paper', or 'scissors') on count to three.");
		
		while (running){
			while(System.currentTimeMillis() - start < 1000){}
			start = System.currentTimeMillis();
			
			System.out.println("One.");
			
			while(System.currentTimeMillis() - start < 1000){}
			start = System.currentTimeMillis();
			
			System.out.println("Two.");
			
			while(System.currentTimeMillis() - start < 1000){}
			start = System.currentTimeMillis();
			
			System.out.println("Three!");
			
			response = sc.nextLine().toLowerCase();
			if (response.equals("rock") || response.equals("paper") || 
					response.equals("scissors")){
				if (rand < 0.33){
					System.out.println("The computer played "+win(response)+". You win!");
				}else if(rand > 0.66){
					System.out.println("The computer played "+lose(response)+". You lose!");
				}else{
					System.out.println("The computer played "+response+". It's a tie!");
				}
				System.out.println("Play again? (Y/N)");
				while(running1){
					response = sc.nextLine().toLowerCase();
					if(response.equals("y") || response.equals("yes")){
						running1 = false;
					}
					if(response.equals("n") || response.equals("no")){
						running1 = false;
						running = false;
						System.out.println("Goodbye!");
					}
				}
				running1 = true;
				rand = Math.random();
			}else{
				System.out.println("You didn't input a valid hand! Try again.");
			}
		}
		sc.close();
	}
	
	private static String win(String in){
		if (in.equals("rock")){
			return "scissors";
		}else if(in.equals("paper")){
			return "rock";
		}else{
			return "paper";
		}
	}
	
	private static String lose(String in){
		if (in.equals("rock")){
			return "paper";
		}else if(in.equals("paper")){
			return "scissors";
		}else{
			return "rock";
		}
	}
}
