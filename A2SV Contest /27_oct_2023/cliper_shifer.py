# Read the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Read the values of n and k
    n, k = map(int, input().split())

    # Read the string representing the strip of paper
    s = input()

    # Initialize variables
    operations_count = 0
    black_count = 0

    # Iterate over the strip of paper
    for i in s:
        if i == 'B':
            black_count += 1

        if black_count == k:
            operations_count += 1
            black_count = 0

    # Check if there are remaining black cells at the end
    if black_count > 0:
        operations_count += 1

    # Output the minimum number of operations
    print(operations_count)