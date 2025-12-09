package tests.fehlerhaft.a1kategorie;

public class UserManager {
      private User currentUser;

      /*
       * „tut mehr als der Name sagt”
       * 
       * Name suggeriert einen einfachen Getter, aber enthält Nebenwirkungen.
       */
      public User getUser() {
            logAccess(); //Nebenwirkung
            refreshSession(); //weitere Nebenwirkung
            return currentUser;
      }

      private void logAccess() {
            /*etwas macht*/}
      
      private void refreshSession() {
            /* etwas macht */}
}