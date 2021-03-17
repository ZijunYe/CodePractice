###### LeetCode Notes


1. `Length vs length()`
	⁃	length can be used for int[] , double [] , String[]  —> to know the length of arrays 
	⁃	length() can be used for String, StringBuilder —> related objects to know the length of String 
	
2. `StringBuffer & StringBuilder`
 StringBuilder at the end has to use .toString() method to print out 
Since String is unmodified, so when rewrite the the string, java creates a new string and pointing to new string, and abandon the old one 
