#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
    aCountInS = 0
    aCountInTheLastS = 0
    for i in range(0, len(s)):
        if s[i] == 'a':
            aCountInS += 1
            if i < n % len(s):
                aCountInTheLastS += 1
    return (n // len(s)) * aCountInS + aCountInTheLastS

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()