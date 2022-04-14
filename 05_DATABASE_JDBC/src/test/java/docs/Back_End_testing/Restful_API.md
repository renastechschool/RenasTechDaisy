# RESTful API

A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data. That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources.

An API for a website is code that allows two software programs to communicate with each other. The API spells out the proper way for a developer to write a program requesting services from an operating system or other application.

A RESTful API -- also referred to as a RESTful web service or REST API -- is based on representational state transfer (REST), which is an architectural style and approach to communications often used in web services development.

REST technology is generally preferred over other similar technologies. This tends to be the case because REST uses less bandwidth, making it more suitable for efficient internet usage. RESTful APIs can also be built with programming languages such as JavaScript or Python.

The REST used by browsers can be thought of as the language of the internet. With cloud use on the rise, APIs are being used by cloud consumers to expose and organize access to web services. REST is a logical choice for building APIs that allow users to connect to, manage and interact with cloud services flexibly in a distributed environment. RESTful APIs are used by such sites as Amazon, Google, LinkedIn and Twitter.

# How RESTful APIs work
A RESTful API breaks down a transaction to create a series of small modules. Each module addresses an underlying part of the transaction. This modularity provides developers with a lot of flexibility, but it can be challenging for developers to design their REST API from scratch. Currently, several companies provide models for developers to use; the models provided by Amazon S3, Cloud Data Management Interface (CDMI) and OpenStack Swift are the most popular.

A RESTful API uses commands to obtain resources. The state of a resource at any given timestamp is called a resource representation. A RESTful API uses existing HTTP methodologies defined by the RFC 2616 protocol, such as:

- GET to retrieve a resource;
- PUT to change the state of or update a resource, which can be an object, file or block;
- POST to create that resource; and
- DELETE to remove it.
With REST, networked components are a resource the user requests access to -- like a black box whose implementation details are unclear. All calls are stateless; nothing can be retained by the RESTful service between executions.

Data formats the REST API supports include:

- application/json
- application/xml
- application/x-wbe+xml
- application/x-www-form-urlencoded
- multipart/form-data

# Uses
Because the calls are stateless, REST is useful in cloud applications. Stateless components can be freely redeployed if something fails, and they can scale to accommodate load changes. This is because any request can be directed to any instance of a component; there can be nothing saved that has to be remembered by the next transaction. That makes REST preferable for web use. The RESTful model is also helpful in cloud services because binding to a service through an API is a matter of controlling how the URL is decoded. Cloud computing and microservices are almost certain to make RESTful API design the rule in the future.


# RESTful API Design and Architecture Constraints
RESTful API design was defined by Dr. Roy Fielding in his 2000 doctorate dissertation. In order to be a true RESTful API, a web service must adhere to the following six REST architectural constraints:

- Use of a uniform interface (UI). Resources should be uniquely identifiable through a single URL, and only by using the underlying methods of the network protocol, such as DELETE, PUT and GET with HTTP, should it be possible to manipulate a resource.
- Client-server based. There should be a clear delineation between the client and server. UI and request-gathering concerns are the client's domain. Data access, workload management and security are the server's domain. This loose coupling of the client and server enables each to be developed and enhanced independent of the other.
- Stateless operations. All client-server operations should be stateless, and any state management that is required should take place on the client, not the server.
- RESTful resource caching. All resources should allow caching unless explicitly indicated that caching is not possible.
- Layered system. REST allows for an architecture composed of multiple layers of servers.
- Code on demand. Most of the time, a server will send back static representations of resources in the form of XML or JSON. However, when necessary, servers can send executable code to the client.
##Common REST API challenges
Besides the design and architecture constraints, individuals will have to confront some challenges with REST APIs. Some concepts which may be challenging can include:

- Endpoint consistency -- paths of endpoints should be consistent by following common web standards, which may be difficult to manage.
- API versioning -- endpoint URLs shouldn't be invalidated when used internally or with other applications.
- Long response times and too much data -- the amount of returned resources can increase in size in time, adding to increased load and response times.
- Navigation paths and user input locations -- because REST uses URL paths for input parameters, determining URL spaces can be challenging.
- Security -- which has a lot of aspects to keep an eye on, including the use of:
  - HTTPS;
  - blocking access from unknown IP addresses and domains;
  - validating URLs;
  - blocking unexpectedly large payloads;
  - logging requests; and
  - investigating failures.
- Authentication -- use common authentication methods such as HTTP basic authentication (which allows for a base64-encoded username:password string), API keys, JSON Web Tokens and other access tokens. OAuth 2.0, for example, is good for access control.
- Requests and data -- requests may have more data and metadata than needed or more requests may be needed to obtain all the data. APIs can be adjusted for this.
- API testing -- can be a long process to set up and run. Each part of the process can be either long or challenging. Testing can also be done in the command line with the utility Curl. Parts of the testing process that may be challenging include:
  - Initial setup
  - Schema updates
  - Test parameter combinations
  - Sequence API calls
  - Validate test parameters
  - System integration
- Define error codes and messages.
  - With error codes, it is more of a common practice to use standard HTTP error codes. These are recognized by clients and developers more often.
  - Error handling may not have a way to distinguish if a response is successful or not besides parsing the body or checking for an error.