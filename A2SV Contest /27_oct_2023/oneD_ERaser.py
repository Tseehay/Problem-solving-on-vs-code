t=int(input())

for i in range(t):
    n,k=[int(x) for x in input().split()]
    s=str(input())
    count=0
    op=0

    for j in s:
        if j=='B':
            count+=1
        else:
            if count>0 and count==k:
                op+=1
                count=0
    
    if count>0:
        op+=1

    print(op)

