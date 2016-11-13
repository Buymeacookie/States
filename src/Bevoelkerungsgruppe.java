
public class Bevoelkerungsgruppe {

	protected double einkommen;
	protected boolean sTax;
	protected boolean tax;
	public final double STEUERSATZ10 = 0.1;
	public final double STEUERSATZ25 = 0.25;
	public final double STEUERSATZ30 = 0.30;
	public final double STEUERSATZ40 = 0.4;
	public final double STEUERSATZ50 = 0.5;
	public final double SOZIALABGABEN = 0.28;

	public Bevoelkerungsgruppe(double einkommen) {

		this.einkommen = einkommen;

	}

	public double getTax() {

		if (tax == true) {

			if (einkommen <= 12000) {

				return einkommen * STEUERSATZ10;

			}
			if (einkommen <= 24000 && einkommen >= 12001) {

				return einkommen * STEUERSATZ25;
			}
			if (einkommen <= 50000 && einkommen >= 24001) {

				return einkommen * STEUERSATZ30;
			}
			if (einkommen <= 75000 && einkommen >= 50001) {

				return einkommen * STEUERSATZ40;
			} else {

				return einkommen * STEUERSATZ50;

			}
		} else {

			return 0;

		}
	}

	public double getSocialTax() {

		if (sTax == false) {

			return 0.0;

		} else {

			return einkommen * SOZIALABGABEN;

		}

	}
}