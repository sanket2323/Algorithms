n = 5

for i in range(n):
    for j in range(n-i-1):
        print(' ',end='')
    print('x' * (2*i + 1))
    
#pascel triangle


for i in range(n):
    print(" " * (n - i - 1), end="")
    print("1 " * (i + 1))