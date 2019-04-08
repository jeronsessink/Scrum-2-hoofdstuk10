package ZZhoofdstuk10;

public class quiz2 {
	static int x = 3;
	  public quiz2()
	  {
	    x++;
	  }
	  public static int mijnMethode(int i, int i2)
	  {
	    x += (i - i2);
	    return x;
	  }
	  //nieuwe methode
	  public static void ResetX(int getal ) {
		  	x=getal;
	  }
	  
	  
	  public static void main(String[] args)
	  {
		  quiz2 mk1 = new quiz2();
		  quiz2 mk2 = new quiz2();
	    System.out.print(quiz2.x + ", ");
	    quiz2 mk3 = new quiz2();
	    quiz2.mijnMethode(8, 3);
	    System.out.println(quiz2.x);
	    
	    quiz2.ResetX(100);
	    System.out.println(quiz2.x);
	  }

}
