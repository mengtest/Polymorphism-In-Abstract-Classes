
/**
 * Demonstration of Polymorphism in abstract classes
 * @author 7Winds
 */
public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Entity is an abstract class, an abstract class cannot be instantiated. However,
		 * you can use Entity as a type since Player and NPC are both subclasses they can be of the type (Entity). Players and NPCs
		 * are both entities.
		 */		
		Entity player = new Player(0, "7Winds", new Position(3200, 3200, 0));
		player.show();		

		Entity npc = new NPC(0, "Hans", new Position(3205, 3200, 0));
		npc.show();
	}

}
