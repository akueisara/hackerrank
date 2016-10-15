def getMedian(a, start, end):
    median = 0
    size = end - start + 1
    if (size % 2 == 0):
        median = (a[start + size / 2 - 1] + a[start + size / 2]) / 2
    else:
        median = a[start + (size - 1) / 2]
    return median

n = int(raw_input())
a = list(map(int, raw_input().split()))
f = list(map(int, raw_input().split()))
for i in range(n):
    element = a[i]
    frequency = f[i]
    while(frequency > 1):
        a.append(element)
        frequency -= 1
a.sort()
n = len(a)
Q1 = getMedian(a, 0, n / 2 - 1)
Q2 = getMedian(a, 0, n - 1)
if (n % 2 == 0):
    Q3 = getMedian(a, n / 2, n - 1)
else:
    Q3 = getMedian(a, n / 2 + 1, n - 1)
print "%0.1f" % (Q3 - Q1)