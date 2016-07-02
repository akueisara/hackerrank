import math

# Enter your code here. Read input from STDIN. Print output to STDOUT
def isPrime(n):
    if n<2:
        return False
    else:
        for x in xrange(2, int(math.sqrt(n))+1):
            if(n%x==0):
                return False
    return True
                        
t = int(input())
for i in xrange(t):
    n = int(input())
    if(isPrime(n)):
        print "Prime"
    else:
        print "Not prime"