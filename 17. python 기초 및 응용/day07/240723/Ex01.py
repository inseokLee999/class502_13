nums = [i ** 2 for i in range(1, 11)]
print(nums)


def square(num):
    return num * num


nums2 = list(map(square, nums))
print(nums2)
nums3 = list(map(lambda a: square(a), nums))
print(nums3)

add = lambda a,b:a+b
print(add(2,3))
