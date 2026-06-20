n = int(input()) 
r1 = int(input()) 
r2 = int(input()) 
r3 = int(input()) 
 
litres = 0 
 
while n >= r1 or n >= r2: 
    if r2 - r3 <= r1: 
        litres += 1 
        n = n - r2 + r3 
    elif r2 - r3 > r1: 
        litres += 1 
        n = n - r1 
 
print(litres) 