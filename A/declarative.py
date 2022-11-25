# def hof_product(multiplier):
#     return lambda x: x * multiplier

# mult6 = hof_product(6)
# print(mult6(6)) # 36


# names = ['Shiva', 'ram', 'laxmi', 'Saraswoti']
# # Instead of: map(lambda x: 'Hi ' + x, names), we can do
# greeted_names = ['Hi ' + name for name in names]

# print(greeted_names)


# print(2%10)



s = str(input("Enter any number"))
s = s.lower()
n = ""


for i in range(len(s)-1, 0-1, -1):
    n = n+s[i]

print(n)
if n == s:
    print("Palindrome")
else:
    print("Non-palindrome")

