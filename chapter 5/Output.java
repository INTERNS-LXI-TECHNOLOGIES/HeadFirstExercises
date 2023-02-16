class Output {
    public static void main(String [] args) {
    Output o = new Output();
    o.go();
    }
    void go() {
    int y = 6;
    for(int x = 1; x < 7; x++) {
    y++;
    if (x > 4) {
    System.out.print(++y + " " );
    }
  
    }
    }
   }