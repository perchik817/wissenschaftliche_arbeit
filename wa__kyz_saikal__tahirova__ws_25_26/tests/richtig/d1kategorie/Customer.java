package tests.richtig.d1kategorie;

public class Customer {

      // boolean + Präfix "is" → völlig korrekt
      private boolean isPremium;

      // normaler Name, korrekt
      private int premiumLevel;

      public boolean isPremium() {
            return isPremium;
      }

      public int getPremiumLevel() {
            return premiumLevel;
      }
}