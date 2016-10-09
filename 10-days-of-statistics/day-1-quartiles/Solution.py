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
a.sort()
print getMedian(a, 0, n / 2 - 1)
print getMedian(a, 0, n - 1)
if (n % 2 == 0):
    print getMedian(a, n / 2, n - 1)
else:
    print getMedian(a, n / 2 + 1, n - 1)