# WebFlux E-commerce API Gateway

This project is an API gateway for an e-commerce system. It is written in Java and uses reactive programming with Spring WebFlux and Spring Cloud Gateway.

**Note:** This API is part of a larger e-commerce system that includes product catalog management and user management. To run the complete system, you must also run the [WebFlux Catalog API](https://github.com/anabeatrizdmt/webflux-catalog), the [WebFlux Users API](https://github.com/anabeatrizdmt/webflux-users), and the [WebFlux Orders API](https://github.com/anabeatrizdmt/webflux-orders).



## Requirements

- Java 11 or higher

## Installation and Setup

1. Clone the repository:

```
git clone https://github.com/anabeatrizdmt/webflux-ecommerce-api-gateway.git

```

2. Install dependencies:

```
cd webflux-ecommerce-api-gateway
mvn install
```

3. Run the application:

```
mvn spring-boot:run
```

## Usage

This API gateway provides a unified interface to the entire e-commerce system. It forwards incoming requests to the appropriate downstream services using routing rules and load balancing.

### Endpoints

This API gateway exposes the following endpoints:

- `/catalog/**`: For product catalog management
- `/users/**`: For user management
- `/orders/**`: For order management

### Routing

The routing rules are defined in the `Config.java` file in the `src/main/java/com/gateway/ecommerceapigateway/config` directory. 


## Dependencies

This repository depends on the following dependency:

- `spring-cloud-dependencies`: A collection of Spring Cloud dependencies that are managed together.
