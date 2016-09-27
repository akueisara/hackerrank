def array_left_rotation(a, n, k):
    rotated = [0] * n
    for i in range(0, n):
        rotated[(i+n-k)%n] = a[i]
    return rotated

n, k = map(int, raw_input().strip().split(' '))
a = map(int, raw_input().strip().split(' '))
answer = array_left_rotation(a, n, k);
print ' '.join(map(str,answer))