"use client"

import type React from "react"
import { useState } from "react"
import { Container, Typography, TextField, Button } from "@material-ui/core"
import axios from "axios"

const Login: React.FC = () => {
  const [username, setUsername] = useState("")
  const [password, setPassword] = useState("")

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault()
    try {
      const response = await axios.post("http://localhost:8080/api/auth/login", { username, password })
      console.log(response.data)
      // Handle successful login (e.g., store token, redirect to dashboard)
    } catch (error) {
      console.error("Login failed:", error)
    }
  }

  return (
    <Container maxWidth="xs" style={{ marginTop: "2rem" }}>
      <Typography variant="h4" component="h1" gutterBottom>
        Login
      </Typography>
      <form onSubmit={handleSubmit}>
        <TextField
          variant="outlined"
          margin="normal"
          required
          fullWidth
          id="username"
          label="Username"
          name="username"
          autoComplete="username"
          autoFocus
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <TextField
          variant="outlined"
          margin="normal"
          required
          fullWidth
          name="password"
          label="Password"
          type="password"
          id="password"
          autoComplete="current-password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <Button type="submit" fullWidth variant="contained" color="primary" style={{ marginTop: "1rem" }}>
          Login
        </Button>
      </form>
    </Container>
  )
}

export default Login

