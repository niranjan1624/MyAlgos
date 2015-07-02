def calnooffours(n):
    n4 = (n-4)/10 + 1
    x = 40
    while(n >= x):
        if(n >= x+10):
            n4 = n4 + 10 - 1
        else:
            n4 = n4 +  n%10 + 1
        x = x + 100
    print n4

calnooffours(328)
