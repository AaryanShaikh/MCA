import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password=""
)
cur = mydb.cursor()
sql = "create database department"
cur.execute(sql)
print("Database Created Successfully")

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="department"
)
cur = mydb.cursor()

cur.execute(
    "CREATE TABLE student (stdID int primary key, name varchar(255), fnameC1 varchar(255), fnameC2 varchar(255), fnameC3 varchar(255))")
cur.execute("create table faculty (facID int primary key, name varchar(255), courseTeach varchar(255))")

sql = "insert into student (stdID,name,fnameC1,fnameC2,fnameC3) values (%s,%s,%s,%s,%s)"
val = [
    ('17032', 'Aaryan', 'Satish', 'Bhiku', 'Amey'),
    ('17034', 'Shahul', 'Satish', 'Bhiku', 'Amey'),
    ('17046', 'Maddy', 'Satish', 'Bhiku', 'Amey'),
    ('17038', 'Ahmed', 'Satish', 'Bhiku', 'Amey'),
    ('17039', 'Shruti', 'Satish', 'Bhiku', 'Amey'),
    ('17025', 'Arfa', 'Satish', 'Bhiku', 'Amey'),
    ('17047', 'Bhawesh', 'Satish', 'Bhiku', 'Amey'),
    ('17031', 'Saish', 'Satish', 'Bhiku', 'Amey'),
    ('17048', 'Shubam', 'Satish', 'Bhiku', 'Amey'),
    ('17029', 'Qahar', 'Satish', 'Bhiku', 'Amey')
]
cur.executemany(sql, val)
mydb.commit()
print(f"{cur.rowcount} records were inserted in student table")

sql = "insert into faculty (facID,name,courseTeach) values (%s,%s,%s)"
val = [
    ('100', 'Satish', 'W.T'),
    ('101', 'Bhiku', 'DBMS'),
    ('102', 'Amey', 'Android')
]
cur.executemany(sql, val)
mydb.commit()
print(f"{cur.rowcount} records were inserted in faculty table")

sql = "update faculty set courseTeach = 'OS' where name = 'Amey'"
cur.execute(sql)
print(f"{cur.rowcount} rows have been updated")

sql = "delete from student where name = 'Qahar'"
cur.execute(sql)
mydb.commit()
print(f"{cur.rowcount} rows were deleted")

sql = "select * from faculty"
cur.execute(sql)
res = cur.fetchall()
for i in res:
    print(i)

sql = "select student.stdID,student.name,faculty.name from student inner join faculty on student.fnameC1 = faculty.name"
cur.execute(sql)
res = cur.fetchall()
for i in res:
    print(i)
