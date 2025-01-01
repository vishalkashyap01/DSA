# Anagram String
str_one = input("enter a word : ")
str_two = input("enter a word : ")

if sorted(str_one) == sorted(str_two):
    print(str_one, " & ", str_two, " are Anagram Strings!")
else:
    print("Not an Anagram strings!")
    

# next qs...
     