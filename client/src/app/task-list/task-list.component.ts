import { Component, OnInit } from '@angular/core';
import {TaskService} from "../task.service";
import {GiphyService} from "../shared/giphy/giphy.service";

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  tasks: Array<any>;

  constructor(private taskService: TaskService) { }

  ngOnInit() {
    this.taskService.getAll().subscribe(data => {
      this.tasks = data;
    })
  }

}
