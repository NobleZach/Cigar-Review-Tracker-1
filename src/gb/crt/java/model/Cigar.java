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
	private int ringGauge;

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
	 * @return returns the name of the cigar.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param set the name of the cigar.
	 * @return true if set, false is failed to set.
	 */
	public boolean setName(String name) {
		if (!name.trim().isEmpty()) {
			this.name = name;
			return true;
		}
		return false;
	}

	/**
	 * @return returns the shape enum of the cigar.
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param set the shape enum of the cigar.
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @return returns the ring gauge of the cigar.
	 */
	public int getRingGauge() {
		return ringGauge;
	}

	/**
	 * @param sets the ring gauge of the cigar.
	 */
	public void setRingGauge(int ringGauge) {
		this.ringGauge = ringGauge;
	}
}