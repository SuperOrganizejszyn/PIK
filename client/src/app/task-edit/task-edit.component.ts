import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs/Subscription';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import {TaskService} from "../task.service";

@Component({
  selector: 'app-task-edit',
  templateUrl: './task-edit.component.html',
  styleUrls: ['./task-edit.component.css']
})
export class TaskEditComponent implements OnInit {
  task: any = {};

  sub: Subscription;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private taskService: TaskService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.taskService.get(id).subscribe((task: any) => {
          if (task) {
            this.task = task;
            this.task.href = task._links.self.href;
          } else {
            console.log(`task with id '${id}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['/task-list']);
  }

  save(form: NgForm) {
    this.taskService.save(form).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  remove(href) {
    this.taskService.remove(href).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  validDates() {
    if ( task.startDate && task.endDate ) {
      return task.startDate <= task.endDate;
    }
    else return true;
  }
}
