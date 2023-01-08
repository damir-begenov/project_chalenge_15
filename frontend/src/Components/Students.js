import { Component } from "react";
import {StudentsList} from "../Students";

class AllStudents extends Component {
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
            {StudentsList.map((item, index)=> {
                        return (
                            <tr className="row">
                                <th scope="row">{index + 1}</th>
                                <td>{item.IIN}</td>
                                <td className="FIO">{item.FIO}</td>
                                <td>{item.LABEL}</td>
                            </tr>
                        )
                    })}
            </tbody>
        </table>
        )
    }
}

export default AllStudents