
import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Login from './components/Auth/Login';
import StudentProfile from './components/Student/StudentProfile';
import ManageClasses from './components/Faculty/ManageClasses';
import Dashboard from './components/Admin/Dashboard';
import './styles/App.css';

const App = () => {
    return (
        <Router>
            <div className="App">
                <Switch>
                    <Route path="/login" component={Login} />
                    <Route path="/students/profile" component={StudentProfile} />
                    <Route path="/faculty/manage-classes" component={ManageClasses} />
                    <Route path="/admin/dashboard" component={Dashboard} />
                </Switch>
            </div>
        </Router>
    );
};

export default App;
