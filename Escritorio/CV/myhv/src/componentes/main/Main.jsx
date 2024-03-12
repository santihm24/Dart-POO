import React from 'react'
import "./main.css"

export default function Main() {
    return (
        <div className="main">
            <h2>Habilidades</h2>
            <div className="cvMain">
                <ul className='ListaHabilidadesMain'>
                    <li>HTML</li>
                    <li>CSS</li>
                    <li>JavaScript</li>
                    <li>NodeJS</li>
                    <li>Python</li>
                    <li>Visual Basic</li>
                    <li>Express</li>
                    <li>Sequelize</li>
                    <li>SQL</li>
                    <li>REACT</li>
                    <li>BootStrap</li>
                    <li>Tailwind</li>
                </ul>
            </div>
            <h2>Formación académica universitaria</h2>
            <div className="cvMain">
                <p>Ingeniería de Sistemas y Computación 2006. Universidad Tecnológica de Pereira.</p>
                <p>Especialización en Didáctica de la Docencia virtual 2017. Fundación Universitaria del Área Andina. </p>
                <p>Maestría en Ingeniería de Sistemas y Computación2020. Universidad Tecnológica de Pereira.</p>
                <p>Diplomado en docencia virtual. Politécnico de Colombia 2015.</p>
            </div>
            <h2>Experiencia laboral</h2>
            <div className="cvMain">
                <p><strong>Desarrollador WebFullStack.</strong> Digital House. 6 meses. Tecnologías empleadas: HTML, CSS, JAVASCRIPT, NODEJS, REACT SEQUELIZE, EXPRESS, SQL. Proyecto desarrollado: https://myecommerce.onrender.com/</p>
                <p><strong>Docente y asesor del área informática.</strong> Magisterio RISARALDA. 16 meses. Tecnologías empleadas: C++, VISUALBASIC</p>
                <p><strong>Instructor de informática. (ANÁLISIS Y DESARROLLO DE SOFTWARE, EXCEL AVANZADO, BD, ESTADÍSTICA, MATEMÁTICA, ALGEBRA).</strong>SENA. 13 Años. Tecnologías empleadas: PYTHON, VISUALBASIC, SQL, HTML, CSS, JavaScript, NODE JS, REACTJS, TAILWINDCSS, BOOTSTRAP</p> <p><strong></strong></p>
            </div>
            <h2>Proyectos desarrollados</h2>
            <div className="cvMain">
                <ul>
                    <li><p>Tienda virtual. <a href='https://myecommerce.onrender.com/'>https://myecommerce.onrender.com/</a></p></li>
                    <li><p>Programador de cursos complementarios (VisualBasic).</p></li>
                    <li><p>Validador de usuarios registrados en senasofiaplus.edu.co (Automatización).</p></li>
                    <li><p>Registrador de usuarios en senasofiaplus.edu.co (Automatización).</p></li>
                    <li><p>Programador de cursos complementarios. <a href="https://programador-cursos.onrender.com/#/">https://programador-cursos.onrender.com/#/</a></p></li>
                    <li><p>Entorno prácticas concurso DIAN. <a href='https://simulacrosdian.onrender.com/'>https://simulacrosdian.onrender.com/</a></p></li>
                </ul>
            </div>
            <h2>Formación Complementaria</h2>
            <div className="cvMain">
                <h4>SENA</h4>
                <ul>

                    <li>ESTRATEGIAS PARA LA ORIENTACIÓN DE PROCESOS DE FORMACIÓN EN AMBIENTES VIRTUALES DE APRENDIZAJE</li><br></br> <li>FUNDAMENTACIÓN DE LA FORMACIÓN PROFESIONAL INTEGRAL CON BASE EN COMPETENCIAS.</li> <br></br>
                    <li>ESTRATEGIAS Y MEDIOS PARA EL APRENDIZAJE DE TECNOLOGÍAS</li><br></br>
                    <li>FORMACIÓN POR PROYECTOS</li><br></br>
                    <li>ESTRATEGIAS PARA LA ORIENTACIÓN DE PROCESOS DE FORMACIÓN EN AMBIENTES VIRTUALES DE APRENDIZAJE</li><br></br> <li>CONTROL INTERNO EN LOS SISTEMAS INFORMÁTICOS</li><br></br>
                    <li>REDES Y SEGURIDAD</li><br></br>
                    <li>FORMACION EN AMBIENTES VIRTUALES DE APRENDIZAJE</li><br></br>
                </ul>
                <h4>UNIVERSIDAD TECNOLÓGICA DE PEREIRA</h4>
                <ul>
                    <li>GESTIÓN DE LA CALIDAD EN PROYECTOS</li><br></br>
                </ul>
                <h4>STANFORD UNIVERSITY COURSERA</h4>
                <ul>
                    <li>MACHINE LEARNING</li><br></br>
                </ul>
                <h4>MICROSOFT</h4>
                <ul>
                    <li>AZ-900: MICROSOFT AZURE FUNDAMENTALS</li><br></br>
                </ul>
            </div>
        </div>
    )
}
/*import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
)
*/
