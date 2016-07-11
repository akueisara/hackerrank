# Enter your code here. Read input from STDIN. Print output to STDOUT
T = raw_input()
for i in range(0, int(T)):
    N, M, S = map(int,raw_input().strip().split(' '))
    id = (S+M-1)%N
    if id == 0:
        print N
    else:
        print id