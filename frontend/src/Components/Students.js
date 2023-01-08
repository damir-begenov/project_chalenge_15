import { Component, useEffect } from "react";
import {StudentsList} from "../Students";
import { useState } from "react";
import axios from 'axios';
 

class AllStudents extends Component {
    state = {
        persons: []
    }

    componentDidMount() {
        axios.get(`http://127.0.0.1:8081/alls`)
          .then(res => {
            const persons = res.data;
            this.setState({ persons });
          })
      }
    render() {
        return (
        <table class="table">
            <thead >
                <tr>
                <th scope="col"><a class="sort">#</a></th>
                <th scope="col"><a class="sort">IIN</a></th>
                <th scope="col"><a class="sort">FIO</a></th>
                <th scope="col"><a class="sort">LABEL</a></th>
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
            </tr>
            )}
            </tbody>
        </table>
        )
    }
}

export default AllStudents