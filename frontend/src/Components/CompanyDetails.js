import { Component } from "react";
import {Company} from "../CompanySch"

class CompanyDetails extends Component {
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