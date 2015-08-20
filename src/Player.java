import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Our main Player class
 * @author 7Winds
 */
public class Player extends Entity {
	
	private static final Logger logger = Logger.getLogger(Player.class.getName());

	/**
	 * Fields
	 */
	private int id;
	private String name;

	/**
	 * Constructing our player
	 * 
	 * @param id
	 * @param name
	 * @param playerPosition
	 */
	public Player(int id, String name, Position playerPosition) {
		this.id = id;
		this.name = name;
		this.position = playerPosition;
	}

	/*
	 * A method {@link #show()} used to show our Player. Overriding just means
	 * we are going to use a method from our super class; in this case Entity.
	 */
	@Override
	public void show() {
		logger.log(Level.INFO, "Player ID : " + this.getId() + ", Name : "
				+ this.getName() + ", Position : X:" + position.getX() + " Y:"
				+ position.getY() + " Z:" + position.getZ());
	}

	/**
	 * Our getters and setters below. Used to retrieve information about a
	 * player.
	 */

	/**
	 * A getter used to recrieve a Player's Id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * A setter, used to set a Player's Id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * A getter, used to get a Player's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * A setter, used to set a Player's name.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
