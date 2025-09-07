```python
import csv
import json
import sys
import argparse


# validate arguments
def validate_args(args):
    if args.csvfile is None:
        raise ValueError("The CSV file path must be specified.")

    if not args.csvfile.endswith('.csv'):
        raise ValueError("The input file should have a .csv extension.")


# parse CSV file and convert to JSON
def csv_to_json(csv_file, indent):
    json_data = []

    with open(csv_file, 'r') as file:
        reader = csv.DictReader(file)
        for line in reader:
            json_data.append(dict(line))

    print(json.dumps(json_data, indent=indent))


def main():
    # setup argument parser
    parser = argparse.ArgumentParser(description='Convert a CSV file to JSON')
    parser.add_argument('-c', '--csvfile', type=str, help='path to the CSV file')
    parser.add_argument('-i', '--indent', type=int, default=None, 
                        help='number of spaces for JSON indentation')
    args = parser.parse_args()

    validate_args(args)

    csv_to_json(args.csvfile, args.indent)


if __name__ == "__main__":
    sys.exit(main()) # use sys.exit to allow for error codes in the future
```
