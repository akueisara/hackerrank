n, d = map(int, raw_input().split())
arr = map(int, raw_input().split())

dic = {}

def find(idx):
    s = 0
    for i in xrange(0, 200):
        freq = 0
        if i in dic:
            freq = dic[i]
        s = s + freq
        if s>=idx:
            return i

ans = 0
for i in xrange(0, n):
    val = arr[i]

    if i>=d:
        med=find(d/2 + d%2)

        if d%2==0:
            ret = find(d/2+1)
            if val >=med + ret:
                ans = ans+1
        else:
            if val>=med*2:
                ans = ans + 1

    if val not in dic: dic[val] = 0
    dic[val] = dic[val] + 1

    #print i,dic
    if i>=d:
        prev = arr[i-d]
        dic[prev] = dic[prev]-1

print ans