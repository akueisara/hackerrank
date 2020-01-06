#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countingValleys function below.
def countingValleys(n, s):
    count = 0
    sealevel = 0
    for path in s:
        if path == 'D':
            sealevel -= 1
        elif path == 'U':
            sealevel += 1
        if sealevel == 0 and path == 'U':
            count += 1
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()