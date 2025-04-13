# Environment Setup Guide

## GitHub Environments Setup

### Staging Environment

1. Go to your GitHub repository → Settings → Environments
2. Click "New environment"
3. Name: `staging`
4. Configure protection rules:
   - Required reviewers: [Add your team members]
   - Deployment branches: Selected branches
     - Allow: `staging`, `main`

Required Secrets for Staging:
```
DB_HOST=your-staging-db-host
DB_PORT=5432
DB_NAME=eC-vendor-db
DB_USERNAME=postgres
DB_PASSWORD=your-staging-db-password
JWT_SECRET=your-staging-jwt-secret
```

### Production Environment

1. Go to your GitHub repository → Settings → Environments
2. Click "New environment"
3. Name: `production`
4. Configure protection rules:
   - Required reviewers: [Add senior team members]
   - Deployment branches: Selected branches
     - Allow: `main` only
   - Wait timer: 15 minutes

Required Secrets for Production:
```
DB_HOST=your-production-db-host
DB_PORT=5432
DB_NAME=eC-vendor-db
DB_USERNAME=your-prod-db-user
DB_PASSWORD=your-production-db-password
JWT_SECRET=your-production-jwt-secret
```

## Branch Protection Rules

### Main Branch
1. Go to Settings → Branches
2. Add rule
3. Branch name pattern: `main`
4. Configure:
   - Require pull request reviews
   - Require status checks to pass
   - Require linear history
   - Include administrators

### Staging Branch
1. Add rule
2. Branch name pattern: `staging`
3. Configure:
   - Require pull request reviews
   - Require status checks to pass

### Development Branch
1. Add rule
2. Branch name pattern: `development`
3. Configure:
   - Require status checks to pass

## Deployment Flow

1. Developers work on feature branches
2. Merge to `development` for integration testing
3. Merge to `staging` for UAT and pre-production testing
4. Merge to `main` for production deployment

## Adding Secrets

For each environment, add secrets through:
1. Repository Settings → Environments
2. Select environment
3. Click "Add secret"
4. Add each secret listed above

## Monitoring Setup

1. Configure health checks in your monitoring system using:
   - Staging: `https://staging.your-domain.com/actuator/health`
   - Production: `https://your-domain.com/actuator/health`

2. Set up alerts for:
   - Application health status
   - Database connection pool metrics
   - Memory usage
   - Response times
