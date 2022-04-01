class Person:
  def __init__(self, name, last_name, birth_date):
    self.name = name
    self.last_name = last_name
    self.birth_date = birth_date


p1 = Person("Bob", "Dylan","May 24, 1941")

print(f"Name: { p1.name}")
print(f"Last name: {p1.last_name}" )
print(f"Birth date: {p1.birth_date}")