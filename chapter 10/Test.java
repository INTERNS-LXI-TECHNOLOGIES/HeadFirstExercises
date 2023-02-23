public class Test {

    public static void main(String[] args) {
        String a[] = { "Kiran", "Sujith", "Ajith"} ;
        String b[] = {  "Software Engineer",
                        "Striker",
                         "Astronaut"} ;

        for( int i = 0 ; i < 3; i++)
        System.out.println(String.format("Dear Mr. %s, You are appointed as %s", a[i], b[i])) ;
    }
    
}
