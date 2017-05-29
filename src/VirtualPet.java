
public class VirtualPet {
	
	String name;
	int interact;
	int hunger = 50;  
	int thirst = 50;
	int fatigue = 50;
	int boredom = 50;

	void feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
	}
	void water() {
		thirst = thirst - 10;
	}
	void sleep() {
		fatigue = fatigue - 10;
	}
	void play() {
		boredom = boredom - 10;
		fatigue = fatigue + 5;
		hunger = hunger + 5;
	}
	boolean isHungry() {
		return hunger >= 15;
	}
	boolean isSleepy() {
		return fatigue >= 15;
	}
	boolean isThirsty() {
		return thirst >= 15;
	}
	boolean isBored() {
		return boredom >= 15;
	}
	void tick() {
		hunger = hunger + 3;
		thirst = thirst + 3;
		fatigue = fatigue + 3;
		boredom = boredom + 3;
	}
}

