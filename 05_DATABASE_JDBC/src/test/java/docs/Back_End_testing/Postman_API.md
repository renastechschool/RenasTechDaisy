# Postman API

Postman is one of the most popular software testing tools which is used for API testing. With the help of this tool, developers can easily create, test, share, and document APIs.

# Intro to Postman
- Postman is a standalone software testing API (Application Programming Interface) platform to build, test, design, modify, and document APIs. It is a simple Graphic User Interface for sending and viewing HTTP requests and responses.
- While using Postman, for testing purposes, one doesn't need to write any HTTP client network code. Instead, we build test suites called collections and let Postman interact with the API.
- In this tool, nearly any functionality that any developer may need is embedded. This tool has the ability to make various types of HTTP requests like GET, POST, PUT, PATCH, and convert the API to code for languages like JavaScript and Python.
# Terminologies Related to Postman

## API
Application Programming Interface (API) is software that acts as an intermediary for two apps to communicate with each other. We use APIs whenever we use an application like Twitter, Facebook, sending text messages, or checking the weather over the phone.

## HTTP

HTTP (Hypertext Transfer Protocol) is the collection of rules for the transmission of data on the World Wide Web, like graphic images, text, video, sound, and other multimedia data. The Web users implicitly make use of HTTP as soon as they open their Web browser.

Example: A user or browser enters the HTTP request to the server; the server then returns the user response. This response includes the request status information and may consist of the requested material as well.

The most commonly used HTTP methods are GET, POST, PUT, PATCH, HEAD, DELETE, and OPTIONS.

# Why use Postman?
Postman is based on a wide range of extremely user-friendly power tools. For more than 8 million users, Postman has become a tool of convenience. Following are the reasons why Postman is used:

- Accessibility- One can use it anywhere after installing Postman into the device by simply logging in to the account.
- Use Collections-Postman allows users to build collections for their API-calls. Every set can create multiple requests and subfolders. It will help to organize the test suites.
- Test development- To test checkpoints, verification of successful HTTP response status shall be added to every API- calls.
- Automation Testing-Tests can be performed in several repetitions or iterations by using the Collection Runner or Newman, which saves time for repeated tests.
- Creating Environments- The design of multiple environments results in less replication of tests as one can use the same collection but for a different setting.
- Debugging- To effectively debug the tests, the postman console helps to track what data is being retrieved.
- Collaboration- You can import or export collections and environments to enhance the sharing of files. You may also use a direct connection to share the collections.
- Continuous integration-It can support continuous integration.


# Prerequisites
Before proceeding with this tutorial, you should have a basic knowledge of API, automation, and manual testing.

# Audience
This tutorial is created for those who would like to learn the basics of Postman. As the number of web and mobile applications is increasing, the importance of API testing is also growing. So this tutorial will help you to learn postman testing for testing APIs.

You will get a basic level of understanding of Postman and API testing. This tutorial will also give you a good understanding of how to use Postman to execute APIs for any given URL for your daily work.

# Postman Sending Your First Request
Sending a request is as easy as posting a URL into your web browser. We can easily send requests to APIs in Postman. An API request helps you to access, or send, data from a data source.

To send the API request, we need an HTTP
method. Some commonly used methods are POST, GET, DELETE, PUT, and PATCH.

**GET**: This HTTP
method is used to access the data from an API.

**POST**: This method transmits new data.

**DELETE**: This is used to remove or delete the existing data.

**PATCH**: This method is used to update the existing data.

**PUT**: This method is used to update the existing data.

Without any terminal or code, we can make API
requests and review the answers with the help of postman
. Just build a new request and select the send button, you'll get the API response.

# Creating the First Collection
Collection in Postman means a group of API requests that you have already saved in the Postman. You can arrange these requests into folders.

## Steps to Create the First Collection
- Enter the new request in the Request URL option, which is present in the Builder section.
- Click on the Save button, and then a new window will open.
- You can change the Request name, or by default, Request URL will be displayed as the Request name.
- You can also write the Request description as an optional step.
- Now go to **create a collection** option and write a name to your collection. I have named it First Collection, as you can see in the image above.
- Save your collection by clicking on the Save button.
- Now, after saving, you can see your collection in the sidebar under the Collection tab, as shown in the image below.
- Within a collection, any number of requests can be added.


# Creating Requests
Let's create a new request in Postman. In the request, we can have many details. And during this request creation process, you have to enter a URL and select the method. Other than you can optionally specify the number of additional information.

To create a request, follow the following steps:

Step 1: Launch the Postman.

Step 2: Click on New option from the top left corner of the Postman homepage window. Once you click on the button, a drop-down menu will open.

Step 3: Click on the Request option from the drop-down list.

Step 4: Once you select the Request option, you will be prompted to enter the request name, and you can also describe that API for future use. The description section is optional; we can leave it blank.

Step 5: Scroll down and click on + Create Collection.

Step 6: Click on the Save button to create your request.

Once you click on the save button, a new tab will open with your given request name.

Step 7: Enter a website, ie (www.amazon.com) in the address bar and click on Send and wait for a response.
