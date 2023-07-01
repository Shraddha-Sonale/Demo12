public class UpperLowerCase{
public static void main(String[] args){
String S = "hi this is shraddha";
String A = "HELLO";
String C = "  Hey  ";
System.out.println(S.toUpperCase());
System.out.println(A.toLowerCase());
System.out.println(C.trim());
System.out.println(A.replace('E','A'));
System.out.println(S.concat(A));
System.out.println(A.length());
System.out.println(S.isEmpty());
System.out.println(S.charAt(3));
System.out.println(A.indexOf('O'));
System.out.println(A.equals(S));
System.out.println(A.substring(1,3));
}
}