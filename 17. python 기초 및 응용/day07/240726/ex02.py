class Calculator:
    def setdata(self, a, b):  # self 는 생성된 객체의 참조 값
        self.a = a
        self.b = b


cal1 = Calculator()
cal1.setdata(10, 20)
# 둘다 가능
cal2 = Calculator()
Calculator.setdata(cal2, 20, 30)
print(cal2.a, cal2.b)

cal3 = Calculator()
print(id(cal1), id(cal3))
