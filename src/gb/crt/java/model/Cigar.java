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
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.trim().isEmpty()) {
			this.name = name;
		}
	}

	/**
	 * @return the shape enum of the cigar
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape enum of the cigar
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
}