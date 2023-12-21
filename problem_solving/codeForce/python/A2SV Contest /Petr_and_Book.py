n=int(input())
pages=[int(x) for x in input().split()]

count=1

while n>0:
    n-=pages[count-1]
    if n<=0:
        break
    count = (count % 7) + 1

print(count)