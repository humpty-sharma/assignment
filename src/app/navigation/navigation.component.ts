import { Component, OnInit } from '@angular/core';
import { NavigationLinks } from '../navigation-links';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  links: NavigationLinks[] = [
    {text:'Show All', link:'/show'},
    {text:'Add', link:'/add'}
    ];
  constructor() { }

  ngOnInit() {
  }

}
