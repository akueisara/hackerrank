#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    hmap = {}
    result = 0
    for element in ar:
        if element not in hmap:
            hmap[element] = 1
        else:
            if hmap[element] == 0:
                hmap[element] = 1
            else:
                result += 1
                hmap[element] = 0
    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
