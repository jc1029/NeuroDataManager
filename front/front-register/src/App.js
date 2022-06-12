import './assets/css/App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import React, { Fragment }  from 'react';
import {BrowserRouter as Router,Route,Switch }  from "react-router-dom";
import Login from './components/Login';
import Propos from './components/Propos';
import Logout from './components/Logout';
import Signup from './components/Signup';
import HomePage from './components/HomePage';
import NotFoundPage from './components/NotFoundPage';
import NavBar from './components/NavBar';
import Saludo from './components/Saludo';



export default function App() {
  return (
    <Fragment>
      <Saludo />
      <Router>
      <NavBar />
      <Switch>
        <Route path="/homepage" children={({ match }) => (match ? ( <HomePage match={match} animate={true} />) : (<NotFoundPage />))}/>
        <Route path="/login" children={({ match }) => (match ? ( <Login match={match} animate={true} />) : (<NotFoundPage />))}/>
        <Route path="/propos" children={({ match }) => (match ? ( <Propos match={match} animate={true} />) : (<NotFoundPage />))}/>
        <Route path="/logout" children={({ match }) => (match ? ( <Logout match={match} animate={true} />) : (<NotFoundPage />))}/>
        <Route path="/signup" children={({ match }) => (match ? ( <Signup match={match} animate={true} />) : (<NotFoundPage />))}/>
        <Route path="*" element={<NotFoundPage />} />
      </Switch>
      </Router>
    </Fragment>

    
  );
}

