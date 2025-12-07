package tests.fehlerhaft.c2kategorie;

public class Connection {
      /*
       * Name impliziert Aktion, aber Methode gibt unpassenden Wert zurück
       */
      public int disconnect() {
            return 1;
      }
}