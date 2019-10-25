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
	private String brand;
	private Shape shape;
	private int gauge;
	private double length;

	/**************************
	 * Constructors
	 **************************/
	public Cigar(String name, Shape shape) {
		this.name = name;
		this.shape = shape;
	}

	/**************************
	 * Methods
	 **************************/
	@Override
	public String toString() {
		return "Name: " + name + "\nShape: " + shape.toString() + "\nSize: " + length + "x" + gauge;
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
	 * @param the name of the cigar.
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
	 * @return the shape enum of the cigar.
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param the shape enum of the cigar.
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @return the ring gauge of the cigar.
	 */
	public int getRingGauge() {
		return gauge;
	}

	/**
	 * @param the ring gauge of the cigar.
	 */
	public void setRingGauge(int gauge) {
		this.gauge = gauge;
	}

	/**
	 * @return the brand of the cigar.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param the brand of the cigar.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
}