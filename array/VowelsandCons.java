package array;

public class VowelsandCons {

	public static void main(String[] args) {
		
		int vcount=0, ccount=0;
		String v1="", c1="";
		
		String s = "aasdjksdjkiou";
		char[] c = s.toCharArray();	
		
		for(char cx:c)
		{
			switch(cx)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				vcount++;
				v1+=cx;
				break;
				
			default:
				ccount++;
				c1+=cx;				
				break;
			}
			
		}
		
		
		System.out.println(v1.toCharArray());
		System.out.println(c1.toCharArray());
		
		System.out.println(vcount);
		System.out.println(ccount);
		

	}

}
