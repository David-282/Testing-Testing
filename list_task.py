number = [1,2,3,4,5]
numbers = [1,2,3,4,5,6,7,8,9,10]
words = ["folashade","z","pension","fola-jimmy","dayo"]

def adding_list_element (numbers):
    sum=0
    for element in numbers:
        sum += element
    return sum

print (adding_list_element(number))

def odd_index_element(numbers):
    result= []
    for count in range (0,len(numbers)):
        if count % 2!=0:
            result.append(numbers[count])
    return result

result =odd_index_element(numbers)
for count in result:
    print (count)


def word_length (word):
    count=0
    for letter in word:
        count+=1
    return count 


def word_length_list (words):
    new_list = []
    length =0
    for word in words:
        length = word_length(word)
        new_list.append (length)
    return new_list

print (word_length_list(words))
        
def sorting_list (words):
    words.sort()
    return words

print (sorting_list(words))


def enumerate_testing (words):
    index_list =[]
    element_list =[]
    sorted_word = sorting_list(words)
    for index,element in enumerate(sorted_word):
        index_list.append((index ,element))
    return index_list

print(enumerate_testing(words))
final_result  = (enumerate_testing(words))
for element in final_result:
    print(element)


# list comprehension
names = ["folashade","z","pension","fola-jimmy","dayo"]
name_list = [name for name in names if len(name) >9]
print (name_list)

# tuple 
letter = (6,8,9)
number += letter
print(number)


# filter

numbers =[10,3,7,19,4,2,8,5,6]
def is_odd(number):
    return number % 2 !=0
# result=list [filter(is_odd,numbers)]

answer=list (filter(is_odd,numbers))
print(answer)







