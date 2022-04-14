# JavaScript
JavaScript is used to create client-side dynamic pages and is an object-based scripting language which is lightweight and cross-platform.

JavaScript is not a compiled language, but it is a translated language. The JavaScript Translator (embedded in the browser) is responsible for translating the JavaScript code for the web browser.

## What is JavaScript
JavaScript (js) is a light-weight object-oriented programming language which is used by several websites for scripting the webpages. It is an interpreted, full-fledged programming language that enables dynamic interactivity on websites when applied to an HTML document. It was introduced in the year 1995 for adding programs to the webpages in the Netscape Navigator browser. Since then, it has been adopted by all other graphical web browsers. With JavaScript, users can build modern web applications to interact directly without reloading the page every time. The traditional website uses js to provide several forms of interactivity and simplicity.

Although, JavaScript has no connectivity with Java programming language. The name was suggested and provided in the times when Java was gaining popularity in the market. In addition to web browsers, databases such as CouchDB and MongoDB uses JavaScript as their scripting and query language.

# Features of JavaScript
There are following features of JavaScript:

1) All popular web browsers support JavaScript as they provide built-in execution environments.
2) JavaScript follows the syntax and structure of the C programming language. Thus, it is a structured programming language.
3) JavaScript is a weakly typed language, where certain types are implicitly cast (depending on the operation).
4) JavaScript is an object-oriented programming language that uses prototypes rather than using classes for inheritance.
5) It is a light-weighted and interpreted language.
It is a case-sensitive language.
6) JavaScript is supportable in several operating systems including, Windows, macOS, etc.
7) It provides good control to the users over the web browsers.

Although, JavaScript has no connectivity with Java programming language. The name was suggested and provided in the times when Java was gaining popularity in the market. In addition to web browsers, databases such as CouchDB and MongoDB uses JavaScript as their scripting and query language.

#Application of JavaScript
JavaScript is used to create interactive websites. It is mainly used for:

- Client-side validation,
- Dynamic drop-down menus,
- Displaying date and time,
- Displaying pop-up windows and dialog boxes (like an alert dialog box, confirm dialog box and prompt dialog box),
- Displaying clocks etc.

# JavaScript Example
```
<script>  
document.write("Hello JavaScript by JavaScript");  
</script>
```

JavaScript provides 3 places to put the JavaScript code: within body tag, within head tag and external JavaScript file.

```
<script type="text/javascript">  
document.write("JavaScript is a simple language for javatpoint learners");  
</script>
```
The script tag specifies that we are using JavaScript.

The text/javascript is the content type that provides information to the browser about the data.

The document.write() function is used to display dynamic content through JavaScript. We will learn about document object in detail later.

## 3 Places to put JavaScript code
1) Between the body tag of html
2) Between the head tag of html
3) In .js file (external javaScript)

# 1) JavaScript Example : code between the body tag
   In the above example, we have displayed the dynamic content using JavaScript. Let’s see the simple example of JavaScript that displays alert dialog box.
```
<script type="text/javascript">  
 alert("Hello Javatpoint");  
</script>
```

## 2) JavaScript Example : code between the head tag
   Let’s see the same example of displaying alert dialog box of JavaScript that is contained inside the head tag.

In this example, we are creating a function msg(). To create function in JavaScript, you need to write function with function_name as given below.

To call function, you need to work on event. Here we are using onclick event to call msg() function.
```
<html>  
<head>  
<script type="text/javascript">  
function msg(){  
 alert("Hello Javatpoint");  
}  
</script>  
</head>  
<body>  
<p>Welcome to JavaScript</p>  
<form>  
<input type="button" value="click" onclick="msg()"/>  
</form>  
</body>  
</html>  
```

