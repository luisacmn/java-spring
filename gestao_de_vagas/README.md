# Project Java/Spring

## Structure

- Use `Ctrl + Shift + P` to initialize Spring and create the application structure.
- Create a "modules" folder within the application folder for maintaining single responsibility.
- Organize entities (e.g., candidate, company, vacancies) within the "modules" folder.
- Create the candidate entity: `CandidateEntity.java` within the "candidate" folder.
- Create the `CandidateController.java` file in the "controllers" folder to implement the method for creating a candidate and returning information.
- Utilize Lombok library with `@Data` annotation for automatic generation of getters and setters.
- Test the application by running it.
- Use Postman to perform a POST request with user data in JSON format.

## Data Validation

- Integrate the validation library provided by Spring.
- Perform validation within the entity.
- Apply annotations such as `@NotNull`, `@Size`, etc., for parameters (e.g., username, password, email).
- Ensure these validations are applied in the method responsible for creating a candidate.

## Response Handling

- **ErrorMessageDTO Class:**
  - The `ErrorMessageDTO` class defines a structure for error messages, including a message and associated field.

- **ExceptionHandlerController.java:**
  - The `ExceptionHandlerController` class is annotated with `@ControllerAdvice`, indicating global exception handling for all controllers.
  - The `handleMethodArgumentNotValidException` method specifically deals with `MethodArgumentNotValidException`.
  - It creates a list of `ErrorMessageDTO` objects to hold error messages and associated fields.
  - Iterates through field errors, retrieves localized error messages using `messageSource`, and adds them to the list.
  - Returns a `ResponseEntity` containing the list of error messages with a `BAD_REQUEST` status code.
