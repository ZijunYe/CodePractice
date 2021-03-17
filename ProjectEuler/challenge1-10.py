
#challenge1
def multiples_sum(x):
    '''
    (int)-->int
    '''
    total_sum=0
    for i in range(x):
        if i%3==0 or i%5==0:
            total_sum=total_sum+i
    return total_sum

#challenge2
def Fibonacci(f):
    '''
    (int)-->int
    '''
    x=0
    y=1
    total=0
    while y<f:
        tmp=y
        y=x+y
        x=tmp
        if y%2==0:
            total = total+y

    return total

#challenge3
def largest_prime_factor(x):
    '''
    (int)-->int
    '''
    i=1
    factor=1
    while i<=x:
        if x%i==0 and i!=1:
            x=x//i
            print(i)
            if i>factor:
                factor=i
        else:
            i+=1

    return factor

#challenge4
def largest_palindrome_product():
    '''
    (none)-->int'''
    largest=None
    for i in range(100,1000):
        for j in range(100,1000):
            x=i*j
            if is_palindrome(x):
                if largest==None or x>largest:
                    largest=x
    return largest
            
def is_palindrome(x):
    y=str(x)
    z=str(x)[::-1]
    if y==z:
        return True
    else:
        return False


#challenge5
def is_multiple(x,rangeenter):
    for i in range(2,rangeenter):
        if x%i!=0:
            return False
    return True


def smallest_multiple(n):
    while not is_multiple(n,21):
        n+=20
    return n


#challenge6
def sum_of_squares1(x):
    square_sum=0
    sum_square=0
    for i in range(1,x+1):
        square_sum=square_sum+i**2
    for j in range(1,x+1):
        sum_square=sum_square+j
        
    print((sum_square)**2)
    print(square_sum)

def sum_of_square2(x):
    #pattern of square of sum (x+1)*(x/2)  --> n*(n+1)/2
    #pattern of sum of square [(x* (x+1)) *(x+(x+1)) ]/6
    sum_square=((x+1)*(x/2))
    square_sum= (((x*(x+1))*(x+(x+1)))/6)
    print( (sum_square)**2)
    print(square_sum)
    print((sum_square)**2 -square_sum)
        
        

#challenge7
def prime_number(x):
    #what is prime number?
    # the natural number greater than 1 and not a product of two smaller natural number 
    # ex. 4 =2*2 / 6=2*3 / 8=2*2*2 / 9=3*3
    # the divisor only itself and 1
    #from small prime factor to larger factor are more eeasy to find
    # your factor could be constrain from 2-half of number 
    prime=[]
    i=2
    while len(prime)<=x:
        divisor=[1,i]
        j=2
        while len(divisor)<=2 and j<i//2+1:
            if i%j==0  and j!=i:
                divisor.append(j)
            j=j+1
        if len(divisor)==2:
            prime.append(i)
        i=i+1
                    
    return prime
                    

#challenge8
def largest_product(x):
    #what is adjacent digits： the combination of digits according to the requires

    digit_number="7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
    for i in range(len(digit_number)):
        if (i+x)> len(digit_number):
            return(largest,largest_product)
        else:
            product=1
            for j in range(i,i+(x)):
                product=product*int(digit_number[j])
            digit=digit_number[i:i+x]
            if i==0:
                largest_product=product
                largest=digit
            elif product>largest_product:
                largest=digit
                largest_product=product
    print(largest)
    print(largest_product)
            
 
