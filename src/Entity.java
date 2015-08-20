
/**
 * Constructing my Entity class, this will be the super class for
 * Player and NPC
 * @author 7Winds
 */
public abstract class Entity {
	
	/**
	 * Only way of access is through the subclasses.
	 */
	protected Position position;
	
	/**
	 * Both Player and NPC have this in common, so it can be used as
	 * an abstract method.
	 */
	public abstract void show();
	
	/**
	 * Retrieving our Entities position
	 * @return position
	 */
	public Position getPosition() {
		return position;
	}
	
	/**
	 * Setting our Entities position
	 * @param Position
	 * 
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
}
