# CSS Tutorial

CSS tutorial or CSS 3 tutorial provides basic and advanced concepts of CSS technology. Our CSS tutorial is developed for beginners and professionals. The major points of CSS are given below:

CSS stands for Cascading Style Sheet.
CSS is used to design HTML tags.
CSS is a widely used language on the web.
HTML, CSS and JavaScript are used for web designing. It helps the web designers to apply style on HTML tags.
## CSS Example with CSS Editor
In this tutorial, you will get a lot of CSS examples, you can edit and run these examples with our online CSS editor tool.
```
<!DOCTYPE>  
<html>  
<head>  
<style>  
h1{  
color:white;  
background-color:red;  
padding:5px;  
}  
p{  
color:blue;  
}  
</style>  
</head>  
<body>  
<h1>Write Your First CSS Example</h1>  
<p>This is Paragraph.</p>  
</body>  
</html>
```

# What is CSS
CSS stands for Cascading Style Sheets. It is a style sheet language which is used to describe the look and formatting of a document written in markup language. It provides an additional feature to HTML. It is generally used with HTML to change the style of web pages and user interfaces. It can also be used with any kind of XML documents including plain XML, SVG and XUL.

CSS is used along with HTML and JavaScript in most websites to create user interfaces for web applications and user interfaces for many mobile applications.

##What does CSS do
You can add new looks to your old HTML documents.
You can completely change the look of your website with only a few changes in CSS code.
Why use CSS
These are the three major benefits of CSS:

1) Solves a big problem
   Before CSS, tags like font, color, background style, element alignments, border and size had to be repeated on every web page. This was a very long process. For example: If you are developing a large website where fonts and color information are added on every single page, it will be become a long and expensive process. CSS was created to solve this problem. It was a W3C recommendation.
2) Saves a lot of time
   CSS style definitions are saved in external CSS files so it is possible to change the entire website by changing just one file.

3) Provide more attributes
   CSS provides more detailed attributes than plain HTML to define the look and feel of the website.

# CSS Syntax
A CSS rule set contains a selector and a declaration block.


- Selector: Selector indicates the HTML element you want to style. It could be any tag like **_h1_**, _**title**_, etc.

  - Declaration Block: The declaration block can contain one or more declarations separated by a semicolon. For the above example, there are two declarations:
  **color**: _yellow;_
  **font-size**: _11 px_;
  Each declaration contains a property name and value, separated by a colon.

- Property: A Property is a type of attribute of HTML element. It could be color, border etc.

- Value: Values are assigned to CSS properties. In the above example, value "yellow" is assigned to color property.
```
Selector{Property1: value1; Property2: value2; ..........;}  
```

CSS selectors are used to select the content you want to style. Selectors are the part of CSS rule set. CSS selectors select HTML elements according to its id, class, type, attribute etc.

There are several different types of selectors in CSS.

1) CSS Element Selector
2) CSS Id Selector
3) CSS Class Selector
4) CSS Universal Selector
5) CSS Group Selector
#2) CSS Element Selector
   The element selector selects the HTML element by name.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
p{  
    text-align: center;  
    color: blue;  
}   
</style>  
</head>  
<body>  
<p>This style will be applied on every paragraph.</p>  
<p id="para1">Me too!</p>  
<p>And me!</p>  
</body>  
</html>    
```

# 2) CSS Id Selector
   The id selector selects the id attribute of an HTML element to select a specific element. An id is always unique within the page so it is chosen to select a single, unique element.

It is written with the hash character (#), followed by the id of the element.

Let's take an example with the id "para1".
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
#para1 {  
    text-align: center;  
    color: blue;  
}  
</style>  
</head>  
<body>  
<p id="para1">Hello Javatpoint.com</p>  
<p>This paragraph will not be affected.</p>  
</body>  
</html>    
```

# 3) CSS Class Selector
   The class selector selects HTML elements with a specific class attribute. It is used with a period character . (full stop symbol) followed by the class name.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
.center {  
    text-align: center;  
    color: blue;  
}  
</style>  
</head>  
<body>  
<h1 class="center">This heading is blue and center-aligned.</h1>  
<p class="center">This paragraph is blue and center-aligned.</p>   
</body>  
</html>  
```

# CSS Class Selector for specific element
If you want to specify that only one specific HTML element should be affected then you should use the element name with class selector.

Here's  an example.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
p.center {  
    text-align: center;  
    color: blue;  
}  
</style>  
</head>  
<body>  
<h1 class="center">This heading is not affected</h1>  
<p class="center">This paragraph is blue and center-aligned.</p>   
</body>  
</html>   
```

# 4) CSS Universal Selector
The universal selector is used as a wildcard character. It selects all the elements on the pages.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
* {  
   color: green;  
   font-size: 20px;  
}   
</style>  
</head>  
<body>  
<h2>This is heading</h2>  
<p>This style will be applied on every paragraph.</p>  
<p id="para1">Me too!</p>  
<p>And me!</p>  
</body>  
</html>    
```

# 5) CSS Group Selector
   The grouping selector is used to select all the elements with the same style definitions.

Grouping selector is used to minimize the code. Commas are used to separate each selector in grouping.

Let's see the CSS code without group selector.
```
h1 {  
text-align: center;  
color: blue;  
}  
h2 {  
text-align: center;  
color: blue;  
}  
p {  
text-align: center;  
color: blue;  
}  
```
As you can see, you need to define CSS properties for all the elements. It can be grouped in following ways:
```
h1,h2,p {  
text-align: center;  
color: blue;  
}  
```
Let's see the full example of CSS group selector.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
h1, h2, p {  
    text-align: center;  
    color: blue;  
}  
</style>  
</head>  
<body>  
<h1>Hello Javatpoint.com</h1>  
<h2>Hello Javatpoint.com (In smaller font)</h2>  
<p>This is a paragraph.</p>  
</body>  
</html>  
```

As you can see, you need to define CSS properties for all the elements. It can be grouped in following ways:
```
h1,h2,p {  
text-align: center;  
color: blue;  
}  
```
Let's see the full example of CSS group selector.
```
<!DOCTYPE html>  
<html>  
<head>  
<style>  
h1, h2, p {  
    text-align: center;  
    color: blue;  
}  
</style>  
</head>  
<body>  
<h1>Hello Javatpoint.com</h1>  
<h2>Hello Javatpoint.com (In smaller font)</h2>  
<p>This is a paragraph.</p>  
</body>  
</html>  
```
