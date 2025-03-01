

# SpringBootPlayground

This is a simple Spring Boot project created while following a YouTube tutorial. The project explores the basics of Spring Boot, including setting up a REST API and handling HTTP requests.

## 🔧 Technologies Used
- Java
- Spring Boot
- Maven

## 📚 What I Learned
This tutorial provided a solid foundation in Spring Boot development. Key takeaways include:

### **1. Setting Up a Spring Boot Project**
- Using Spring Initializr to generate a Spring Boot project.
- Understanding the structure and configuration of a Spring Boot application.
- Importing and setting up the project in an IDE like IntelliJ IDEA.

### **2. Creating a REST API with Spring Boot**
- Building a RESTful API using `@RestController` and `@RequestMapping`.
- Defining API endpoints with `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`.
- Returning JSON/HTML responses from controller methods.

### **3. Core Spring Boot Annotations**
- `@SpringBootApplication` – Marks the main entry point of a Spring Boot application.
- `@RestController` – Used to define RESTful web services.
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` – Handles different HTTP requests.
- `@Autowired` – Implements dependency injection.

### **4. Dependency Injection in Spring Boot**
- Understanding how `@Service` and `@Component` help manage business logic.
- Injecting dependencies into controllers.

### **5. Running and Testing the Application**
- Running the Spring Boot application using:
  ```sh
  mvn spring-boot:run
