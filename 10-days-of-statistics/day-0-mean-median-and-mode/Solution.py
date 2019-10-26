# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
def getMean(list):
    sum = 0
    for i in list:
        sum += i
    mean = float(sum) / len(list)
    return mean

def getMedian(list):
    median = 0.0
    size = len(list)
    copy = list
    copy.sort()
    if(size % 2 == 0):
        median = float(copy[size//2 - 1] + copy[size//2]) / 2
    else:
        median = copy[(size-1)/2]
    return median

def getMode(list):
    mode = 0
    size = len(list)
    count, max = 0, 0
    copy = list
    copy.sort()
    current = 0
    for i in copy:
        if (i == current):
            count += 1
        else:
            count = 1
            current = i
        if (count > max):
            max = count
            mode = i
    return mode

# if it runs in Python 3, change raw_input() to input()
size = int(raw_input())
a = list(map(int, raw_input().split()))
print(getMean(a))
print(getMedian(a))
print(getMode(a))
