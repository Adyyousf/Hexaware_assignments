from datetime import date
from datetime import time
from  datetime import datetime

todaysdate= datetime.today()

print(f"Today is: {todaysdate.strftime('%m-%d-%y')}")