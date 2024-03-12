import React from 'react';
import "./footer.css";
// import { GitHub, LinkedIn, Facebook };  //from '@material-ui/icons';/

export default function Footer() {
    return (
        <div className='footer'>
            <ul className='ulFooter'>
                <li className='contactListItemFooter'><a href="https://github.com/jorgeloaiza48"><p></p></a></li>
                <li className='contactListItemFooter'><a href="https://www.linkedin.com/in/jelm48/"><p></p></a></li>
                <li className='contactListItemFooter'><a href="https://www.linkedin.com/in/jelm48/"><p></p></a></li>
            </ul>
        </div>
    );
}
