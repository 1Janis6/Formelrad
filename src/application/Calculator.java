package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {

  private double leistung;
  private double spannung;
  private double strom;
  private double widerstand;

  public Calculator(
    double leistung,
    double spannung,
    double strom,
    double widerstand
  ) {
    super();
    this.leistung = leistung;
    this.spannung = spannung;
    this.strom = strom;
    this.widerstand = widerstand;
  }

  public double getLeistung() {
    return leistung;
  }

  public double getSpannung() {
    return spannung;
  }

  public double getStrom() {
    return strom;
  }

  public double getWiderstand() {
    return widerstand;
  }

  @Override
  public String toString() {
    return (
      "Calculator [leistung=" +
      leistung +
      ", spannung=" +
      spannung +
      ", strom=" +
      strom +
      ", widerstand=" +
      widerstand +
      "]"
    );
  }

  public void calculate() {

    //Feature 6

    if (getSpannung() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	pAusUundI(getSpannung(), getStrom());

		  if(getWiderstand() != 0 || getLeistung() != 0){
			  alert++;
		  }
    }
    if (getWiderstand() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	pAusRundI(getWiderstand(), getStrom());

		  if(getSpannung() != 0 || getLeistung() != 0){
			alert++;
		}
    }
    if (getSpannung() != 0 && getWiderstand() != 0) {
		alert = alert + 2;
      	pAusUundR(getSpannung(), getWiderstand());

		  if(getStrom() != 0 || getLeistung() != 0){
			alert++;
		}
    }

    if (getLeistung() != 0 && getWiderstand() != 0) {
		alert = alert + 2;
      	IausPundR(getLeistung(), getWiderstand());

		  if(getStorm() != 0 || getSpannung() != 0){
			alert++;
		}
    }
    if (getLeistung() != 0 && getSpannung() != 0) {
		alert = alert + 2;
      	IausPundU(getLeistung(), getSpannung());

		  if(getWiderstand() != 0 || getStrom() != 0){
			alert++;
		}
    }
    if (getSpannung() != 0 && getWiderstand() != 0) {
		alert = alert + 2;
      	IausUundR(getSpannung(), getWiderstand());

		  if(getStrom() != 0 || getLeistung() != 0){
			alert++;
		}
    }
    if (getWiderstand() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	uAusRundI(getLeistung(), getStrom());

		  if(getSpannung() != 0 || getLeistung() != 0){
			alert++;
		}
    }
    if (getLeistung() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	uAusPundI(getLeistung(), getStrom());

		  if(getWiderstand() != 0 || getSpannung() != 0){
			alert++;
		}
    }
    if (getLeistung() != 0 && getWiderstand() != 0) {
		alert = alert + 2;
      	uAusPundR(getLeistung(), getWiderstand());

		  if(getStrom() != 0 || getSpannung() != 0){
			alert++;
		}
    }
    if (getSpannung() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	rAusUundI(getSpannung(), getStrom());

		  if(getWiderstand() != 0 || getLeistung() != 0){
			alert++;
		}
    }
    if (getLeistung() != 0 && getStrom() != 0) {
		alert = alert + 2;
      	rAusPundI(getLeistung(), getStrom());

		  if(getWiderstand() != 0 || getSpannung() != 0){
			alert++;
		}
    }
    if (getSpannung() != 0 && getLeistung() != 0) {
		alert = alert + 2;
      	rAusUundP(getSpannung(), getLeistung());

		  if(getWiderstand() != 0 || getStrom() != 0){
			alert++;
		}
    }

	//Feature 7
	int alert = 0;
	if (alert >= 3){
		System.out.println("Mehr als zwei Felder gefüllt");
	}
  }

  // feature 2
  public double pAusUundI(double spannung, double strom) {
    return spannung * strom;
  }

  public double pAusRundI(double widerstand, double strom) {
    return widerstand * (strom * strom);
  }

  public double pAusUundR(double spannung, double widerstand) {
    return (spannung * spannung) * widerstand;
  }

  //Feature 3
  public double uAusRundI(double wiederstand, double strom) {
    return wiederstand * strom;
  }

  public double uAusPundI(double leistung, double strom) {
    return leistung / strom;
  }

  public double uAusPundR(double leistung, double wiederstand) {
    return Math.sqrt(leistung * wiederstand);
  }

  // feature 4
  public double IausPundR(double leistung, double widerstand) {
    return (Math.sqrt(leistung / widerstand));
  }

  public double IausPundU(double leistung, double spannung) {
    return (leistung / spannung);
    
  }

  public double IausUundR(double spannung, double widerstand) {
    return (spannung / widerstand);
  }

  //Feature 5
  public double rAusUundI(double spannung, double strom) {
    return spannung / strom;
  }

  public double rAusPundI(double leistung, double strom) {
    return leistung / strom * strom;
  }

  public double rAusUundP(double spannung, double leistung) {
    return spannung * spannung / leistung;
  }

}
