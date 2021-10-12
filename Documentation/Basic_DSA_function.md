#BASIC METHODS

##Array

| METHOD                                                   | DESCRIPTION                                                                                                                                                                                                                                                                                                                   |
| -------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| asList()                                                 | Returns a fixed-size list backed by the specified Arrays                                                                                                                                                                                                                                                                      |
| binarySearch()                                           | Searches for the specified element in the array with the help of the Binary Search Algorithm                                                                                                                                                                                                                                  |
| binarySearch(array, fromIndex, toIndex, key, Comparator) | Searches a range of the specified array for the specified object using the Binary Search Algorithm                                                                                                                                                                                                                            |
| copyOfRange(originalArray, fromIndex, endIndex)          | Copies the specified range of the specified array into a new Arrays.                                                                                                                                                                                                                                                          |
| equals(array1, array2)                                   | Checks if both the arrays are equal or not.                                                                                                                                                                                                                                                                                   |
| fill(originalArray, fillValue)                           | Assigns this fill value to each index of this arrays.                                                                                                                                                                                                                                                                         | sort(originalArray) | Sorts the complete array in ascending order. |
| sort(originalArray, fromIndex, endIndex)                 | Sorts the specified range of array in ascending order.                                                                                                                                                                                                                                                                        |
| toString(originalArray)                                  | It returns a string representation of the contents of this array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function. |

##String

| Method                | Description                                                                                                          | Return Type  |
| --------------------- | -------------------------------------------------------------------------------------------------------------------- | ------------ |
| charAt()              | Returns the character at the specified index (position)                                                              | char         |
| compareTo()           | Compares two strings lexicographically                                                                               | int          |
| compareToIgnoreCase() | Compares two strings lexicographically, ignoring case differences                                                    | int          |
| concat()              | Appends a string to the end of another string                                                                        | String       |
| contains()            | Checks whether a string contains a sequence of characters                                                            | boolean      |
| contentEquals()       | Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer | boolean      |
| copyValueOf()         | Returns a String that represents the characters of the character array                                               | String       |
| endsWith()            | Checks whether a string ends with the specified character(s)                                                         | boolean      |
| equals()              | Compares two strings. Returns true if the strings are equal, and false if not                                        | boolean      |
| equalsIgnoreCase()    | Compares two strings, ignoring case considerations                                                                   | boolean      |
| format()              | Returns a formatted string using the specified locale, format string, and arguments                                  | String       |
| getChars()            | Copies characters from a string to an array of chars                                                                 | void         |
| indexOf()             | Returns the position of the first found occurrence of specified characters in a string                               | int          |
| isEmpty()             | Checks whether a string is empty or not                                                                              | boolean      |
| lastIndexOf()         | Returns the position of the last found occurrence of specified characters in a string                                | int          |
| length()              | Returns the length of a specified string                                                                             | int          |
| matches()             | Searches a string for a match against a regular expression, and returns the matches                                  | boolean      |
| regionMatches()       | Tests if two string regions are equal                                                                                | boolean      |
| replace()             | Searches a string for a specified value, and returns a new string where the specified values are replaced            | String       |
| replaceFirst()        | Replaces the first occurrence of a substring that matches the given regular expression with the given replacement    | String       |
| replaceAll()          | Replaces each substring of this string that matches the given regular expression with the given replacement          | String       |
| split()               | Splits a string into an array of substrings                                                                          | String[]     |
| startsWith()          | Checks whether a string starts with specified characters                                                             | boolean      |
| subSequence()         | Returns a new character sequence that is a subsequence of this sequence                                              | CharSequence |
| substring()           | Returns a new string which is the substring of a specified string                                                    | String       |
| toCharArray()         | Converts this string to a new character array                                                                        | char[]       |
| toLowerCase()         | Converts a string to lower case letters                                                                              | String       |
| toString()            | Returns the value of a String object                                                                                 | String       |
| toUpperCase()         | Converts a string to upper case letters                                                                              | String       |
| trim()                | Removes whitespace from both ends of a string                                                                        | String       |
| valueOf()             | Returns the string representation of the specified value                                                             | String       |