import type React from "react"
import { Container, Typography, Button } from "@material-ui/core"
import { Link as RouterLink } from "react-router-dom"

const Home: React.FC = () => {
  return (
    <Container maxWidth="md" style={{ marginTop: "2rem" }}>
      <Typography variant="h2" component="h1" gutterBottom>
        Welcome to Carbon Footprint Tracker
      </Typography>
      <Typography variant="h5" component="h2" gutterBottom>
        Track your carbon footprint and offset your impact on the environment.
      </Typography>
      <Button variant="contained" color="primary" component={RouterLink} to="/register" style={{ marginTop: "1rem" }}>
        Get Started
      </Button>
    </Container>
  )
}

export default Home

