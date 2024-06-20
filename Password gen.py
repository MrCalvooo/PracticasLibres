import random

lower = "abcdefghijklmñopqrstuvwxyz"
upper = "ABCDEFGHIJKLMÑOPQRSTUVWXYZ"
numbers = "0123456789"
symbols = ".%@$"

all = lower + upper + numbers + symbols
lenght = 10
password = "".join(random.sample(all,lenght))

print("Su contraseña nueva es: " +  password)
