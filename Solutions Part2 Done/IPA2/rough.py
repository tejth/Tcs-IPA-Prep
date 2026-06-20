from collections import defaultdict
n = input()

lst = [-1 if ch=='0' else 1 for ch in n]


prefix_count = defaultdict(int)
prefix_count[0]=1
prefix_sum=0
count=0


for el in lst:
    prefix_sum+=el
    count+=prefix_count[prefix_sum]
    prefix_count[prefix_sum] += 1

print(count)