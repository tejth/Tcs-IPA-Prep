n = int(input())
arr = []

for i in range(n):
    arr.append(int(input()))
    
    
if n % 2 == 0:
    mid = n //2
    
    arr[mid-1]=arr[mid-1] + arr[mid]
    arr.pop(mid)

print(arr)