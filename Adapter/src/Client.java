
public class Client {

	public static void main(String[] args) {
		Dengen dengen;

		dengen=new AcAdapter();
		int denatsu=dengen.kyuuden();
		System.out.println(denatsu+"Vで給電されています");
	}
}

class Dengen{
	public int kyuuden();
}

class Japaneseconsent{
	//わかりませんでした
}

class AcAdapter extends Dengen{
	//わかりませんでした
}
