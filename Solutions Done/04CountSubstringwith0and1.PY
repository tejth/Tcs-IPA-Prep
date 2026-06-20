from collections import defaultdict

s = input()
nums=[-1 if ch=='0' else 1 for ch in s]

prefix_count = defaultdict(int)
prefix_count[0]=1
prefix_sum=0
count=0

for num in nums:
    prefix_sum+=num
    count+=prefix_count[prefix_sum]
    prefix_count[prefix_sum]+=1
    
print(count)