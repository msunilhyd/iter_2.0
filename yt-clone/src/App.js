import React from 'react'

import Header from "./components/header/Header"
import Sidebar from "./components/sidebar/Sidebar"
import { Container } from "react-bootstrap"
import HomeScreen from './screens/homeScreen/HomeScreen'

const App = () => {
    return (
        <>
            <Header />
            <div className="app_container">
                <Sidebar />
                <Container fluid className="app_main">
                    <HomeScreen />
                </Container>
            </div>
        </>
    )
}

export default App