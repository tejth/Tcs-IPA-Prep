s = input()
stack =[]

mapping = {")":"(","}":"{","]":"["}

for ch in s:
    if ch in "({[":
        stack.append(ch)
    elif ch in ")}]":
        if not stack or stack[-1]!=mapping[ch]:
            print("not balanced")
            break
        stack.pop()
        
if not stack:
    print("Balanced")
else:
    print("Not balanced")
        
        
        