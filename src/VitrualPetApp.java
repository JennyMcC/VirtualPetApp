import java.util.Scanner;

public class VitrualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet duck = new VirtualPet();
		duck.name = "Fiona";
		
		System.out.println("Meet Fiona, your new pet duck.");
		System.out.println("Here is how Fiona is feeling today on a scale from 1-100:" + "\n1. hunger = " + duck.hunger + "\n2. thirst = " + duck.thirst + "\n3. fatigue = " + duck.fatigue + "\n4. boredom = " + duck.boredom);
		
		System.out.println("        ,~~.");
		System.out.println("       (  6 )-_,");
		System.out.println("  (\\___ )=='-' ");
		System.out.println("   \\ .   ) )");
		System.out.println("    \\ `-' /    ");
		System.out.println(" ~'`~'`~'`~'`~");
		
		
	do {
		
		System.out.println("To feed Fiona enter 1, to give Fiona something to drink enter 2, to help Fiona sleep enter 3, to play with Fiona enter 4");
		
		int interact = input.nextInt();
		
		  switch (interact) {
		  case 1:
			  if (duck.isHungry()) {
				System.out.println("What would you like to feed her? bread or grapes?");
				String food = input.next();
					if (food.toLowerCase().equals("bread")) {
						duck.feed();
						System.out.println("You fed Fiona free bread from Subway!");
						System.out.println("Fiona's hunger level is now: " + duck.hunger);
					} else if (food.toLowerCase().equals("grapes")) {
						System.out.println("Fiona hates grapes. Why would you try to feed her grapes? Do you even KNOW her?");
					}
			  } else {
				System.out.println("Fiona isn't hungry right now. Just because the bread is free, doesn't mean she has to eat it.");
			  }
				break;
		  case 2:
			  if (duck.isThirsty()) {
				duck.water();
				System.out.println("You made Fiona Kool-Aid!");
				System.out.println("Fiona's thirst level is now: " + duck.thirst);
			  } else {
				System.out.println("Fiona is sick and tired of your Kool-Aid! She doesn't want anymore.");
			  }
				break;
		  case 3:
			  if (duck.isSleepy()) {
				duck.sleep();
				System.out.println("You sang Fiona to sleep!");
				System.out.println("Fiona's fatigue level is now: " + duck.fatigue);
			  } else {
				System.out.println("Fiona isn't tired, she wants to shake her tailfeathers!");
			  }
				break;
		  case 4:
			  if (duck.isBored()) {
				duck.play();
				System.out.println("You played Ants in the Pant's with Fiona!");
				System.out.println("Fiona's boredom level is now: " + duck.boredom);
			  } else {
				System.out.println("Fiona has had enough Ants in the Pants for now. Leave her alone.");
			  }
				break;
		}
		  
		duck.tick();
		
		System.out.println("If you'd like to see Fiona's full status at the end of the day, type 'status', if you'd like a list of options type 'list'.");
			String options = input.next();
			if (options.toLowerCase().equals("status")) {
				System.out.println("Here is Fiona's updated status at the end of the day: \n1. hunger = " + duck.hunger + "\n2. thirst = " + duck.thirst + "\n3. fatigue = " + duck.fatigue + "\n4. boredom = " + duck.boredom);
			} else if (options.toLowerCase().equals("list")) {
				System.out.println("What would you like to do?");
			}

		
	} while ((duck.hunger <= 100) && (duck.thirst <= 100) && (duck.fatigue <= 100) && (duck.boredom <= 100)); //(duck.thirst > 0));
		
		{
		 if (duck.hunger > 100) {
			System.out.println("Fiona has starved to death. Don't you know that ducks eat for free at Subway!?");
		}
		 else if (duck.thirst > 100) {
			System.out.println("Fiona has died of thirst, you monster.");
		}
		 else if (duck.fatigue > 100) {
			System.out.println("Fiona had insomnia and no thanks to you, she died from lack of sleep.");
		}
		 else if (duck.boredom > 100) {
			System.out.println("All Fiona ever wanted was to play 'Ants in the Pants' with you but you rarely played with her. She has literally died of boredom you Bozo.");
		}
}}}
