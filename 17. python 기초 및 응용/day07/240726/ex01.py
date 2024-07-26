import sys

args = sys.argv[1:]
print(args)
for arg in args:
    print(arg.upper(), end='')
