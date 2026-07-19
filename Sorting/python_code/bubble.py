arr = [64, 34, 25, 12, 22, 11, 90]

len_arr = len(arr)

for i in range(len_arr):
    
    for j in range(0, len_arr-i-1):
        
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            
print("Sorted array is:", arr)  