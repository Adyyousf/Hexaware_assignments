class Counter:
    def __init__(self):
        self.counter = int(input("Enter the value of Counter:: "))
    
    def increase_one(self):
        self.counter += 1
        
    def decrease_one(self):
        self.counter -= 1
    
    def get_value(self):
        return self.counter

obj = Counter()

print(obj.get_value())
obj.increase_one()
print(obj.get_value())
obj.decrease_one()
print(obj.get_value())