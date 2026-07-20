arr = [1, 2, 3, 4, 5]
target = 9

def binary_search(arr, target):
    n = len(arr)
    low, high =0, n - 1
    
    while low <= high:
        
        mid = (low + high) // 2
        
        if arr[mid] == target: return mid
        elif target > arr[mid]: low = mid + 1
        else: high = mid - 1
    
    return -1  # Target not found

result = binary_search(arr, target)

if result != -1:
    print(f"Element found at index: {result}")
else:
    print("Element not found in the array.")