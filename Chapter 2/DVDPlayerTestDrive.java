class DVDPlayer {
    boolean canRecord = false;
    void recordDVD() {
    System.out.println("DVD RECORDING");
    }
    void playDVD(){
        System.out.println("DVD PLAYING");
    }
   }
   class DVDPlayerTestDrive {
    public static void main(String [] args) {
    DVDPlayer d = new DVDPlayer();
    d.canRecord = true;
    d.recordDVD();
    if (d.canRecord == true) {
 
    d.playDVD();
    }
    }
   }
