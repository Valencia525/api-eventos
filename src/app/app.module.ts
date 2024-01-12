import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { EventoComponent } from './evento/evento.component';
import { AsistenteComponent } from './asistente/asistente.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppComponent,
    HeaderComponent,
    FooterComponent,
    EventoComponent,
    AsistenteComponent,
    HomeComponent,
  ],
  providers: []
  //bootstrap: [AppComponent]
})
export class AppModule {

}


