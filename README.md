# Tire-change booking system
![Optional Text](/src/main/resources/static/images/homepage.PNG)

# Project setup
1. Setup booking time servers - [Link to Servers Setup](https://github.com/Surmus/tire-change-workshop). Make sure both servers are running (London, Manchester).

2. Setup Tire-change project (current project) 
  - Open this project, for example IntelliJ IDEA.
  - Run TireChangeApplication file (make sure PostgreSQL is installed).
  - Run ```src/main/resources/templates/index.html``` in terminal to open homepage. (Navigate, and check booking times(note: TireChangeApplication must be running to see times) or go to index.html file and open in browser.
  - Note: Homepage is not finished because of the booking times.
  
# How project was made
Project template was created in https://start.spring.io/. Backend in java and frontend in html. Booking times were asked from another server, but because it was in xml then because of the lack of experience it could not be converted to readable from.

# How project could be done (considering current experience, maybe better solution)
1. Add booking times to current project database. Make basic CRUD homepage for that. For user(for adding/removing booking) and admin/workshop manager(for CRUD booking times). Already have experience in that.
2. Update booking time servers that they could return data in JSON not XML.
3. Get experience in XML formatting. Starting from here [Link to Lesson 1 in XML](https://attacomsian.com/blog/parsing-xml-response-spring-boot?fbclid=IwAR1Ga1i42BsHFOUeAYIyrxDBbjozWV1aYE2XbsR8gAmo2rQmet7j8NA7DiQ)
