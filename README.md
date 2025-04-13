# ecommerce-multivendor

[![Java CI/CD Pipeline](https://github.com/malise5/ecommerce-multivendor/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/malise5/ecommerce-multivendor/actions/workflows/ci-cd.yml)

A multi-vendor e-commerce platform built with Spring Boot.

## CI/CD Pipeline

The project uses GitHub Actions for continuous integration and deployment:

- Builds the application using Maven
- Runs automated tests
- Performs security scanning with OWASP Dependency Check
- Caches Maven dependencies for faster builds
- Includes MySQL service container for integration tests
- Artifacts are uploaded for deployment
