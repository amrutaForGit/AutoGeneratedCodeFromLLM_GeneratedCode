```python
import argparse
import csv
import json
import sys


def csv_to_json(csv_filepath, indent):
    # Try opening the CSV file
    try:
        with open(csv_filepath, 'r') as csv_file:
            # Use the csv library to read data from the CSV file
            reader = csv.DictReader(csv_file)
            row_list = list(reader)

            # Convert the row data into JSON format
            json_output = json.dumps(row_list, indent=indent)

            # Print to stdout
            print(json_output)

    except FileNotFoundError:
        # file not found error handling
        print(f"No such file or directory: '{csv_filepath}'", file=sys.stderr)
        sys.exit(1)
    except Exception as e:
        # general error handling
        print(f"Unexpected error: {str(e)}", file=sys.stderr)
        sys.exit(1)


def main():
    # Instantiate the parser
    parser = argparse.ArgumentParser(description='CSV to JSON converter')

    # Required positional argument
    parser.add_argument('csv_filepath', type=str, help='CSV file path')

    # Optional argument
    parser.add_argument('--indent', type=int, help='json output indent', default=None)

    # Parsing command-line arguments
    args = parser.parse_args()

    # Call csv_to_json function
    csv_to_json(args.csv_filepath, args.indent)


# Check if the script is running directly
if __name__ == "__main__":
    main()
```