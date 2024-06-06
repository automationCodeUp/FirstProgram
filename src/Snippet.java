

public class Snippet {
	
	public static void main(String[] args) {
	
	String stri="how4dy";
	char[] str = stri.toCharArray();
	

	int left = 0 ; 
	int right = str.length-1;


	
	while(left<right) {
		
		
		while(!Character.isAlphabetic(str[left])) {
			left++;
		}
		while(!Character.isAlphabetic(str[right])) {
			right--;
		}
		
		
		

	
	
	
	
	
	if(left<right){
	char temp = str[right];
	str[right]= str[left];
	str[left]= temp;
	left++;
	right--;
	}
}
	System.out.println(str);
	}
	
	
	
}