# Front End

Front End Testing verifies the user-facing interface of a software application. It requires knowledge about requirements related to user experience, but not about the database and the back-end mechanics. Back End Testing checks the efficacy of the functionality on the server and database side of the software

# What is Front End Testing?
To start with, the front end is any part of a software application that a user interacts with. Essentially, it is all aspects of software visible to clients. This usually includes GUI elements such as menus, buttons, forms – anything end-users can see when navigating the application. It can also include aspects like page load speed – factors contributing to overall user experience.

Front End Testing validates that said GUI elements are functioning as expected. For example, it checks if input fields accept the right characters, if forms are being submitted only after the required fields are filled, if navigation is easy enough, if the page is loading fast enough, etc.

The goal of Front End Testing is to test functionalities and verify that a website or app’s presentation layer is bug or error-free. This has to be done after every single update to ensure recent changes have not degraded any aspect of the UI.

# Why do you need Front End Testing?
##Identifying Performance Issues 
Web applications possess three functional layers – clients, servers, resources (or information systems). Front End Testing handles the client layer AKA the part of software presented to the client.
It isn’t uncommon for devs to focus on the server and resources layers, as they are the foundation on which the software is built. However, Front End testing is essential for QA teams to analyze software behavior from end users’ perspectives. It is necessary to detect client-side performance issues that may sabotage critical workflows and contribute to undesirable user experiences.


##Verifying cross-browser and cross-device functionality
A significant aspect of Front End testing is verifying website and app behavior on multiple browsers, browser versions, and devices (mobile and desktop). This includes not just features but responsiveness on screens of various sizes and resolutions.

Regular software updates, browser updates, and new device releases can lead to gaps in compatibility, which is where Front End testing comes in. A website or app must be tested on multiple browser-device-OS.
The only way to ensure this is to perform comprehensive cross browser testing across real browsers and devices. Testers need to check how the software renders and operates in real user conditions, for which they need to test on multiple unique browser-device-OS combinations.

To do so, QAs must run Front End tests on real browsers, devices, and operating systems.  The software will have to render perfectly on each device, browser, and browser version, considering their technical variances and idiosyncrasies. Given that there are at least 63,000 possible browser-platform-device combinations in popular usage, QA teams need access to a massive on-premise device lab (constantly updated with newer devices) to perform satisfactory cross browser compatibility testing.

##Verifying integration of Third-Party Services 
With Software as a Service platform becoming almost commonplace, most applications leverage third-party integrations to offer better services and heightened user experiences. However, faulty integrations are often a major cause of software malfunction or, at least, unsatisfactory user journeys of some kind.
To prevent some damaged user experiences, Front End tests are mandatory. All third-party integrations must be tested (across browsers, devices, and platforms) to ensure that they function seamlessly and within accepted standards.

# Types of Front End Testing
## Unit Testing
A unit test verifies the functionality of the smallest possible module or “unit” of an application, independently from other modules. In this case, testers and/or developers isolate the smallest application components, check their behavior and identify defects early on in the development pipeline.

For example, in C#, consider a method as a unit (smallest component to be tested). In this case, the unit test would verify some features of the method in isolation from other methods i.e. the software at large. Unit Tests are usually categorized as state-based and interaction-based testing. The former checks to see if the software is producing expected results under specific conditions. The latter verifies if the software properly calls particular methods to accomplish its purpose.

# Visual Regression Testing
Regression Testing is used to verify that any system changes do not interfere with existing features and/or code structure. There’s a reason regression tests are part of almost every test suite in software development. It is common for devs to change or add a section of code, and having it unintentionally disrupt something that was previously working just fine.

#Cross Browser Testing
As explained above, cross browser testing allows testers to check if a website works as expected when accessed via different browser-device-OS combinations. This applies to different versions of the same browser and assistive tools.

Apps must be tested on different device-OS combinations. Among other things, testing responsive design is a key aspect of cross browser and cross device testing. Testers can use BrowserStack’s free responsive design checker to check their software’s appearance on the latest real devices.

Visual Regression Testing applies the same logic but confines testing to the visual aspects of the software. In other words, it checks that code changes do not break any aspect of the software’s visual interface. A visual regression test checks what the user will see after any code changes have been executed by comparing screenshots taken before and after code changes. This is why visual regression tests are also sometimes called visual snapshot tests.

# Integration Testing
Integration testing verifies the interface between two software units or modules. It focuses on checking if modules are communicating adequately and exposes any errors between integrated units. Integration tests are essential to analyzing the behavior of systems comprising multiple, connected elements. Unit tests are generally followed by integration tests.

Since most contemporary software depends greatly on numerous microservices working in tandem, integration testing also validates the interaction between these services to ensure smooth inter dependability and functioning. Primarily, integration testing checks that the application interface and API communicate smoothly to exchange data required for optimal performance.

# Accessibility Testing 
Accessibility Testing is a software testing technique that checks if a website or app is easily usable by every user on the internet, including individuals with disabilities or special needs. Often considered a sub-category of usability testing, it ensures that specific, unchangeable conditions do not prevent a person from accessing online resources as easily as anyone else.You can run both automated and manual accessibility testing on BrowserStack.

# Acceptance Testing
Acceptance testing determines if a software system meets all predetermined specifications. It evaluates if the system complies with business, technical, and aesthetic requirements so that business stakeholders and end-users can be satisfied alike.

Acceptance tests are generally divided into – User Acceptance Testing and Business Acceptance Testing. The former checks to ensure that the product is meeting all performance standards from users’ perspective while the latter establishes that the software aligns with business goals and requirements.

# Challenges of Front End Testing
##Consistently Evolving UI: 
In the modern software space, core libraries, and third-party components have to be upgraded every few months. Upgrading one library requires commensurate changes to all other necessary components. With every single upgrade, all components need to be retested, including automation tools and testing tools. Latest APIs and functionalities must also be integrated, built, and handled within increasingly short timelines.
## Constantly Changing User Preferences: 
With new devices, browser, and operating system versions being introduced every few months, user demands and preferences keep changing. For example, the pandemic caused an explosive increase in users’ demand/desire for video conferencing and streaming. These newer user demands must be identified and implemented without considerable delay.Of course, every time newer features are added, new tests need to be created and executed. One also has to keep testing existing aspects like website load speed (have new features slowed down the page?) or visual appeal (has the new button covered up the existing menu?) In essence, the developers’ and testers’ work on a specific software never really ends.

## Choosing the right Automation Tool: 
Effecting, periodic front-end testing requires automation. Manual testers cannot be expected to keep running tests every time an upgrade is pushed. However, choosing an automation tool that can be effectively set up and empowered with test scripts to run requisite checks and verifications. However, with the plethora of automation testing tools available, it can be somewhat challenging to select what would work best for your team, given their skillsets and project requirements. It will require dedicated research, which would be an investment of time and effort.
## Detecting cross browser and cross device issues: 
With thousands of browser versions and devices used across the world to access the internet, testers have to cover a massive range to equip a site or app for real-world usage. This can be challenging since new devices and browser versions are constantly being released. To keep up, teams need access to real browsers and devices. An in-house device lab takes significant financial and human resources to set up, maintain and upgrade. 

##Front End Testing Best Practices
Start with the testing pyramid: For testers and teams just starting out with Front End testing, it’s a good idea to use the testing pyramid as a blueprint. That means: start running unit tests, then move on to integration testing, and finally, execute end to end testing. Once this structure is in place, it will be relatively easy to achieve reasonably high test coverage.

Dive deeper into the testing pipeline, and add more kinds of tests once the pyramid comes into action. Once unit tests, integration tests, and end-to-end tests are completed, it will be easier to expand the testing scope and include things like acceptance testing, visual testing, etc.

### Use real browsers and devices: 
As mentioned previously multiple times, real browsers and devices are essential to conducting error-free, reliable Front End tests. Don’t bother with emulators and simulators. Go straight to the real thing, save time, effort and get results that can be counted on.
### Decide the Front End elements to be prioritized: 
Front End testing requires the analysis and verification of hundreds, sometimes thousands of UI elements as well as functional elements. The former includes things like formatting, CSS, text, graphics, while the latter comprises forms, links, buttons, etc.

### Choose the right Front End testing tools: 
Outside of providing real browsers and devices for test execution (and this is a mandatory feature), the ideal Front End testing tool should offer ways to make the process as seamless as possible.

Front End Testing ensures that users get the best possible experience when they access a website or app. Needless to say, it is a key part of any testing pipeline. Consequently, testers need to be meticulous in their planning, execution, and implementation of Front End testing.