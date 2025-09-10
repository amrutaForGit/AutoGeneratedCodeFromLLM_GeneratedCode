```python
# Import required libraries
import argparse
from datetime import datetime, timedelta
import os

def clean_log_file(days, input_file):
    
    # Get timestampt N days back
    cut_off_date = datetime.now() - timedelta(days=days)
    
    # Check if file exists
    if not os.path.isfile(input_file):
        print("Input log file does not exist.")
        return

    # Temporary file to write data to
    output_temp = f'{input_file}.tmp'

    # Open both input and temp files
    with open(input_file, 'r') as f_in, open(output_temp, 'w') as f_out:
        for line in f_in:
            # Get timestamp from log line
            line_timestamp = datetime.strptime(line[:19], "%Y-%m-%d %H:%M:%S")
            
            # If line timestamp is later than cut off, write it into temp file
            if line_timestamp > cut_off_date:
                f_out.write(line)

    # Remove the original log file
    os.remove(input_file)
    
    # Rename the temp log file
    os.rename(output_temp, input_file)


def main():
    parser = argparse.ArgumentParser(description="Script removes lines older than N days from a log file.")
    parser.add_argument('--days', required=True, type=int, help='Number of days')
    parser.add_argument('--input', required=True, help='Input file path')
    args = parser.parse_args()

    clean_log_file(args.days, args.input)


if __name__ == '__main__':
    main()
```