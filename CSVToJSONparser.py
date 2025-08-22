import csv
import json

def csv_to_json(csv_string):
    """This function converts CSV data to JSON objects"""
    # Split CSV string into lines
    lines = csv_string.splitlines()

    # Create a CSV Reader object
    reader = csv.DictReader(lines)

    # Convert CSV data into list of dictionary
    data = list(reader)

    # Convert list of dictionary into JSON
    json_data = json.dumps(data)

    return json_data