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
	CHISEL("Chisel"),
	CHURCHILL("Churchill"),
	CIGARILLOS("Cigarillos"),

	// Corona's
	CORONA("Corona"),
	CORONA_EXTRA("Corona Extra"),
	CORONA_GORDA("Corona Gorda"),
	CORONA_GRANDE("Corona Grande"),
	DOUBLE_CORONA("Double Corona"),
	GIANT_CORONA("Giant Corona"),
	GRAN_CORONA("Gran Corona"),
	PETIT_CORONA("Petit Corona"),
	LONG_CORONA("Long Corona"),

	GIANT("Giant"),
	GORDO("Gordo"),
	GORDITO("Gordito"),
	LANCERO("Lancero"),
	LONSDALE("Lonsdale"),
	
	// Panatela's
	PANATELA("Panatela"),
	SHORT_PANATELA("Short Panatela"),
	SLIM_PANATELA("Slim Panatela"),
	SMALL_PANATELA("Small Pantela"),
	LONG_PANATELA("Long Panatela"),
	
	PERFECTO("Perfecto"),
	PRESIDENTE("Presidente"),
	PYRAMID("Pyramid"),
	ROBUSTO("Robusto"),
	ROTHSCHILD("Rothschild"),
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
