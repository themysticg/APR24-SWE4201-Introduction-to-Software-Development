def pattern_a():
    print("Pattern (a):")
    for i in range(1, 11):  # Rows from 1 to 10
        print('*' * i)

def pattern_b():
    print("\nPattern (b):")
    for i in range(10, 0, -1):  # Rows from 10 to 1
        print('*' * i)

def pattern_c():
    print("\nPattern (c):")
    rows = 6  # Number of rows
    for i in range(rows):
        # Print spaces for centering
        print(' ' * (rows - i - 1), end='')
        # Print stars
        print('* ' * (i + 1))

# Main function to display all patterns
def main():
    pattern_a()
    pattern_b()
    pattern_c()

if __name__ == "__main__":
    main()
