```python
import json
import argparse
import sys

def pretty_print_json(json_obj, sort_keys, indent):
    """
    Pretty print JSON with options for sorting keys and indentations
    """
    pretty_json = json.dumps(json_obj, sort_keys=sort_keys, indent=indent)
    print(pretty_json)

def parse_args():
    """
    Parse command line arguments
    """
    parser = argparse.ArgumentParser(description="Pretty-print JSON with options for sorting keys and setting indentation")
    parser.add_argument('input', type=argparse.FileType('r'), nargs='?', default=sys.stdin, help='Input file or stdin')
    parser.add_argument('--sort', action='store_true', help='Sort keys in output')
    parser.add_argument('--indent', type=int, default=4, help='Set indentation')
    return parser.parse_args() 

def main():
    """
    Main function that parses command line arguments and pretty prints the json
    """
    args = parse_args() 
    json_obj = json.load(args.input)
    pretty_print_json(json_obj, args.sort, args.indent)

if __name__ == "__main__":
    main()
```
