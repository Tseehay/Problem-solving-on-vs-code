n = int(input())
pages=[int(x) for x in input().split()]

remain = n
count= 1

while remain> 0:
    remain -= pages[count - 1]
    if remain <= 0:
        break
    count = (count % 7) + 1

print(count)