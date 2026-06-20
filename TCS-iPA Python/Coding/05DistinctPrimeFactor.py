
import math


n = int(input())
def xy(n):
    lst = []
    for i in range(2,math.ceil(n**0.5)):
        if n%i==0:
            lst.append((i,n//i));
    return lst

def prime(num):
    count=0
    for i in range(2, int(num**0.5)+1):
        if num%i==0:
            count+=1
    return not count


def primeFactors(n):
    lst =[]
    for i in range(2, n+1):
        if n%i==0 and prime(i):
            lst.append(i)
    return lst


factor = xy(n)

for ele in factor:
    if(len(primeFactors(ele[0]))==len(primeFactors(ele[1]))):
        print(1)
        break
else:    print(0)
        