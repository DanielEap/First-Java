
public class Song {

	public static void main(String[] args) {
		cat();
		hen();
		duck();
		goose();
		sheep();
		cow();
	}
	//cat noise
	public static void fiddle_fee() {
		System.out.println("Cat goes fiddle-i-fee.\n");
	}
	//hen noise
	public static void chimmy_chuck() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	//duck noise
	public static void quack() { 
		System.out.println("Duck goes quack, quack,");
	}
	//goose noise
	public static void hissy() {
		System.out.println("Goose goes hissy, hissy,");
	}
	//sheep noise
	public static void baa() {
		System.out.println("Sheep goes baa, baa,");
	}
	/*cow noise
	 * cow was the "custom" sixth verse choice
	 */
	public static void moo() {
		System.out.println("Cow goes moo, moo,");
	}
	//cat verse
	public static void cat() {
		System.out.println("Bought me a cat and the cat pleased me,\n"
				+ "I fed my cat under yonder tree.");
		fiddle_fee();
	}
	//hen verse, calls hen and cat noise method
	public static void hen() {
		System.out.println("Bought me a hen and the hen pleased me,\n" 
				+ "I fed my hen under yonder tree.");
		chimmy_chuck();
		fiddle_fee();
	}
	//duck verse, calls duck,hen,cat noise
	public static void duck() {
		System.out.println("Bought me a duck and the duck pleased me,\n"
				+ "I fed my duck under yonder tree.");
		quack();
		chimmy_chuck();
		fiddle_fee();
	}
	//goose verse, calls goose,duck,hen,cat noise
	public static void goose() {
		System.out.println("Bought me a goose and the goose pleased me,\n"
				+ "I fed my goose under yonder tree.");
		hissy();
		quack();
		chimmy_chuck();
		fiddle_fee();
	}
	//sheep verse, calls sheep,goose,duck,hen,cat noise
	public static void sheep() {
		System.out.println("Bought me a sheep and the sheep pleased me,\n"
				+ "I fed my sheep under yonder tree.");
		baa();
		hissy();
		quack();
		chimmy_chuck();
		fiddle_fee();
	}
	//cow verse, calls cow,sheep,goose,duck,hen,cat noise
	public static void cow() {
		System.out.println("Bought me a cow and the cow pleased me,\n"
				+ "I fed my cow under yonder tree.");
		moo();
		baa();
		hissy();
		quack();
		chimmy_chuck();
		fiddle_fee();
	}
}
