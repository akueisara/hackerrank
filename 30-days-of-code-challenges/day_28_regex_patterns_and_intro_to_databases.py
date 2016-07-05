#!/bin/python

import sys
import re

a=[]
N = int(raw_input().strip())
for a0 in xrange(N):
    firstName,emailID = raw_input().strip().split(' ')
    firstName,emailID = [str(firstName),str(emailID)]
    p = re.search(r'.+@gmail.com',emailID)
    if p != None:
        a.append(firstName)

        b=sorted(a)

for i in b:
    print i