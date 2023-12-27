def divide_apples(n, weights):
    total_weight = sum(weights)
    if total_weight % 200 != 0:
        return "NO"

    half_weight = total_weight // 2
    count_200 = weights.count(200)
    count_100 = weights.count(100)


    for i in range(count_200 + 1):
        weight = i * 200
        remaining_weight = half_weight - weight
        if remaining_weight % 100 == 0 and remaining_weight // 100 <= count_100:
            return "YES"

    for i in range(count_100 + 1):
        weight = i * 100
        remaining_weight = half_weight - weight
        if remaining_weight % 200 == 0 and remaining_weight // 200 <= count_200:
            return "YES"

    return "NO"

n = int(input())
weights = list(map(int, input().split()))

print(divide_apples(n, weights))