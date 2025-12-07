package tests.fehlerhaft.c1kategorie;

public class Config {

      /*
       * disable() gibt ein Objekt zurück,
       * das eigentlich "enabled" bedeutet.
       */
      public ControlState disable() {
            return new ControlState(true); // true = enabled
      }

      private static class ControlState {
            public boolean enabled;

            public ControlState(boolean enabled) {
                  this.enabled = enabled;
            }
      }
}
