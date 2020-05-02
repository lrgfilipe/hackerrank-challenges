
##################
#### NOT DONE YET
##################

from statistics import median
import time
import timeit, functools
def my_timeit(*args):
    n = 5 # n times to run
    t = timeit.Timer(functools.partial(*args))
    sec = t.timeit(n) / n
    print("Medium call time -> ", int(sec * 1000), " milliseconds | ", round(sec,2), " seconds", sep='')


#def activityNotifications(xs, d):
#    acc = 0
#    i = d
#    while i < len(xs):
        #if xs[i] >= 2 * median(xs[i-d:i]):
        #    acc += 1
#        i += 1
    #print(acc)
#    return acc

my_timeit(activityNotifications, [2,3,4,2,3,6,8,4,5], 5)

# performance tests
my_timeit(activityNotifications, range(20000), 10000)



