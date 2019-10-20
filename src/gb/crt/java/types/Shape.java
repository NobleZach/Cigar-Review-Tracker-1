package gb.crt.java.types;

/**
 * Enums for cigar shapes.
 * 
 * @author Gage Berghoff
 */
public enum Shape {

	/**************************
	 * Shapes
	 **************************/
	CHURCHILL("Churchill"),
	CIGARILLOS("Cigarillos"),
	CORONA("Corona"),
	CORONA_EXTRA("Corona Extra"),
	DOUBLE_CORONA("Double Corona"),
	GIANT("Giant"),
	GIANT_CORONA("Giant Corona"),
	GRAND_CORONA("Grand Corona"),
	LONG_CORONA("Long Corona"),
	LONG_PANATELA("Long Panatela"),
	LONSDALE("Lonsdale"),
	PANATELA("Panatela"),
	PERFECTO("Perfecto"),
	PETIT_CORONA("Petit Corona"),
	PYRAMID("Pyramid"),
	ROBUSTO("Robusto"),
	SHORT_PANATELA("Short Panatela"),
	SLIM_PANATELA("Slim Panatela"),
	SMALL_PANATELA("Small Pantela"),
	TORO("Toro"),
	TORPEDO("Torpedo"),
	;

	/**************************
	 * Constructors
	 **************************/
	private final String shape;
	
	Shape(String shape) {
		this.shape = shape;
	}

	/**************************
	 * Getters
	 **************************/
	public String getShape() {
		return this.shape;
	}
}
