def checkPages(novels, pages, friends):
    count = 0

    for i in range(len(novels)):
        count += novels[i] // pages

    return count >= friends



n = int(input())
friends = int(input())
lst = list(map(int , input().split()))



s = 1
e = 99999

m = s+(e-s)//2
res =-1

while s<=e:
    if checkPages(lst , m , friends):
        res = max(res , m)
        s = m+1
    else:
        e = m-1
    m = s+(e-s)//2
    
print("Maximum number of pages that can be read by each friend is : " , res)