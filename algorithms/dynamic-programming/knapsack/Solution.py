# Enter your code here. Read input from STDIN. Print output to STDOUT
t=raw_input()
for i in range(0,int(t)):
    n,k = map(int, raw_input().strip().split(" "))
    cost = [int(j) for j in raw_input().strip().split(" ")]
    c = [0] * (k+1)
    for j in range(0,n):
        for z in range(cost[j],k+1):
            c[z] = max(c[z], c[z-cost[j]]+cost[j])
    print c[k]