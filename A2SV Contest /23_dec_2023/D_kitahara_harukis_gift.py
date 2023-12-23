n = int(input())
apples = list(map(int, input().split()))

total_weight = sum(apples)
count_200_gram = apples.count(200)

if total_weight % 2 == 0 and count_200_gram % 2 == 0:
    print("YES")
else:
    print("NO")