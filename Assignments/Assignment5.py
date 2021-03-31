import Converter as con

cel = int(input("Enter the value of Celsius to convert to Fahrenheit (e.g. 23)\n"))
print(f"{cel} Celsius is {con.conTemp(cel)} Fahrenheit")
dol = int(input("Enter the value of Dollar to convert to Rupee (e.g. 5)\n"))
print(f"{dol} Dollar is {con.conMoney(dol)} Rupee")
ht = int(input("Enter the height in cm (e.g. 175)\n"))
wt = int(input("Enter the weight in kg (e.g. 75)\n"))
print(f"Your Body Mass Index(BMI) is {con.conBMI(ht, wt)}")
