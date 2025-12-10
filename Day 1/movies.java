public class movies {
   public movies() {
   }

   public static void describeMovie(String var0, String var1, String var2) {
      System.out.println("Movie Name: " + var0);
      System.out.println("Hero: " + var1);
      System.out.println("Description: " + var2);
      System.out.println("-----------------------------------");
   }

   public static void main(String[] var0) {
      describeMovie("Iron Man", "Tony Stark", "A genius billionaire becomes a superhero using a high-tech armored suit.");
      describeMovie("Spider-Man", "Peter Parker", "A young man gains spider-like powers and fights crime.");
   }
}

