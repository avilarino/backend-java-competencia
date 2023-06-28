package Liga;

public class Test {

	public static void main(String[] args) {
		
		
		Superheroe superheroe1 = new Superheroe("Batman",90,70,0);
		Superheroe superheroe2 = new Superheroe("Superman", 95,60,70);
		
		
		superheroe1.competir(superheroe2);
		System.out.println("");
		superheroe2.competir(superheroe1);

	}

}
