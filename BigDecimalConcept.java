import java.math.BigDecimal;

public class BigDecimalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double a =  0.03;
//		double b =  0.04;
//		
//		double c = b - a;
		
		BigDecimal a = new BigDecimal("0.03");
		BigDecimal b = new BigDecimal("0.04");
		
		BigDecimal c = b.subtract(a);
		
		System.out.println(c);

	}

}
