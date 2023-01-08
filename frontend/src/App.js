import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar';
import AllStudents from './Components/Students';
import CompanyDetails from './Components/CompanyDetails';



function App() {
  let Component
  switch (window.location.pathname) {
    case "/":
      Component = <AllStudents/>
      break;
    case "/company":
      Component = <CompanyDetails/>
      break;
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
