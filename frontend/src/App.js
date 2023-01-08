import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar';
import AllStudents from './Components/Students';
import CompanyDetails from './Components/CompanyDetails';
import RegisterStPage from './Components/RegisterStudent';
import SearchBar from './Components/SearchBar';
import Companies from './Components/Companies';



function App() {
  let Component
  switch (window.location.pathname) {
    case "/":
      Component = <AllStudents/>
      break;
    case "/schools":
      Component = <Companies/>
      break;
    case "/registerStudent":
      Component = <RegisterStPage/>
      break;
    case "/students":
      Component = <SearchBar/>
    default:
      break;
  }
  return (
    <div className='App'>
      <Navbar/>
      {Component}
    </div>
  )
}

export default App;
