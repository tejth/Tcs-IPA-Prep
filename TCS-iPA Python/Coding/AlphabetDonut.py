one = 'ADOPQR' 
two = 'B' 
 
word = input().upper() 
count = 0 
 
for ele in word: 
    if ele in one: 
        count += 1 
    elif ele in two: 
        count += 2 
 
print(count)