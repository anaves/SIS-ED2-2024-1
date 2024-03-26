def fatorial(n):
    # caso base
    if n == 0:
        return 1
    else:
        return n*fatorial(n-1)
def fatorial_nrec(n):
    r = 1
    for i in range(1,n+1):
        r=r*i
    return r

r = fatorial_nrec(10000)
print(r)