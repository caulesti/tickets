import { BrowserRouter, useRoutes } from 'react-router-dom'

import Home from '../Home'
import NotFound from '../NotFound'
import Navbar from '../../Components/Navbar'

import '../App/App.css'
import { Proveedor } from '../../Context'

const AppRoutes = () => {
  let routes = useRoutes([
    {path: '/', element: <Home />},
    {path: '/*', element: <NotFound />},
  ])
  return routes
}

const App = () => {

  return (
    <Proveedor>
      <BrowserRouter>
        <Navbar />
        <AppRoutes />
      </BrowserRouter>
    </Proveedor>
        
  )
}

export default App