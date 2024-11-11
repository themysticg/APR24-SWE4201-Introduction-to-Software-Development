# Python Structure Display
# This program displays examples of different Python structures.

def display_list():
    """
    Displays a sample list with example data.
    """
    sample_list = ["meat", "diary", "gluten", "peanuts"]
    print("List Example of Allergies:")
    print(f"Elements: {sample_list}")
    print(f"Access by index (2nd element): {sample_list[1]}")
    print(f"Append an item: {sample_list + ['elderberry']}")
    print("Length of list:", len(sample_list))
    print("-" * 30)

def display_dictionary():
    """
    Displays a sample dictionary with example data.
    """
    sample_dict = {
        "name": "Jose",
        "age": 37,
        "city": "Portugal"
    }
    print("Dictionary Example:")
    print(f"Elements: {sample_dict}")
    print(f"Access by key ('name'): {sample_dict['name']}")
    print("Add a new item ('country': 'PT'):", {**sample_dict, "country": "PT"})
    print("Keys:", list(sample_dict.keys()))
    print("Values:", list(sample_dict.values()))
    print("-" * 30)

def display_tuple():
    """
    Displays a sample tuple with example data.
    """
    sample_tuple = ("car", "bike", "boat", "plane")
    print("Tuple Example:")
    print(f"Elements: {sample_tuple}")
    print(f"Access by index (1st element): {sample_tuple[0]}")
    print("Count occurrences of 'car':", sample_tuple.count("car"))
    print("Index of 'boat':", sample_tuple.index("boat"))
    print("-" * 30)

def main():
    """
    Main function to display Python data structures.
    """
    print("Python Structure Display\n")
    
    # Display each structure
    display_list()
    display_dictionary()
    display_tuple()
    
    print("End of structure display.")

# Run the program
if __name__ == "__main__":
    main()
