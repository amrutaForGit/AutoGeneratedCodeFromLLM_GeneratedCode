import json

def is_valid_json(input_string):
    """
    Function to check if a given string is a valid JSON
    :param input_string: string to check
    :return: True if string is valid JSON, False otherwise
    """
    try:
        json.loads(input_string)
        return True
    except Exception as e:
        return False


# Testing the function with some examples
if __name__ == "__main__":
    json_string = '{"key": "value"}'
    non_json_string = "this is a non-json string"

    print(is_valid_json(json_string))  # Should print: True
    print(is_valid_json(non_json_string))  # Should print: False