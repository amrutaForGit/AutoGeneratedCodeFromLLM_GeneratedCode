```typescript
/**
 * A TypeScript utility function to validate an email.
 * Uses a simple regular expression to check if the email string is valid based on RFC 5322 (Internet Message Format standard) specification.
 * It is not full-proof due to the complexity of the RFC specification, but it should work for most common email formats.
 *
 * @param email - The email string to be validated.
 * @returns A boolean indicating whether the email is valid.
 */
function isValidEmail(email: string): boolean {
    // Defining the email pattern based on RFC 5322 specification.
    // Note: This regex won't catch all possible valid email addresses, but should catch most common cases.
    const pattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
 
    // Check if the email matches the pattern.
    const isValid = pattern.test(email);
    
    return isValid;
}

export default isValidEmail;

// Unit Tests
function testIsValidEmail() {
    // Test with valid emails
    console.assert(
        isValidEmail('example@example.com'),
        '"example@example.com" should be valid'
    );
    console.assert(
        isValidEmail('Example.Example123@example.com'),
        '"Example.Example123@example.com" should be valid'
    );

    // Test with invalid emails
    console.assert(
        !isValidEmail('example@example'),
        '"example@example" should be invalid'
    );
    console.assert(
        !isValidEmail('example@.com'),
        '"example@.com" should be invalid'
    );
}

// Run the tests
testIsValidEmail();
```