import React from 'react'

import Header from "./components/header/Header"
import Sidebar from "./components/sidebar/Sidebar"
import { Container } from "react-bootstrap"
import HomeScreen from './screens/homeScreen/HomeScreen'

import "./_app.scss"

const App = () => {
    return (
        <>
            <Header />
            <div className="app__container border border-info">
                <Sidebar />
                <Container fluid className="app_main border border-warning">
                    <HomeScreen />
                </Container>
            </div>
        </>
    )
}

export default App