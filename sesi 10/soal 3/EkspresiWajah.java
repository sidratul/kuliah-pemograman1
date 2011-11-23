public class EkspresiWajah{
	public String respons(){
			return("perhatikan ekspresi wajah saya");
	}
}

class Gembira extends EkspresiWajah{
	public String respons(){
		return(" :) :D :) hahahahah....");
	}
}

class Sedih extends EkspresiWajah{
	public String respons(){
		return(":( ;( :'( hiks hiks");
	}
}

class Marah extends EkspresiWajah{
	public String respons(){
		return(":[ aarrrrrgggggg");
	}
}

