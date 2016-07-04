print(5)
print('4 3')
print('0 -3 4 2')
print('5 2')
print('0 -3 4 2 2')
print('3 3')
print('0 -3 4') 
print('7 2')
print('0 -3 1 1 1 1 1')
print('6 3')
print('0 -3 4 2 1 1')

t = int(raw_input());
for i in range (0,t):
    n,k = map(int, raw_input().strip().split())
    arrive = 0
    a = map(int,raw_input().split())
    for j in range (0,n):
        if a[j] <=0:
            arrive += 1
    if arrive >= k:
        print "NO"
    else:
        print "YES" 