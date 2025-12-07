package tests.fehlerhaft.b1kategorie;

public class PaymentProcessor {
      /*
       * Methode klingt umfassend, macht aber nur Teilschritt
       */
      public void validatePayment() {
            checkFormat(); // nur Syntaxcheck
      }

      private void checkFormat() {
            /* ... */ }
}
