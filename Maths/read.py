# -*- coding: utf-8 -*-
"""
Created on Mon Dec 14 10:43:29 2020

@author: Cypher
"""

import pandas as pd
#reading the DataSet
mydata = pd.read_csv('D:/My Docs/MCA/Sem1/maths/DataSet/Diabetes.csv')

#displaying data about the DataSet
mydata.info()

print(mydata.head()) #first 5 rows
print(mydata.tail()) #last 5 rows 

#fill all the values in x with na
x = 0
mydata = mydata.fillna(x)
print(mydata)

#make a new dataset using the previous dataset
mydata2 = mydata[["Glucose", "BMI", "Age", "Outcome"]]
print(mydata2.head())

# Gives Summary about the dataset
print(mydata2.describe())