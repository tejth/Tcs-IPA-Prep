num = bin(int(input()))

ones = 0
for char in num:
    if char=="1":
        ones+=1

if ones%2==0:
    print("Even Parity")
else:    print("Odd Parity")