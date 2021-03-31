class Ticket:
    def __init__(self, pnr, source, dest, name, doj):
        self.pnr = pnr
        self.source = source
        self.dest = dest
        self.name = name
        self.doj = doj

    def __str__(self):
        return (
            f"PNR:{self.pnr}  Source:{self.source}  Destination:{self.dest}  Name:{self.name}  Date of Journey:{self.doj}")


t1 = Ticket(17032, "GOA", "BHOPAL", "Aaryan", "10-3-21")
t2 = Ticket(17009, "GOA", "US", "Swida", "11-3-21")
t3 = Ticket(17047, "GOA", "BHOPAL", "Bhawesh", "10-3-21")
t4 = Ticket(17043, "GOA", "BHOPAL", "Nehal", "10-3-21")
t5 = Ticket(17025, "GOA", "KARNATAKA", "Arfa", "31-3-21")
t6 = Ticket(17039, "GOA", "BIHAR", "Shruti", "27-3-21")
t7 = Ticket(17046, "GOA", "INDORE", "Maddy", "23-3-21")
t8 = Ticket(17012, "GOA", "BANGALORE", "Farzain", "21-3-21")
t9 = Ticket(17034, "GOA", "RAJASTHAN", "Shahul", "18-3-21")
t10 = Ticket(17021, "GOA", "KERELA", "Nelson", "25-3-21")
f = open("tickets.txt", "a")
f.write(str(t1)+"\n")
f.write(str(t2)+"\n")
f.write(str(t3)+"\n")
f.write(str(t4)+"\n")
f.write(str(t5)+"\n")
f.write(str(t6)+"\n")
f.write(str(t7)+"\n")
f.write(str(t8)+"\n")
f.write(str(t9)+"\n")
f.write(str(t10)+"\n")
f.close()
f = open("tickets.txt","r")
for i in f:
    print(i)