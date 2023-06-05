/*import { Component } from '@angular/core';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent {

}
*/

import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book-service.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[] | undefined;

  constructor(private bookService: BookService) {
  }

  ngOnInit() {
    this.bookService.findAll().subscribe(data => {
      this.books = data;
    });
  }
}
