What is an API?
An API stands for Application Program Interface. It is a set of instructions, protocols, and tools for building software applications. It specifies how software components should interact.

The API Gateway is a server. It is a single entry point into a system. API Gateway encapsulates the internal system architecture. It provides an API that is tailored to each client. It also has other responsibilities such as authentication, monitoring, load balancing, caching, request shaping and management, and static response handling.

API Gateway is also responsible for request routing, composition, and protocol translation. All the requests made by the client go through the API Gateway. After that, the API Gateway routes requests to the appropriate microservice.

The API Gateway handles the request in one of the two ways:



It routed or proxied the requests to the appropriate service.
Fanning out (spread) a request to multiple services.
The API Gateway can provide each client with a custom API. It also translates between two protocols, such as HTTP, WebSockets, and Web-Unfriendly protocols that are used internally.

Example

The popular example of API Gateway is Netflix API Gateway. The Netflix streaming services are available on hundreds of different kinds of devices such as televisions, set-top boxes, smartphones, tablets, etc. It attempts to provide a one-size-fits-all API for its streaming service.

An API Gateway includes:

- Security
- Caching
- API composition and processing
- Managing access quotas
- API health monitoring
- Versioning
- Routing

# Advantages of API Gateway
- The most important advantage of API Gateway is that it encapsulates the internal structure of the application.
- Rather than invoking the specific service, the client directly talks to the API Gateway.
- It reduces the number of round trips between client and application.
- It simplifies the client code.
- It reduces coding efforts, makes the application more efficient, decreases errors all at the same time.
- It provides each kind of client with a specific API.
# Disadvantages
- It requires routing rules.
- There is a possibility of a single point of failure.
- Risk of complexity due to all the API rules are in one place.
# Working of API Gateway
In microservices, we route all the requests through an API. We can implement common features like authentication, routing, rate limiting, auditing, and logging in the API Gateway.