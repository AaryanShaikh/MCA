import numpy as np
# 1) determinant of a matrix
mat1 = np.array([[5, 2, 1, 4, 6], 
                    [9, 4, 2, 5, 2], 
                    [11, 5, 7, 3, 9], 
                    [5, 6, 6, 7, 2], 
                    [7, 5, 9, 3, 3]])  
det = np.linalg.det(mat1)
print(mat1)   
print("\nDeterminant of given 5X5 matrix:") 
print(int(det))

# 2) transpose of a matrix
mat2 = np.matrix('[4, 1; 12, 3]')
trans = mat2.transpose()
print(mat2) 
print("\nTranspose of the 2x2 matrix:")
print(trans)

# 3) inverse of a matrix
mat3 = np.array([[6, 1, 1, 3], 
              [4, -2, 5, 1], 
              [2, 8, 7, 6], 
              [3, 1, 9, 7]]) 

# Calculating the inverse of the matrix 
inv = np.linalg.inv(mat3)
print(mat3)
print("\ninverse of 5x5 matrix:")
print(inv)

# 4) EigenValue & EigenVector of a 3x3 matrix
mat4 = np.array([[1, 2, 3], 
              [2, 3, 4], 
              [4, 5, 6]])

print("\nPrinting the Original square array:\n", mat4)
w, v = np.linalg.eig(mat4)
print("\nPrinting the Eigen values of the given square array:\n", w)    
print("\nPrinting Right eigenvectors of the given square array:\n", v)

# 5) Gauss Elimination Method
import sys
# Reading number of unknowns
n = int(input('Enter number of unknowns: '))
# Making numpy array of n x n+1 size and initializing
# to zero for storing augmented matrix
a = np.zeros((n,n+1))
# Making numpy array of n size and initializing
# to zero for storing solution vector
x = np.zeros(n)
# Reading augmented matrix coefficients
print('Enter Augmented Matrix Coefficients:')
for i in range(n):
    for j in range(n+1):
        a[i][j] = float(input( 'a['+str(i)+']['+ str(j)+']='))

# Applying Gauss Elimination
for i in range(n):
    if a[i][i] == 0.0:
        sys.exit('Divide by zero detected!')
    
    for j in range(i+1, n):
        ratio = a[j][i]/a[i][i]

    for k in range(n+1):
        a[j][k] = a[j][k] - ratio * a[i][k]

# Back Substitution
x[n-1] = a[n-1][n]/a[n-1][n-1]

for i in range(n-2,-1,-1):
    x[i] = a[i][n]

    for j in range(i+1,n):
        x[i] = x[i] - a[i][j]*x[j]
    x[i] = x[i]/a[i][i]

# Displaying solution
print('\nRequired solution is: ')
for i in range(n):
    print('X%d = %0.2f' %(i,x[i]), end = '\t')
    
# 6) Gauss Jorden Method
# Reading number of unknowns
n = int(input('Enter number of unknowns: '))

# Making numpy array of n x n+1 size and initializing
# to zero for storing augmented matrix
a = np.zeros((n,n+1))

# Making numpy array of n size and initializing
# to zero for storing solution vector
x = np.zeros(n)

# Reading augmented matrix coefficients
print('Enter Augmented Matrix Coefficients:')
for i in range(n):
    for j in range(n+1):
        a[i][j] = float(input( 'a['+str(i)+']['+ str(j)+']='))

# Applying Gauss Jordan Elimination
for i in range(n):
    if a[i][i] == 0.0:
        sys.exit('Divide by zero detected!')
    
    for j in range(n):
        if i != j:
            ratio = a[j][i]/a[i][i]
    
    for k in range(n+1): 
        a[j][k] = a[j][k] - ratio * a[i][k]

# Obtaining Solution
for i in range(n):
    x[i] = a[i][n]/a[i][i]

# Displaying solution
print('\nRequired solution is: ')
for i in range(n):
    print('X%d = %0.2f' %(i,x[i]), end = '\t')    