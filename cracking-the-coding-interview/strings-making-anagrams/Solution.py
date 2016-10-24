def number_needed(a, b):
    freq = [0] * 26
    for c in a:
        freq[ord(c)-ord('a')]+=1
    for c in b:
        freq[ord(c)-ord('a')]-=1
    deleteCount = 0
    for val in freq:
        deleteCount += abs(val)
    return deleteCount

a = raw_input().strip()
b = raw_input().strip()

print number_needed(a, b)