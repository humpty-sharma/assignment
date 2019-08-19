import { Injectable } from '@angular/core';
import { Product } from './product';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Options } from 'selenium-webdriver/firefox';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }
  baseURL = 'http://localhost:8080/products';

  add(Product:Product): Observable<Product> {

    const headers = new HttpHeaders().set('content-type', 'application/json');

    return this.http.post<Product>(this.baseURL, Product,{headers});

  }

  showAll(): Observable<Product[]>{

    return this.http.get<Product[]>("http://localhost:8080/products");
  }

  update(Product:Product): Observable<Product> {

    const headers = new HttpHeaders().set('content-type', 'application/json');

    return this.http.put<Product>(this.baseURL, Product,{headers});

  }

  delete(product:Product): Observable<Product>{

    const headers = new HttpHeaders().set('content-type', 'application/json');

    return this.http.request<Product>("DELETE", this.baseURL, {body:product,headers} );
  }
}
