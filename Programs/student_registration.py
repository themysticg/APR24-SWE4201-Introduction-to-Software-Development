import time
import sys

# Student Registration System
# This program allows users to add, retrieve, and manage student information.

# Dictionary to store student details
students = {}

def loading_bar(duration=5):
    """
    Displays a loading bar that completes in the specified duration.
    """
    bar_length = 20  # Number of steps in the loading bar
    for i in range(bar_length + 1):
        time.sleep(duration / bar_length)
        percent = int((i / bar_length) * 100)
        bar = '#' * i + '-' * (bar_length - i)
        sys.stdout.write(f"\r[{bar}] {percent}%")
        sys.stdout.flush()
    print()  # Move to the next line after loading is done

def add_student():
    """
    Adds a new student to the registration system.
    """
    try:
        student_id = input("Enter Student ID: ").strip()
        if not student_id or student_id in students:
            raise ValueError("Invalid ID or ID already exists.")

        name = input("Enter Student Name: ").strip()
        if not name:
            raise ValueError("Name cannot be empty.")

        course = input("Enter Course: ").strip()
        if not course:
            raise ValueError("Course cannot be empty.")

        # Display loading bar for adding student data
        print("Adding student data, please wait...")
        loading_bar()

        # Store student details in the dictionary
        students[student_id] = {"Name": name, "Course": course}
        print(f"Student {name} has been successfully added!")

    except ValueError as ve:
        print(f"Error: {ve}")

def retrieve_student():
    """
    Retrieves information about a student by their ID.
    """
    student_id = input("Enter Student ID to retrieve information: ").strip()

    # Display loading bar for retrieving student data
    print("Retrieving information, please wait...")
    loading_bar()

    if student_id in students:
        print("Student Details:")
        print(f"- ID: {student_id}")
        print(f"- Name: {students[student_id]['Name']}")
        print(f"- Course: {students[student_id]['Course']}")
    else:
        print("Error: Student ID not found.")

def main():
    """
    Main function to run the Student Registration System.
    """
    print("Welcome to the Student Registration System")
    while True:
        print("\nOptions:")
        print("1. Add a New Student")
        print("2. Retrieve Student Information")
        print("3. Exit")
        
        choice = input("Choose an option: ").strip()
        
        if choice == "1":
            add_student()
        elif choice == "2":
            retrieve_student()
        elif choice == "3":
            print("Exiting the system. Goodbye!")
            break
        else:
            print("Invalid option. Please choose again.")

# Run the program
if __name__ == "__main__":
    main()
