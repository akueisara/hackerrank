#!/bin/python

import sys

t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    if(k%2==0):
        if(((k-1)|k)<=n):
            print k-1
        else:
            print k-2
    else:
        print k-1
