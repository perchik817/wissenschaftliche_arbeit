package tests.richtig.c1kategorie;

public class Config {

      public ControlState disable() {
            return new ControlState(false);
      }

      private static class ControlState {
            public boolean enabled;

            public ControlState(boolean enabled) {
                  this.enabled = enabled;
            }
      }
}