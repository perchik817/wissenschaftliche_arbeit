package tests.fehlerhaft.d2kategorie;

public class Product {
      /*
       * Methode mit Prädikatname liefert non-boolean
       */
      public String isAvailable() {
            return "yes";
      }
}
