import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Our main NPC class
 * @author 7Winds
 */
public class NPC extends Entity {
	
	private static final Logger logger = Logger.getLogger(NPC.class.getName());
	
	/**
	 * Fields
	 */
	private int id;
	private String name;
	
	/**
	 * Constructing our NPC
	 * @param id
	 * @param name
	 * @param position
	 */
	public NPC(int id, String name, Position Npcposition) {
		this.id = id;
		this.name = name;
		this.position = Npcposition;
	}
	
	/*
	 * A method {@link #show()} used to show our NPC.
	 * Overriding just means we are going to use a method from our
	 * super class; in this case Entity.
	 * 
	 */
	@Override
	public void show() {
		logger.log(Level.INFO, "NPC Id : " + this.getId() + ", Name : " + this.getName() + ", Position : X:" +
	position.getX() + " Y:" + position.getY() + " Z:" + position.getZ()
);
	}

	/**
	 * Our getters and setters below for the NPC class
	 * Used to retrieve information about a npc.
	 */	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
