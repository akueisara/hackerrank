# Enter your code here. Read input from STDIN. Print output to STDOUT
t= input()
for i in range(t):
    n = input()
    totalnumberofthree = (n-1)/3
    sumthree = 3*totalnumberofthree*(totalnumberofthree + 1)/2
    totalnumberoffive = (n-1)/5
    sumfive = 5*totalnumberoffive*(totalnumberoffive + 1)/2
    totalnumberoffifteen = (n-1)/15
    sumfifteen = 15*totalnumberoffifteen*(totalnumberoffifteen + 1)/2
    print (sumthree + sumfive - sumfifteen)