import random

alter = random.randint(1, 90)
zuschlag = 0.00

if alter <= 6:
    grundpreis = 0.0
elif alter <= 17:
    grundpreis = 6.50
elif alter <= 64:
    grundpreis = 11.00
else:
    grundpreis = 8.00

film_3D = random.choice([True, False])
if film_3D:
    zuschlag = 1.50

gesamtpreis = grundpreis + zuschlag


print(f"Alter: {alter} Jahre")
print(f"Grundpreis: {grundpreis:.2f} €")
print(f"3D-Zuschlag: {zuschlag:.2f} €")
print(f"Gesamtpreis: {gesamtpreis:.2f} €")