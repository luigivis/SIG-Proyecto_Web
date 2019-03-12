package tools;

public class Converter {

	public Converter() {
		
	}
	
	public static Double toDouble(String s) {
		Double result = null;
		
		if (s != null) {
			try {
				result = Double.valueOf(s);
			} catch (NumberFormatException ex) {
				
			} 
		}
		return result;
	}

	public static Integer toInteger(String s) {
		Integer result = null;
		
		if (s != null) {
			try {
				result = Integer.valueOf(s);
			} catch (NumberFormatException ex) {
				
			} 
		}
		return result;
	}
}
