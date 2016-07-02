# Enter your code here. Read input from STDIN. Print output to STDOUT
day_a,month_a,year_a= map(int, raw_input().strip().split(' '))
day_e,month_e,year_e= map(int, raw_input().strip().split(' '))
fine = 0
if (day_a > day_e) and (month_a == month_e) and (year_a == year_e):
    fine = (day_a - day_e)*15
if (month_a > month_e) and (year_a == year_e):
    fine = (month_a - month_e)*500
if year_a > year_e:
    fine = 10000
print fine