
public class StringOperations {
	
	public void reverseInbuilt() {
		StringBuilder stb = new StringBuilder();
		stb.append("abc");
		stb.reverse();
		System.out.println(stb);
	}
	
	
	//Logic to reverse without using buffer string
	public void reverseWithoutBufferString() {
		StringBuilder stb = new StringBuilder();
		stb.append("joker");
		char[] source = stb.toString().toCharArray();
		//Logic to reverse with single usage of string
		char[] target = new char[source.length];
		int l=0;int r=stb.length()-1;
		char temp;
		while(l<=r) {
		temp = source[l];
		source[l]= source[r];
		source[r]=temp;
		l++;
		r--;
		
		}	
		System.out.println("ReverseWithoutUsingBufferString "+new String(source));
	}
	
	//Logic to reverse  using buffer string
	public void reverseUsingBufferString() {
		StringBuilder stb = new StringBuilder();
		stb.append("joker");
		char[] src = stb.toString().toCharArray();
		StringBuilder target = new StringBuilder(stb.length());
		int l= target.length()-1;
		for(int i=stb.length()-1;i>=0;i--) {
			target.append(src[i]);
		}
		System.out.println("ReverseUsingBufferString "+target);
	}
	
	
	public static void main(String[] args) {
		
	StringOperations st = new StringOperations();
	st.reverseInbuilt();
	st.reverseWithoutBufferString();
	st.reverseUsingBufferString();
	
	}

}
