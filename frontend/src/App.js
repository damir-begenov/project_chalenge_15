import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar';
import { Component } from "react";
import axios from 'axios';
import AllStudents from './Components/Students';
import RegisterStPage from './Components/RegisterStudent';
import SearchBar from './Components/SearchBar';
import Companies from './Components/Companies';
import CompanyDetails from './Components/CompanyDetails'
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link,
  useParams,
  useSearchParams
} from "react-router-dom";


function App() {
  // let Component
  // switch (window.location.pathname) {
  //   case "/":
  //     Component = <AllStudents/>
  //     break;
  //   case "/schools":
  //     Component = <Companies/>
  //     break;
  //   case "/registerStudent":
  //     Component = <RegisterStPage/>
  //     break;
  //   case "/students":
  //     Component = <SearchBar/>
  //     break;
  //   case "/schools/:binid":
  //     Component = <CompaniesD/>
  //     break;
  //   default:
  //     break;
  // }
  return (
    <Router>
      <div className='App'>
      <Navbar/>
      <Routes>
          <Route path="/" element={<AllStudents/>} />
          <Route path="/schools" element={<Companies/>} />
          <Route path="/students" element={<SearchBar/>} />
          <Route path="/schools/:biniid" element={<CompanyDetails/>} />
          <Route path="/registerStudent" element={<RegisterStPage/>} />
          <Route path="/students/:iinid"/>
      </Routes>
    </div>
    </Router>

  )
}

export default App;
