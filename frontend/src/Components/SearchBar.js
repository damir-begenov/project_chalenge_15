import React,{ Component } from "react";
import axios from 'axios';
import AllStudents from "./Students";


export default class SearchBar extends Component {
    componentDidMount() {
        axios.get(`http://127.0.0.1:8081/alls`)
          .then(res => {
            const persons = res.data;
            this.setState({ persons });
          })
          
    }
    state = {
        persons: [],
        loading: false,
        value: ''
    }
    search = async val => {
        let link = 'http://127.0.0.1:8081/alls/' + val
        axios 
            .get(link)
            .then(res => {
                const persons = res.data;
                this.setState({ persons });
              })
    }; 

    onChangeHandler = async e => {
        this.search(e.target.value);
        this.setState({ value: e.target.value });
    };


    
//       get renderMovies() {
//         let movies = <h1>There's no movies</h1>;
//         if (this.state.persons) {
//             console.log(this.state.persons)
//             AllStudents.setState({persons: this.state.persons})
//           movies = <AllStudents setState={this.state.persons} />;
//     }
// return movies}
    status(e) {
        if (e.end_date == '' ) {
            return <td className="unfinished">Ungraduated</td>
        } else {
            return <td className="finished">Graduated</td>
        }
    }
    get kuni() {
        if (this.state.persons.length==0) {
            return <h1 className="resultOfSearch">No one is here</h1>
        } else {
            return (
                <table class="table">
            <thead >
                <tr>
                <th scope="col"><a class="sort">#</a></th>
                <th scope="col"><a class="sort">IIN</a></th>
                <th scope="col"><a class="sort">FIO</a></th>
                <th scope="col"><a class="sort">LABEL</a></th>
                <th scope="col"><a class="sort">Status</a></th>
                <th scope="col"></th>
                 </tr>
            </thead>
            <tbody>
            {this.state.persons.map((person, index) => 
                <tr className="row">
                <th scope="row">{index+1}</th>
                <td>{person.iinid}</td>
                <td className="FIO">{person.fio}</td>
                <td>{person.label}</td>
                {this.status(person.node_cs[0])}
            </tr>
            )}
            </tbody>
        </table>
            )
        }
    }

    render() {
        return (

            <>

            <div className="wrap">
                <div className="search">
                    <input value={this.state.value}
          onChange={e => this.onChangeHandler(e)} type="text" className="searchTerm" placeholder="What are you looking for?"></input>
                    {/* <button type="submit" class="searchButton">
                    Search
                    </button> */}
                </div>
            </div>
            {this.kuni}
            </>
            

        )
    }
}