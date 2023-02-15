public class Sum {

   static int x;
   static int y;

    public static void main(String[] args) {
        x =0;
        y =4;
       
          sum(x,y);

        System.out.println(x);
        System.out.println(y);
    }

    private static void sum(int x, int y) {

       Sum.x=20;
        Sum.y=30;
    }
    
}
