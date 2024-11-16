package programming;

public class occurunce {
	
 public static void main(String[] args) {
	 int count=0;
	 
	String str= "Engineeering";
	char [] ch = str.toLowerCase().toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		for(int j = 0;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
		}
		System.out.println(ch[i]+" "+count);
		count=0;
	 }
	
	
 }
	
	
}
