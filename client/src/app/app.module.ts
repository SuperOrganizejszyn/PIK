import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {AppComponent} from './app.component';
import {TaskService} from "./task.service";
import {HttpClientModule} from "@angular/common/http";
import {TaskListComponent} from './task-list/task-list.component';
import { TaskEditComponent } from './task-edit/task-edit.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [
  { path: '', redirectTo: '/task-list', pathMatch: 'full' },
  {
    path: 'task-list',
    component: TaskListComponent
  },
  {
    path: 'task-add',
    component: TaskEditComponent
  },
  {
    path: 'task-edit/:id',
    component: TaskEditComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    TaskListComponent,
    TaskEditComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
