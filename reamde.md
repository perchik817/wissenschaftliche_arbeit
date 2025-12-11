# Modellantworten zur Bewertung von Java-Bezeichnern

Dieses Repository stellt die Rohdaten zur wissenschaftlichen Arbeit.  
**"Nutzung von Sprachmodellen zur Verbesserung von Bezeichnern in Java-Programmen"**  
an der Westsächsischen Hochschule Zwickau (Fakultät für Physikalische Technik und Informatik, 2025) zur Verfügung.

Die enthaltenen Dateien dokumentieren die Antworten der untersuchten Sprachmodelle auf Java-Beispiele mit linguistischen Anti-Mustern (Kategorien A–F nach Arnaoudova et al.) sowie auf korrekt benannte Kontrollbeispiele. 

## Inhalt und Verzeichnisstruktur

- `modellantworten_tabelle.xlsx`  
  Tabellarische Übersicht der Ergebnisse. Für jedes Beispiel, jede Prompt-Version (V1–V4) und jedes Modell sind die vergebenen Punktwerte der Bewertungskriterien (Anti-Muster-Erkennung, Korrekturqualität, Konventionskonformität, semantische Klarheit, Konsistenz) eingetragen. 

- `v1/`, `v2/`, `v3/`, `v4/`  
  Ordner mit den Modellantworten für die vier in der Arbeit beschriebenen Hinweisversionen: 

  - V1 – Zero-Shot-Hinweis ohne Beispiele  
  - V2 – Few-Shot-Hinweis mit Beispielen für gute Bezeichner  
  - V3 – kontextreicher Hinweis mit Java-Konventionen und Regeln zu Klarheit und Konsistenz  
  - V4 – Hinweis mit kurzer Erklärung der linguistischen Anti-Muster A–F 

  Jeder Versionsordner enthält Unterordner für die drei evaluierten Modelle:

  - `alibaba_qwen/` – Antworten von **Alibaba Qwen3-Coder**  
  - `meta_llama/` – Antworten von **Meta LLaMA 3.1 70B Instruct**  
  - `openai_gpt/` – Antworten von **OpenAI GPT-4o** 

  Die Dateien in diesen Unterordnern sind nach den Testbeispielen benannt und entsprechen den in Kapitel 3.2 der Arbeit beschriebenen Java-Klassen: 

  - `a1.txt`, `a2.txt` – Beispiele der Kategorie A (Methode tut mehr als der Name sagt)  
  - `b1.txt`, `b2.txt`, `b3.txt` – Beispiele der Kategorie B (Name verspricht mehr als implementiert)  
  - `c1.txt`, `c2.txt` – Beispiele der Kategorie C (Name und Verhalten sind gegensätzlich)  
  - `d1.txt`, `d2.txt` – Beispiele der Kategorie D (Attribut enthält mehr als der Name sagt)  
  - `e1.txt`, `e2.txt` – Beispiele der Kategorie E (Name sagt mehr als enthalten ist)  
  - `f1.txt`, `f2.txt` – Beispiele der Kategorie F (Name und Inhalt widersprechen sich)  
  - Dateien mit Suffix `_richtig` (z. B. `a1_richtig.txt`) beziehen sich auf Kontrollbeispiele ohne linguistische Anti-Muster, die zur Analyse von Fehlalarme („False Positives“) verwendet wurden. 

## Bezug zur wissenschaftlichen Arbeit 

Die Struktur des Repositories ist direkt mit den Kapiteln der Arbeit verknüpft:

- **Kapitel 3.2 – Erstellung der Test-Beispiele**  
  Definition der Java-Beispiele und Zuordnung zu den Kategorien A–F.  

- **Kapitel 3.3 – Hinweis-Strategien und Iteration**  
  Beschreibung der Hinweisversionen V1–V4, die den Verzeichnisnamen `v1`–`v4` entsprechen.  

- **Kapitel 3.5 – Durchführung der Tests**  
  Ablauf der Modellabfragen über HAWKI bzw. Qwen KI.  

- **Kapitel 3.6 – Bewertungskriterien**  
  Kriterien, nach denen die Bewertungen in `modellantworten_tabelle.xlsx` vergeben wurden.  

- **Kapitel 4 – Evaluation**  
  Auswertung und Vergleich der Modellleistungen auf Basis der hier abgelegten Antworten. 

Die hier bereitgestellten Dateien ermöglichen die Nachvollziehbarkeit der in der wissenschaftlichen Arbeit berichteten Modellantworten und Bewertungsentscheidungen.

## Nutzung
Die Daten dienen der Dokumentation und Reproduktion der in der wissenschaftlichen Arbeit durchgeführten Experimente. Eine Weiterverwendung sollte den in der Arbeit beschriebenen Kontext, die vereinfachten Beispiele sowie die genannten Einschränkungen (z. B. begrenzte Anzahl von Beispielen, manuelle Bewertung) berücksichtigen. 