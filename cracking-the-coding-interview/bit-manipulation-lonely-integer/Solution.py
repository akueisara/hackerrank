#!/bin/python

import sys

def lonely_integer(a):
    result = 0
    for i in range(len(a)):
        result ^= a[i]
    return result

n = int(raw_input().strip())
a = map(int,raw_input().strip().split(' '))
print lonely_integer(a)