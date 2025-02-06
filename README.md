# Carbon Footprint Tracker and Offset Marketplace

This full-stack web application allows users to track their daily activities and calculate their carbon footprint, suggests ways to reduce it, and provides a marketplace for carbon offset projects.

## Technologies Used

### Backend
- Java Spring Boot
- Hibernate ORM
- PostgreSQL
- JSON Web Tokens (JWT) for authentication

### Frontend
- React with TypeScript
- React Router for navigation
- Axios for API calls
- Material-UI for styling

## Setup Instructions

### Backend Setup

1. Ensure you have Java JDK 11 or later and Maven installed.

2. Navigate to the backend directory:
   ```
   cd carbon-footprint-tracker-backend
   ```

3. Create a PostgreSQL database named `carbon_footprint_tracker`.

4. Update the `application.properties` file in `src/main/resources` with your database credentials and JWT secret:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/carbon_footprint_tracker
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   jwt.secret=your_jwt_secret
   ```

5. Build and run the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

### Frontend Setup

1. Ensure you have Node.js and npm installed.

2. Navigate to the frontend directory:
   ```
   cd carbon-footprint-tracker-frontend
   ```

3. Install dependencies:
   ```
   npm install
   ```

4. Start the frontend development server:
   ```
   npm start
   ```

## Usage

1. Register a new account or log in with existing credentials.
2. Add daily activities to track your carbon footprint.
3. View your carbon footprint dashboard to see your impact over time.
4. Browse the offset marketplace to find projects to offset your carbon footprint.
5. Purchase carbon offsets to reduce your net carbon impact.

## API Endpoints

- `POST /api/users/register`: Register a new user
- `POST /api/auth/login`: Log in a user
- `GET /api/users/{id}`: Get user details
- `POST /api/activities`: Add a new activity
- `GET /api/activities/user/{userId}`: Get user's activities
- `GET /api/activities/user/{userId}/footprint`: Get user's total carbon footprint
- `POST /api/offsets`: Add a new offset
- `GET /api/offsets/user/{userId}`: Get user's offsets
- `GET /api/offsets/user/{userId}/total`: Get user's total carbon offset

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License.
