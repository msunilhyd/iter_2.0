import React, { useState } from 'react'
import LoginScreen from "./components/loginScreen/LoginScreen"
import Header from "./components/header/Header"
import Sidebar from "./components/sidebar/Sidebar"
import { Container } from "react-bootstrap"
import HomeScreen from './screens/homeScreen/HomeScreen'

import { BrowserRouter as Router, Route, Switch, Redirect } from 'react-router-dom'

import "./_app.scss"

const Layout = (children) => {

    const [sidebar, toggleSidebar] = useState(false);

    const handleToggleSidebar = () => toggleSidebar(value => !value);
    return (
        <>
            <Header handleToggleSidebar={handleToggleSidebar}  />
            <div className="app__container border border-info">
                <Sidebar 
                    sidebar={sidebar} 
                     handleToggleSidebar={handleToggleSidebar} 
                />
                <Container fluid className="app_main border border-warning">
                    {children}
                </Container>
            </div>
        </>
    );
}

const App = () => {

    return (
        <Router>
            <Switch>

            <Route path="/" exact>
                <Layout>
                    <HomeScreen />
                </Layout>
            </Route>
            <Route path='/auth'>
                <LoginScreen />
            </Route>
            <Route path='/search'>
                <Layout>
                    <h1>Search Results</h1>
                </Layout>
            </Route>
            <Route>
                <Redirect to='/' />
            </Route>
            </Switch>
        </Router>
    )
}

export default App