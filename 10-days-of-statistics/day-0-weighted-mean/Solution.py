n = int(raw_input())
x = list(map(int, raw_input().split()))
w = list(map(int, raw_input().split()))
dividend, divisor = 0.0, 0
for i in range(n):
    dividend += x[i] * w[i]
    divisor += w[i]
print "%0.1f" % (dividend/divisor)