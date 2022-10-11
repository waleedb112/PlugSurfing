# PlugSurfing

The Java version used for this project is 17. The service layer is Cacheable, inorder to increase performance if same artist is searched for again. 
The response includes Artist Profile details and detail of his/her Albums. Description of the Artist is currently missing. 

Following is an example of how to get an Artist Profile
GET /musify/music-artist/details?id=f27ec8db-af05-4f36-916e-3d57f91ecf5e

There are two ways to run this project
1) Using IDEA, import this project as a maven project and then run as a spring boot project
2) Using maven plugin: mvn spring-boot:run
