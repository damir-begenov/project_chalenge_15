import { Component } from "react";
import {Company} from "../CompanySch"
import axios from 'axios';

class Companies extends Component {
    state = {
        schools: []
    }

    componentDidMount() {
        axios.get(`http://127.0.0.1:8081/alls/school`)
          .then(res => {
            const schools = res.data;
            this.setState({ schools });
          })
      }
    render() {
        return(
            <table class="table">
            <thead >
                <tr>
                <th scope="col"><a class="sort">#</a></th>
                <th scope="col"><a class="sort">BIN</a></th>
                <th scope="col"><a class="sort">Company</a></th>
                <th scope="col"><a class="sort">LABEL</a></th>
                <th scope="col"></th>
                 </tr>
            </thead>
            <tbody>
            {this.state.schools.map((person, index) => 
                <tr className="row">
                <th scope="row">{index+1}</th>
                <td>{person.binid}</td>
                <td className="FIO">{person.company}</td>
                <td>{person.label}</td>
            </tr>
            )}
            </tbody>
        </table>
        )
    }
}

export default Companies