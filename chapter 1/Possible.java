public class Possible {
 public static void main(String [] args) {
 int x = 0;  
 int y = 0;   
 while ( x < 5 ) {  // 4

    x = x + 1;  // 5
    y = y + x;  // 9

 System.out.print(x + "" + y +" ");   // 11_34_59_
 x = x + 1; // 6
 }
 }
} 