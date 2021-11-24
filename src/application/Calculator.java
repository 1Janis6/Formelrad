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
      pAusUundI(getSpannung(), getStrom());
	  System.out.println("Leistung wird aus Spannung und Strom berechnet");
    }
    if (getWiderstand() != 0 && getStrom() != 0) {
      pAusRundI(getWiderstand(), getStrom());
	  System.out.println("Leistung wird aus Widerstand und Strom berechnet");
    }
    if (getSpannung() != 0 && getWiderstand() != 0) {
      pAusUundR(getSpannung(), getWiderstand());
	  System.out.println("Leistung wird aus Spannung und Widerstand berechnet");
    }


    if (getLeistung() != 0 && getWiderstand() != 0) {
      IausPundR(getLeistung(), getWiderstand());
	  System.out.println("Strom wird aus Leistung und Widerstand berechnet");
    }
    if (getLeistung() != 0 && getSpannung() != 0) {
      IausPundU(getLeistung(), getSpannung());
	  System.out.println("Strom wird aus Leistung und Spannung berechnet");
    }
    if (getSpannung() != 0 && getWiderstand() != 0) {
      IausUundR(getSpannung(), getWiderstand());
	  System.out.println("Strom wird aus Spannung und Widerstand berechnet");
    }


    if (getWiderstand() != 0 && getStrom() != 0) {
      uAusRundI(getLeistung(), getStrom());
	  System.out.println("Spannung wird aus Strom und Widerstand berechnet");
    }
    if (getLeistung() != 0 && getStrom() != 0) {
      uAusPundI(getLeistung(), getStrom());
	  System.out.println("Spannung wird aus Leistung und Strom berechnet");
    }
    if (getLeistung() != 0 && getWiderstand() != 0) {
      uAusPundR(getLeistung(), getWiderstand());
	  System.out.println("Spannung wird aus Leistung und Widerstand berechnet");
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
