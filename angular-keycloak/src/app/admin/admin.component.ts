import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
	selector:'app-admin',
	templateUrl:'admin.component.html',
	styleUrls:['admin.component.css']
})
export class AdminComponent implements OnInit{
	ngOnInit(): void {
	this.httpClient.get("http://localhost:8080/api/v1/employees/username").subscribe(data=>{
		console.log("data from server");
		console.log(data);
	});	
	}
	constructor(private httpClient: HttpClient){
	}
}