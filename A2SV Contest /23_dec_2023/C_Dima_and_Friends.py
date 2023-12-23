n = int(input())

fingers = [int(x) for x in input().split()]

counts = [0] * 6  

for finger in fingers:
    counts[finger] += 1

counter = 0

for i in range(1, 6):
    if (sum(counts) + i) % (n + 1) != 1: 
        counter += 1

print(counter)