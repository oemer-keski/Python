städte = []
kosten = []
tage = []

print("Willkommen beim Reiseplaner!")

while True:
    stadt = input("Stadtname eingeben: ")
    if stadt.lower() == "fertig":
        break
    try:
        kosten_eingabe = float(input("Bitte gib die Kosten ein: "))
        tage_eingabe = int(input("Bitte gib die Übernachtungstage ein: "))
    except ValueError:
        print("Bitte gültige Zahlen eingeben!")
        continue
    städte.append(stadt)
    kosten.append(kosten_eingabe)
    tage.append(tage_eingabe)

print("\nReiseliste")
for i in range(len(städte)):
    kosten.sort()
    print(f"{städte[i]} {kosten[i]:.2f} €uro {tage[i]} Tage")

anzahl = len(städte)
gesamt_kosten = sum(kosten)
gesamt_tage = sum(tage)
durchschnitt_kosten = gesamt_kosten / anzahl
durchschnitt_tage = gesamt_tage / anzahl

print("\nAuswertung:")
print("Anzahl der Ziele:", anzahl)
print("Gesamtkosten:", round(gesamt_kosten, 2), "Euro")
print("Gesamtdauer:", gesamt_tage, "Tage")
print("Kosten pro Ziel:", round(durchschnitt_kosten,2), "Euro")
print("Dauer pro Ziel:", round(durchschnitt_tage, 1), "Tage")

teuerste = kosten.index(max(kosten))
billiger = kosten.index(min(kosten))
print("Teuerstes Ziel:", städte[teuerste], f"({kosten[teuerste]:.2f} €)")
print("Günstigstes Ziel:", städte[billiger], f"({kosten[billiger]:.2f} €)")



