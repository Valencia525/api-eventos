import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EventoComponent } from './evento/evento.component';
import { AsistenteComponent } from './asistente/asistente.component';
import { EventosformComponent } from './eventosform/eventosform.component';
import { AsistentesformComponent } from './asistentesform/asistentesform.component';

export const routes: Routes = [
  {path : '' , redirectTo : '/home', pathMatch : 'full'},
  {path : 'home' , component : HomeComponent},
  {path : 'eventos', component : EventoComponent},
  {path : 'eventosForm/:id', component : EventosformComponent},
  {path : 'asistentes' , component : AsistenteComponent},
  {path : 'asistentesForm/:id', component : AsistentesformComponent}
];
