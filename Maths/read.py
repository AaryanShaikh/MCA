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

#all the objects of the dataset
print(mydata2.columns[:])

#all the objects of the dataset -1
print(mydata2.columns[:-1])

#will display all the values and check if they contain 0 or not 
print(mydata2[mydata2.columns[:-1]]==0)

#this will display true and false column with the help of this we can extract the data required 
print((mydata2[mydata2.columns[:-1]]==0).any(axis=1))

#this will extract rows which does contain 0 
mydata3 = mydata2.loc[(mydata2[mydata2.columns[:-1]]==0).any(axis=1)]
print(mydata3)

#this will extract rows which does not contain 0
mydata4 = mydata2.loc[~(mydata2[mydata2.columns[:-1]]==0).any(axis=1)]
print(mydata4)
print(mydata4.describe())

#this will give the mean of all the values which are singlarly grouped
print(mydata4.groupby("Outcome").mean())

#to calculate different aggregation(averages) for difffernt data
print(mydata4.groupby("Outcome").agg({"Glucose":"mean","BMI":"median","Age":"sum"}))

#how to seperate dataframe
print(mydata4["Outcome"]==1)
print(mydata4["Outcome"]==0)

diabiatic = mydata4.loc[mydata4["Outcome"]==1]
nonDiabiatic = mydata4.loc[mydata4["Outcome"]==0]
#how many columns are there an rows are there
print(diabiatic.shape,nonDiabiatic.shape)

#export data
diabiatic.to_csv("diabiatic.csv")
nonDiabiatic.to_csv("nonDiabiatic.csv")
