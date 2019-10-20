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
	CHISEL("Chisel","Figurado"),
	CHURCHILL("Churchill", "Parejo"),
	CIGARILLOS("Cigarillos", "Parejo"),

	// Corona's
	CORONA("Corona", "Parejo"),
	CORONA_EXTRA("Corona Extra", "Parejo"),
	CORONA_GORDA("Corona Gorda", "Parejo"),
	CORONA_GRANDE("Corona Grande", "Parejo"),
	DOUBLE_CORONA("Double Corona", "Parejo"),
	GIANT_CORONA("Giant Corona", "Parejo"),
	GRAN_CORONA("Gran Corona", "Parejo"),
	PETIT_CORONA("Petit Corona", "Parejo"),
	LONG_CORONA("Long Corona", "Parejo"),

	GIANT("Giant", "Parejo"),
	GORDO("Gordo", "Parejo"),
	GORDITO("Gordito", "Parejo"),
	LANCERO("Lancero", "Parejo"),
	LONSDALE("Lonsdale", "Parejo"),
	
	// Panatela's
	PANATELA("Panatela", "Parejo"),
	SHORT_PANATELA("Short Panatela", "Parejo"),
	SLIM_PANATELA("Slim Panatela", "Parejo"),
	SMALL_PANATELA("Small Pantela", "Parejo"),
	LONG_PANATELA("Long Panatela", "Parejo"),
	
	PERFECTO("Perfecto", "Figurado"),
	PRESIDENTE("Presidente", "Parejo"),
	PYRAMID("Pyramid", "Figurado"),
	ROBUSTO("Robusto", "Parejo"),
	ROTHSCHILD("Rothschild", "Parejo"),
	TORO("Toro", "Parejo"),
	TORPEDO("Torpedo", "Figurado"),
	;

	/**************************
	 * Constructors
	 **************************/
	private final String name;
	private final String shape;
	
	Shape(String name, String shape) {
		this.name = name;
		this.shape = shape;
	}

	/**************************
	 * Getters
	 **************************/
	public String getName() {
		return this.name;
	}
	
	public String getShape() {
		return this.shape;
	}
}
