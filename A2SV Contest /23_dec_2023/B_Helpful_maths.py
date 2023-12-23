s = input()
sum = [int(x) for x in s.split('+')]
sum.sort()
new_sum = "+".join(map(str, sum))

print(new_sum)