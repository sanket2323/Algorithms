arr =  [3,5,8,15,19]

def lower_bound(arr, target):
    n = len(arr)
    low, high = 0, n
    
    while low <= high:
        mid = (low + high) // 2
        
        if arr[mid] < target:
            low = mid + 1
        elif arr[mid] == target:return mid
        else:
            high = mid - 1
            
    return mid  # Return the index of the lower bound

sample_target = 9
result = lower_bound(arr, sample_target)
if result != -1:
    print(f"Lower bound for {sample_target} is at index: {result}")
    
    