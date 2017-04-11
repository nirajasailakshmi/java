package generics;

public class Genericsex {

	public static void main(String[] aa)
	{
		dictionary<String,String>data=new dictionary<String,String>("Apple","It is a type of fruit");
		data.printmeaning();
	}
}
 class dictionary<W,M>
	{
		private W word;
		private M meaning;
		public dictionary(W word,M meaning)
		{
			this.word=word;
			this.meaning=meaning;
			
		}
		
public void printmeaning()
{
	System.out.println(word);
	System.out.println(meaning);

	
}
	}

