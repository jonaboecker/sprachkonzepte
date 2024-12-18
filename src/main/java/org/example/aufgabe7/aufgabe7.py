import requests
import json
from datetime import datetime

# 1. Dynamische Typisierung: Variablen müssen nicht deklariert werden und können Werte beliebigen Typs aufnehmen.
response = requests.get('https://feiertage-api.de/api/?jahr=2024&nur_land=BY')  # Dynamische Zuweisung eines Response-Objekts

# 2. Standardbibliotheken: Python bietet eine umfangreiche Standardbibliothek mit Modulen wie `requests` (für HTTP-Requests) oder `json`.
if response.status_code == 200:
    # 3. Interpretiertes Einlesen: Der Code wird Zeile für Zeile ausgeführt, ohne Kompilierung.
    holidays = json.loads(response.text)  # Direktes Parsen des JSON-Antworttextes

    # 4. Dictionary-Syntax: Datenstrukturen wie Dictionaries sind einfach nutzbar und flexibel.
    for name, details in holidays.items():
        date = datetime.strptime(details['datum'], '%Y-%m-%d')
        print(f"Feiertag: {name}, Datum: {date.strftime('%d.%m.%Y')}")  # 5. String-Interpolation für einfache String-Formatierung
else:
    print(f"Fehler beim Abrufen der Daten: {response.status_code}")

# 6. Plattformunabhängigkeit: Der Code ist auf jeder Plattform mit einer Python-Umgebung lauffähig.
# 7. Schnelle Entwicklungszyklen: Durch die einfache Syntax und das Fehlen eines Kompilierungsschrittes können Programme schneller erstellt und getestet werden.
