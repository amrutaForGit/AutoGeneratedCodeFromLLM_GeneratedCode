```python
# import necessary modules
import argparse
from datetime import datetime, timedelta
import os

def parse_args():
    """
    Parses arguments from command line.
    """
    parser = argparse.ArgumentParser(description='Cleans log file.')
    parser.add_argument('--days', type=int, help='Age of the lines to be removed.')
    parser.add_argument('--input', type=str, help='Path to the log file to clean.')

    return parser.parse_args()


def remove_old_lines_from_file(path, days):
    """
    Removes lines older than `days` from a file at `path`.
    """

    # Get current date
    current_time = datetime.now()

    # Read file lines into list
    with open(path, 'r') as f:
        lines = f.readlines()

    # Get lines younger than `days`
    cleaned_lines = [line for line in lines if (current_time - datetime.strptime(line.split(' - ')[0], '%Y-%m-%d %H:%M:%S,%f')) < timedelta(days=days)]
 
    # Write the cleaned lines
    with open(path, 'w') as f:
        f.writelines(cleaned_lines)

if __name__ == '__main__':
    args = parse_args()
    remove_old_lines_from_file(args.input, args.days)
```