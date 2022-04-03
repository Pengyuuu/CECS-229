import time

TABLESIZE = 9

class Character:
	# constructor! Do not touch
	def __init__(self, fn, ln):
		self.firstName = fn
		self.lastName = ln


	# function key()
	# should return the proper index to place the specific Character
	# into the hash table
	# Use the first letter of the last name and modulus to find the proper index
	def key(self):
		# for now, returns the ascii value of first letter of last name
		return ord(self.lastName[0])%9 


	# the details of the specific character when you print it
	def __str__(self):
		string = "Last name: " + self.lastName
		string += "\nFirst name: " + self.firstName
		string += "\nHash Table Key: " + str(self.key())
		return string


	def getLastName(self):
		return self.lastName





'''
MAIN FUNCTION STARTS HERE!
'''
hashtable = [None] * TABLESIZE #empty hashtable

# use this to test part 2!!! If it works, comment or delete
s1 = Character("Anakin", "Skywalker")
print(s1)