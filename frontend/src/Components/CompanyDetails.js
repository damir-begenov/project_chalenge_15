import { Component } from "react";
import {Company} from "../CompanySch"
import axios from 'axios';

class CompanyDetails extends Component {
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
            <div className="CompDetails">
                <div className="Naming">
                    <h1 className="CompName">{Company[0].COMPANY}</h1>
                    <h2 className="CompBin">BIN:{Company[0].BIN}</h2>
                </div>
            </div>
        )
    }
}

export default CompanyDetails