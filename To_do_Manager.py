#Aufgabe To Do Manager
 
 
print("To Do Manager")
 
print("1.Aufgabe hinzufügen")
print("2.Aufgaben anzeigen")
print("3.Aufgabe als erledigt markieren")
print("4.Aufgabe löschen")
print("5.Speichern")
print("6.Beenden")
 
import os
 
todo_list = []
erledigte_aufgaben = []
zaehler = 0
 
# beim Start versuchen zu laden
if os.path.exists("todos.txt"):
    with open("todos.txt", "r", encoding="utf-8") as f:
        zeilen = f.readlines()
    todo_list = [zeile.strip() for zeile in zeilen]
else:
    todo_list = []
 
 
while True:
    eingabe01 = input("wähle eine option (1-5): ")
    if eingabe01 == "1":
        aufgabe02 = input("Aufgabe Hinzufügen: ")
        todo_list.append(aufgabe02)
        print(f"{aufgabe02} wird zu den Aufgaben hinzugefügt")
   
 
    elif eingabe01 == "2":
        for durchlauf in range(len(todo_list)):
            zaehler = zaehler +1
            aufgabe = todo_list[durchlauf]
            print(f"{zaehler}.{aufgabe}.")
 
   
    elif eingabe01 == "3":
        aufgabe02 = input("Aufgabe als erledigt markieren: ")
        erledigte_aufgaben.append(aufgabe02)
        print(f"{aufgabe02} wird zu den Aufgaben als erledigt hinzugefügt")
        print(erledigte_aufgaben)
 
 
    elif eingabe01 == "4":
        lösch_funktion = input("Welche Aufgaben möchtest du löschen: ")
        try:
            todo_list.remove(lösch_funktion)
            print(f"{lösch_funktion} wird von den Aufgaben gelöscht.")
        except ValueError:
             print(f"Die Aufgabe '{lösch_funktion}' wurde nicht gefunden.")
 
           
   
                               
 
    elif eingabe01 == "5":
         with open("todos.txt", "w", encoding="utf-8") as f:
            for aufgabe in todo_list:
                f.write(aufgabe + "\n")
            print(f"{aufgabe02} Speichern & Beenden")
            break
 
else:
        print("Ungültige Eingabe bitte Versuch es nochmal")