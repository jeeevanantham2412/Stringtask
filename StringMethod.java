package mytask;

import java.util.Arrays;

public class StringMethod {

	char[] charArray;
	
	String s;

	
	public StringMethod(String value) {
		this.s = value;
		this.charArray = value.toCharArray();
	}

	public int length() {
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			char c1 = charArray[i];

			count++;
		}

		return count;
	}

	public String concat( String value2) {
		String value3 = s + value2;
		return value3;
	}

	public char charAt(int n) {
		for (int i = 0; i < charArray.length; i++) {
			if (i + 1 == n) {
				return (char) charArray[i];
			}
		}
		return ' '; 
	}

	
	public String lowerCase() {
		String str1 = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {

				charArray[i] = (char) (charArray[i] + 32);
			} else if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i]);
			}
		}
		for (int i1 = 0; i1 < charArray.length; i1++) {
			str1 = str1 + charArray[i1];
		}
		return str1;

	}

	public String upperCase() {
		String str1 = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i] - 32);
			} else if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] = (char) (charArray[i]);
			}
		}
		for (int i1 = 0; i1 < charArray.length; i1++) {
			str1 = str1 + charArray[i1];
		}
		return str1;
	}

	public String isEmpty() {

		if (s == "") {
			return "true";
		} else {
			return "false";
		}
	}

	
	public boolean equals( String value1) {

		if (s == null && value1 == null) {
			return true;
		} else if (s.length() == value1.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == value1.charAt(i)) {
				}
			}
			return true;
		}
		else {
			return false;
		}
	}

	public boolean startsWith( String substr) {

		char[] ch1 = substr.toCharArray();
		boolean swh = false;
		for (int i = 0; i < ch1.length; i++) {
			if (charArray[i] == ch1[i]) {
				swh = true;
			}
			else {
				return false;
			}
		}

		return swh;
	}

	public boolean endsWith( String substr) {

		char[] ch1 = substr.toCharArray();
		int le = charArray.length - ch1.length;
		boolean ew = false;
		int i = le;
		while (i < substr.length() + le) {
			if (charArray[i] == ch1[i - le]) {
				ew = true;
				i++;
			}
			else {
				return false;
			}
		}
		return ew;

	}

	public String substring(int n1, int n2) {

		String sstr = "";
		for (int i = n1; i < n2; i++) {
			sstr = sstr + (s.valueOf(s.charAt(i)));
		}
		return sstr;

	}

	public String replace( int num, String c) {

		String str = s.substring(0, num) + c + s.substring(num + 1);
		return str;
	}

public boolean contains(String str) {
		char ch[]=str.toCharArray();
		boolean flag=true;
		//if(flag=true) {
			for(int i=0;i<s.length();i++){
				for(int j=0;j<ch.length;j++) {
				if(charArray[i]==ch[j]) {
					return true;
				}
				else {return false;}
				
				}}
			return false;
		
		}
public int compareTo(String str) {
	char a[]=str.toCharArray();
	int le=charArray.length;
	int le1=a.length;
	int l=le>le1?le1:le;
	for(int i=0;i<l;i++) {
		if(charArray[i]<a[i]) {
			return -1;
		}
		else if(charArray[i]>a[i]) {
			return 1;
		}
	}
	if(le==le1) {
		return 0;
	}
	else
		return le1>le?1: -1;
}
public int compareIgnoreTo(String v) {
	String str=s.toLowerCase();
	char a[]=str.toCharArray();
	String str1=v.toLowerCase();
	char b[]=str1.toCharArray();
	int le=a.length;
	int le1=b.length;
	int l=le>le1?le1:le;
	for(int i=0;i<l;i++) {
		if(a[i]<b[i]) {
			return -1;
		}
		else if(a[i]>b[i]) {
			return 1;
		}
	}
	if(le==le1) {
		return 0;
	}
	else
		return le1>le?1: -1;
}
public String trim() {
	
	int first=0, last = 0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i] != ' ') {
				first = i;
				break;
			}
		}
		for(int i=charArray.length-1;i>=0;i--) {
			if(charArray[i] != ' ') {
				last = i;
				break;
			}
		}
		return(s.substring(first,last+1));
}

public boolean equalsIgnore(String name) {
	String s1=s.toLowerCase();
	String n=name.toLowerCase();
	if(s1==null ||n==null) {
		return false;
	}
	if(s1.length()!=n.length()) {
		return false;
	}
	for(int i=0;i<s.length();i++) {
		if(s1.charAt(i)!=n.charAt(i))
     return false;  
	}
	return true;
}
public char[] charArray(){
	
char ch[]=new char[s.length()];
	
	 for(int i=0; i<s.length();i++) {
		 ch[i]=s.charAt(i);
	 }
	 return ch;
	 }
public String reverse() {
     String st="";
     
	for(int length=charArray.length-1;length>=0;length--) {
		st=st+charArray[length];
	    }
	return st;}
	 
	public static void main(String[] args) {
		StringMethod Obj = new StringMethod("jeevanantham");
	    System.out.println(Obj.charArray());
	    System.out.print("Reverse           :"+Obj.reverse());
	    System.out.println("\ncompareTo       : "+Obj.compareTo("jeevanantham"));
		System.out.println("compareIgnoreTo : "+Obj.compareIgnoreTo("JEEVANANTHA"));
	    System.out.println("length          : "+Obj.length());
		System.out.println("concat          : "+Obj.concat( "kandasamy"));
		System.out.println("charAt          : "+Obj.charAt(5));
	    System.out.println("endswith        : "+Obj.endsWith("tha"));
		System.out.println("Startswith      : "+Obj.startsWith("jeeva"));
		System.out.println("equals          : "+Obj.equals("jeevanantha"));
		System.out.println("isEmpty         : "+Obj.isEmpty());
		System.out.println("lowercase       : "+Obj.lowerCase());
		System.out.println("Uppercase       : "+Obj.upperCase());
		System.out.println("substring       :"+Obj.substring(0, 5));
        System.out.println("replace         :"+Obj.replace( 1, "a"));
		System.out.println("contains        : "+Obj.contains("Gokul"));
        System.out.println("trim            :"+Obj.trim());
        System.out.println("equalsIgnore    : "+Obj.equalsIgnore("JEEVANANTHAM"));
        
	}

}










