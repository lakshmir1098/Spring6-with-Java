# Mastering Spring Framework 6 / Spring Boot 3 using Java

## Notes:
* ### Tight coupling 
  Coupling is how much effort is needed , when changing something. Example of tight coupling is, let say we have 3  games and these games are called and run in gamer class. So, if everytime to run each game if we have to change the gamer class to call that particular game, it not correct right. This is called tight coupling. We always have to keep our code loosely coupled. To overcome this problem we can use "Interface".

  Ref : [Loose Coupling Game App using Interface](https://github.com/lakshmir1098/Spring6-with-Java/tree/master/working-directory/MasteringSpring/src/main/java/com/learnings/MasteringSpring/LooselyCoupling)
 
    Tight Coupling |  LooseCoupling
    :---: | :---:
    ![](https://github.com/lakshmir1098/Spring6-with-Java/blob/master/images/tight%20coupling.png) | ![](https://github.com/lakshmir1098/Spring6-with-Java/blob/master/images/Loose%20coupling.png)

* ### Launching Java Spring
    
    Steps to Launch a Spring Application:

    Ref : [SpringIntro](https://github.com/lakshmir1098/Spring6-with-Java/tree/master/working-directory/MasteringSpring/src/main/java/com/learnings/MasteringSpring/SpringIntro) 
1. Create a configuration class with `@Configuration` annotation.

    ```java
    @Configuration
    public class HelloWorldConfiguration 
    ```
2. In Java main class, launch a Spring Context by, creating new `ApplicationConfigApplicationContext` for the configuration class above created.

    ```java
    var context = 
    new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    ```
3. Create Beans to be managed by Spring in the configuration class.

    ```java
    @Bean
	public String name() {
		return "Ranga";
	}
    ```
4. Retrieve the ouput of this bean in our main class by calling the Beans.

    ```java
    System.out.println(context.getBean("name"));
    ```

