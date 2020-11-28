#Link to Problem: https://codeforces.com/problemset/problem/1/A
#Date: 11/27/2020

n, m, a = input().split()

n = int(n)
m = int(m);
a = int(a);

l1 = 0
l2 = 0

if(m % a != 0):
   l1 = int((m / a) + 1);

else:
   l1 = int(m / a)

if(n % a != 0):
   l2 = int((n / a) + 1);

else:
   l2 = int(n / a)
   
print(l1 * l2);