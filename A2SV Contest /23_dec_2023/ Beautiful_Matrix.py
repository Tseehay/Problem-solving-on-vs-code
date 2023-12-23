matrix = []
for _ in range(5):
    row = [int(x) for x in input().split()]
    matrix.append(row)


for i in range(5):
    for j in range(5):
        if matrix[i][j] == 1:
            r, c = i, j
            break


row_swaps = abs(r - 2)
column_swaps = abs(c - 2)


total_moves = row_swaps + column_swaps

print(total_moves)