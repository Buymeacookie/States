
public class Studierende extends Bevoelkerungsgruppe {

	public Studierende(double einkommen) {
		super(einkommen);
		tax = true;
		sTax = false;

	}

	@Override
	public double getTax() {

		
		if (einkommen <= 6000) {
			return 0.0;
		}

			return super.getTax();
	}

}