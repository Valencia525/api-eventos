import { Component, OnInit } from '@angular/core';
import { evento } from '../model/evento';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-evento',
  standalone: true,
  imports: [],
  templateUrl: './evento.component.html',
  styleUrl: './evento.component.css'
})
export class EventoComponent implements OnInit{
  titulo : string = 'eventos';
  listaDeEventos : evento[] =[
    {
      idEvento : 1,
      nombreEvento: 'evento1',
      descripcionEvento : 'dsd',
      fechaCreacion : '2023-12-19'
    },
    {
      idEvento : 2,
      nombreEvento : 'evento2',
      descripcionEvento : 'mai',
      fechaCreacion : '2023-12-19'
    },
    {
      idEvento : 3,
      nombreEvento : 'evento3',
      descripcionEvento : 'fia',
      fechaCreacion : '2023-12-19'
    }
  ];

  constructor(){}
  ngOnInit(): void {
      cargarEventos();
  }

  delete(evento : evento) : void{
    Swal.fire('pendiente');
  }
}

function cargarEventos() {
  throw new Error('Function not implemented');
}
