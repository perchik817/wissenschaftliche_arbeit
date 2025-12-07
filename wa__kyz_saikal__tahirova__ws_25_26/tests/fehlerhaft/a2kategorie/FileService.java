package tests.fehlerhaft.a2kategorie;

public class FileService {
      /*
       * „tut etwas anderes als der Name sagt”
       * 
       * Name sagt „load…“, aber Funktion löscht etwas.
       */
      public void loadConfig() {
            deleteOldConfig();  // Gegenteil
      }

      private void deleteOldConfig() { /* ... */ }
}
