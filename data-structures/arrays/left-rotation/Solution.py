# Enter your code here. Read input from STDIN. Print output to STDOUT
n, d = map(int, raw_input().split())
arr = map(int, raw_input().split())
result = [0] * n
for i in range(0,n):
  result[(i+n-d)%n] = arr[i]
for i in range(0,n):
    print result[i],
