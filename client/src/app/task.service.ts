import { Injectable } from '@angular/core';
import { HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class TaskService {

  constructor(private http: HttpClient) { }
  public API = '';//http://localhost:8080';
  public TASK_API = this.API + '/tasks';

  getAll(): Observable<any> {
    return this.http.get(this.TASK_API + '/all');
  }
  get(id: string) {
    return this.http.get(this.TASK_API + '/' + id);
  }
  save(task: any): Observable<any> {
    let result: Observable<Object>;
    if (task['href']) {
      result = this.http.put(task.href, task);
    } else {
      result = this.http.post(this.TASK_API, task);
    }
    return result;
  }

  remove(href: string) {
    return this.http.delete(href);
  }
}
