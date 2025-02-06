import { BrowserRouter as Router, Route, Switch } from "react-router-dom"
import { ThemeProvider, createTheme } from "@material-ui/core/styles"
import CssBaseline from "@material-ui/core/CssBaseline"
import Navbar from "./components/Navbar"
import Home from "./pages/Home"
import Login from "./pages/Login"
import Register from "./pages/Register"
import Dashboard from "./pages/Dashboard"
import ActivityForm from "./pages/ActivityForm"
import OffsetMarketplace from "./pages/OffsetMarketplace"

const theme = createTheme({
  palette: {
    primary: {
      main: "#4caf50",
    },
    secondary: {
      main: "#2196f3",
    },
  },
})

function App() {
  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <Router>
        <Navbar />
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/login" component={Login} />
          <Route path="/register" component={Register} />
          <Route path="/dashboard" component={Dashboard} />
          <Route path="/add-activity" component={ActivityForm} />
          <Route path="/offset-marketplace" component={OffsetMarketplace} />
        </Switch>
      </Router>
    </ThemeProvider>
  )
}

export default App

