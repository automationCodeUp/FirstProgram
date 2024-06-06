
public class Testprogram {

	public static void main(String args[]) {
		
		String givenStr= "ah123jdnekfjlnvflenvurkro";
		char[] ch = givenStr.toCharArray();
		char[] target=new char[5];
		int pos=0;
		
		for(int i=0;i<ch.length;i++) {
		
		if((ch[i]=='h')&&target[0]=='\u0000') {
			target[0]=ch[i];
			System.out.println(target[0]);
		}
		if((ch[i]=='e')&&target[0]!='\u0000'&&target[1]=='\u0000') {
			target[1]=ch[i];
		}
		if((ch[i]=='l')&&target[0]!='\u0000'&&target[1]!='\u0000'&&target[2]=='\u0000') {
			target[2]=ch[i];
		}
		if((ch[i]=='l')&&target[0]!='\u0000'&&target[1]!='\u0000'&&target[2]!='\u0000'&&target[3]=='\u0000') {
			target[3]=ch[i];
		}
		if((ch[i]=='o')&&target[0]!='\u0000'&&target[1]!='\u0000'&&target[2]!='\u0000'&&target[3]!='\u0000'&&target[4]=='\u0000') {
			target[4]=ch[i];
		}
		
		}
		System.out.println("target "+new String(target));

		
	}
}
