import time


def elapse(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)  # 핵심 기능
        end = time.time()
        print("걸린 시간 : %f" % (end - start))
        return result

    return wrapper


@elapse
def myfunc():
    print("실행")


myfunc()


# decoratedMyFunc = elapse(myfunc)
# decoratedMyFunc()

@elapse
def factorial(num):
    if num < 1:
        return 1
    return num * factorial(num - 1)


factorial(100)
