n = int(input())
lst = [int(input()) for _ in range(n)]



lst.sort()
ant = []
for i in range(n-1,-1,-2):
    ant.append(lst[i])
    
for i in range(1,n,2):
    ant.append(lst[i])
    
print(ant)