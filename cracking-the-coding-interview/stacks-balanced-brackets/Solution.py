def is_matched(expression):
    stack = []
    for next in expression:
        if next == '(' or next == '[' or next == '{':
            stack.append(next)

        if next == ')' or next == ']' or next == '}':
            if not stack:
                return False
            top = stack.pop()
            if next == ')' and top != '(':
                return False
            if next == ']' and top != '[':
                return False
            if next == '}' and top != '{':
                return False
    if not stack:
        return True
    
    return False

t = int(raw_input().strip())
for a0 in xrange(t):
    expression = raw_input().strip()
    if is_matched(expression) == True:
        print "YES"
    else:
        print "NO"