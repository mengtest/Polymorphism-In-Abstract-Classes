/**
 * A class which will hold our Entities positions
 * @author 7Winds
 */
public class Position {

	/**
	 * Fields
	 */
	private int x, y, z;

	/**
	 * Constructing a position for the Entities
	 * @param x
	 * @param y
	 * @param z
	 */
	public Position(int x, int y, int z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	/**
	 * Getters and setters, pretty self explanatory.
	 */
	
	/**
	 * Getter used to grab an Entities X position
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Setter, used to set an Entities X position
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Getter, used to get an Entities Y position
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter, used to set an Entities Y position
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Getter, used to get an Entities Z plane (height)
	 * @return z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * Setter, used to set an Entities Z plane (height)
	 * @param z
	 */
	public void setZ(int z) {
		this.z = z;
	}
}
