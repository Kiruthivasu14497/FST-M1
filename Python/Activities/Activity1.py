name=input("Enter user name: ")
age=int(input("Enter user age: "))

year_when_100= 2025+(100-age)
print(name + " will turn 100 in the year " + str(year_when_100))
print(name + " will turn 100 in the year {}".format(year_when_100))