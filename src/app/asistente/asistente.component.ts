import { Component } from '@angular/core';
import { asistente } from '../model/asistente';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-asistente',
  standalone: true,
  imports: [],
  templateUrl: './asistente.component.html',
  styleUrl: './asistente.component.css'
})
export class AsistenteComponent {
  titulo : string = 'asistente';
  listaDeAsistentes : asistente[] =[
    {
      idAsistente : 1,
      nombre : 'Juan',
      paterno : 'Hernandez',
      materno : 'Nuñez',
      email : 'abcde@gmail.com',
      fechaRegistro : '2023-12-19',
      idEvento : 1
    },
    {
      idAsistente : 2,
      nombre : 'Susana',
      paterno : 'Castillo',
      materno : 'Contreras',
      email : "sdfgh@outlook.com",
      fechaRegistro : "2023-12-19",
      idEvento : 2
    },
    {
      idAsistente : 3,
      nombre : 'Maria',
      paterno : 'Miranda',
      materno : 'Figeroa',
      email : 'marmir@gmail.com',
      fechaRegistro : '2023-12-19',
      idEvento : 3
    }
  ];

  constructor(){}
  ngOnInit(): void {
      cargarAsistentes();
  }

  delete(asistente : asistente) : void{
    Swal.fire('pendiente');
  }
}

function cargarAsistentes() {
  throw new Error('Function not implemented');
}
