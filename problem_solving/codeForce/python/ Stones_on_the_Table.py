n=int(input())
s=str(input())
count=0

for i in range(1,n):
    if s[i]==s[i-1]:
        count+=1

print(count)
