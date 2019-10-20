package gb.crt.java.model;

import gb.crt.java.types.Shape;

/**
 * Cigar object class.
 * 
 * @author Gage Berghoff
 */
public class Cigar {

	/**************************
	 * Fields
	 **************************/

	private String name;
	private Shape shape;

	/**************************
	 * Constructors
	 **************************/

	public Cigar(String name, Shape shape) {

	}

	/**************************
	 * Methods
	 **************************/

	@Override
	public String toString() {
		return name;
	}

	/**************************
	 * Getters/Setters
	 **************************/

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param the name you would like to set the cigar
	 * @return true if set, false is failed to set
	 */
	public boolean setName(String name) {
		if (!name.trim().isEmpty()) {
			this.name = name;
			return true;
		}
		return false;
	}

	/**
	 * @return the shape enum of the cigar
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param set the shape enum of the cigar
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
}