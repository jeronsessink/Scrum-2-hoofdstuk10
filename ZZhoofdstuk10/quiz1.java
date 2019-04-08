   package ZZhoofdstuk10;

public class quiz1 {
	int nr; // instantievariabele
	  static int stNr; // klassenvariabele
	  public quiz1()
	  {
	    nr++;
	    stNr++;
	  }
	  public static void main(String[] args)
	  {
		  quiz1 wn1 = new quiz1();
		  quiz1 wn2 = new quiz1();
		  quiz1 wn3 = new quiz1();
		  quiz1 wn4 = new quiz1();
		  quiz1 wn5 = new quiz1();

	    System.out.print(quiz1.stNr + ", ");
	    System.out.print(wn1.nr + ", ");
	    System.out.print(wn2.nr + ", ");
	    System.out.print(wn3.nr+ ", ");
	    System.out.print(wn4.stNr+ ", ");
	    System.out.print(wn5.stNr);
	    //wn4 + wn5 hebben geen invloed op de waarde stNr.
	  }

}
