import java.util.Arrays;

public class SortingExample{
public static void main(String[] args){
int[] Array = {10,80,40,90,70,60,30,50,20};
System.out.println("Regular Array - " +Arrays.toString(Array));
java.util.Arrays.sort(Array);
System.out.println("Sorted Array - " +Arrays.toString(Array));
}
}