```python
import json

def is_valid_json(json_string):
    """
    This function checks if a string is valid JSON.

    Parameters:
    json_string (str): A string to check.

    Returns:
    bool: True if the string is valid JSON, False otherwise.
    """
    try:
        # Attempt to load the string as JSON
        json.loads(json_string)
    except ValueError as e:
        # If a ValueError occurs, the string isn't valid JSON
        return False
    return True
```