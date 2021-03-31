import pandas as pd, scipy.stats as st

temp = pd.Series([14.2,16.4,11.9,15.2,18.5,22.1,19.4,25.1,23.4,18.1,22.6,17.2])
sales = pd.Series([215,325,185,332,406,522,412,614,544,421,445,408])
print(f"The Correlation between Temperatures and Ice-Cream Sales is {temp.corr(sales)}")
print(f"The Correlation between Ice-Cream Sales and Temperatures is {sales.corr(temp)}")

res = st.linregress(temp, sales)
print("The Linear Regression analysis are:")
print(f"The slope of the regression line is {res.slope}")
print(f"The Intercept of the regression line is {res.intercept}")
print(f"The correlation coefficient is {res.rvalue}")
print(f"The Standard error of the estimate is {res.stderr}")