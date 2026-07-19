arr = arr = [64, 34, 25, 12, 22, 11, 90]

for i in range(0, len(arr)):
    
    j = i 
    
    while j > 0 and arr[j] < arr[j - 1 ]:
        arr[j], arr[j - 1] = arr[j - 1], arr[j]
        j -= 1
print("Sorted array is:", arr)