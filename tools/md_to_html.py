```python
import os
import sys
try:
    import markdown
except ImportError:
    markdown = None

def md_to_html(md_file):
    """
    This function reads a markdown file and converts it to HTML.
    """
    with open(md_file, 'r') as f:
        md_content = f.read()

    if markdown is not None:
        # Use the markdown library if available
        html = markdown.markdown(md_content)
    else:
        # Fallback to basic replacements
        html = md_content.replace('#', '<h1>').replace('**', '<b>').replace('*', '<i>')

    return html

def main():
    """
    This is the main function, it will ask for the Markdown file path from the user or on standard input.
    """
    if len(sys.argv) < 2:
        print('Please provide a markdown file path.')
        sys.exit(1)
    else:
        md_file = sys.argv[1]
        if not os.path.isfile(md_file):
            print('Given markdown file does not exist.')
            sys.exit(1)
        else:
            print(md_to_html(md_file))

if __name__ == '__main__':
    main()
```
