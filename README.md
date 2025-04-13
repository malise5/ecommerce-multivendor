# ecommerce-multivendor

[![Java CI/CD Pipeline](https://github.com/malise5/ecommerce-multivendor/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/malise5/ecommerce-multivendor/actions/workflows/ci-cd.yml)

A multi-vendor e-commerce platform built with Spring Boot.

## Development Workflow

1. Always work on the `development` branch for new features:
   ```bash
   git checkout development
   ```

2. Create feature branches from development:
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. After testing locally, merge back to development:
   ```bash
   git checkout development
   git merge feature/your-feature-name
   ```

4. For releases, merge to staging for testing:
   ```bash
   git checkout staging
   git merge development
   ```

5. Once tested in staging, merge to main for production:
   ```bash
   git checkout main
   git merge staging
   ```

## CI/CD Pipeline

The project uses GitHub Actions for continuous integration and deployment:

- Builds the application using Maven
- Runs automated tests
- Performs security scanning with OWASP Dependency Check
- Caches Maven dependencies for faster builds
- Includes PostgreSQL service container for integration tests
- Artifacts are uploaded for deployment

## Environment Setup

For detailed instructions on setting up development, staging, and production environments, see our [Environment Setup Guide](docs/environment-setup.md).

## Branch Strategy

- `main` - Production releases
- `staging` - Pre-production testing
- `development` - Integration and development

## Development Setup

1. Clone the repository
2. Switch to development branch: `git checkout development`
3. Copy `application.properties` to `application-local.properties`
4. Configure your local database settings
5. Run with: `./mvnw spring-boot:run -Dspring.profiles.active=local`
