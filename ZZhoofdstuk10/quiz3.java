package ZZhoofdstuk10;

public class quiz3 {
	  static int x = 6;
	  int y = 3;
	  quiz3()
	  {
	    x += 3;
	    y += 2;
	  }
	  void mijnMethode(int i)
	  {
	    this.y = y - i;
	    x++;
	  }
	  public static void main(String[] args)
	  {
		  quiz3 mk1 = new quiz3();
		  quiz3 mk2 = new quiz3();
		  quiz3 mk3 = new quiz3();
		  
		  //nieuwe object referenties \/
		  quiz3 object1 = new quiz3();
		  quiz3 object2 = new quiz3();
		  quiz3 object3 = new quiz3();
		  quiz3 object4 = new quiz3();
		  quiz3 object5 = new quiz3();
		  
		  //vraag 2: Wordt de klassevariabele beïnvloed bij het maken van objectreferenties?
		  //ja, elke nieuwe objectreferentie voegt 3 toe aan x.
		  
	    mk1.mijnMethode(3);
	    System.out.println(mk2.x + ", " + mk1. y);

	  }
	
}
