n = int(input())
a = list(map(int, input().split()))

start = end = -1
for i in range(n - 1):
    if a[i] > a[i + 1]:
        start = i
        break

if start == -1:
    print("yes")
    print("1 1")
    exit()

for i in range(start + 1, n - 1):
    if a[i] < a[i + 1]:
        end = i
        break


if end == -1:
    end = n - 1

reversed_segment = a[start:end + 1][::-1]


if a[:start] + reversed_segment + a[end + 1:] == sorted(a):
    print("yes")
    print(start + 1, end + 1)
else:
    print("no")