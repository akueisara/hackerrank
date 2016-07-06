#!/bin/python

import sys

t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    a = k - 1
    b = ~a & -~a
    if a | b > n:
        print a - 1
    else:
        print a