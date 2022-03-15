#Java String class methods
The java.lang.String class provides many useful methods to perform operations on sequence of char values.



###1)	char charAt
(int index). 
It returns char value for the particular index
###2)	int length()	
It returns string length
###3)	Static String format
(String format, Object... args)	
It returns a formatted string.
###4)	Static String format
(Locale l, String format, Object... args)	
It returns formatted string with given locale.
###5)	String substring
(int beginIndex)	
It returns substring for given begin index.
###6)	String substring
(int beginIndex, int endIndex)	
It returns substring for given begin index and end index.
###7)	Boolean contains
(CharSequence s)	It returns true or false after matching the sequence of char value.
###8)	Static String join
(CharSequence delimiter, CharSequence... elements)	It returns a joined string.
###9)	Static String join
(CharSequence delimiter, Iterable<? extends CharSequence> elements)	It returns a joined string.
###10)	Boolean equals
(Object another)	It checks the equality of string with the given object.
###11)	Boolean isEmpty()	
It checks if string is empty.
###12)	String concat
(String str)	It concatenates the specified string.
###13)	String replace
(char old, char new)	It replaces all occurrences of the specified char value.
###14)	String replace
(CharSequence old, CharSequence new)	It replaces all occurrences of the specified CharSequence.
###15)	Static String equalsIgnoreCase
(String another)	It compares another string. It doesn't check case.
###16)	String[] split
(String regex)	It returns a split string matching regex.
###17)	String[] split
(String regex, int limit)	It returns a split string matching regex and limit.
###18)	String intern()	
It returns an interned string.
###19)	int indexOf
(int ch)	It returns the specified char value index.
###20)	int indexOf
(int ch, int fromIndex)	It returns the specified char value index starting with given index.
###21)	int indexOf
(String substring)	It returns the specified substring index.
###22)	int indexOf
(String substring, int fromIndex)	It returns the specified substring index starting with given index.
###23)	String toLowerCase()	
It returns a string in lowercase.
###24)	String toLowerCase
(Locale l)	It returns a string in lowercase using specified locale.

###25)	String toUpperCase()	
It returns a string in uppercase.
###26)	String toUpperCase
(Locale l)	It returns a string in uppercase using specified locale.
###27)	String trim()	
It removes beginning and ending spaces of this string.
###28)	static String valueOf
(int value)	It converts given type into string. It is an overloaded method.
