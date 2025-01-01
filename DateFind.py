from datetime import datetime

def get_day_from_date():
    try:
        # Ask the user for input
        date_input = input("Enter a date in YYYY-MM-DD format: ")
        
        # Parse the input date
        date_object = datetime.strptime(date_input, "%Y-%m-%d")
        
        # Get the day of the week
        day_of_week = date_object.strftime("%A")
        
        print(f"The day on {date_input} is {day_of_week}.")
    except ValueError:
        print("Invalid date format. Please enter the date in YYYY-MM-DD format.")

def calculate_age():
    try:
        # Ask the user for their birth date
        birth_date_input = input("Enter your birth date in YYYY-MM-DD format: ")
        
        # Parse the input birth date
        birth_date = datetime.strptime(birth_date_input, "%Y-%m-%d")
        
        # Get today's date
        today = datetime.today()
        
        # Calculate the age
        age = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        
        print(f"Your age is {age} years.")
    except ValueError:
        print("Invalid date format. Please enter the date in YYYY-MM-DD format.")

# Call the functions
get_day_from_date()
calculate_age()