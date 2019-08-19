import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  message: string;
  result: string;
  buttonState: string="Add";
  allProducts: Product[];
  reset: number

  product: Product = {productId: this.reset , productName:"", refImage: "" , price: this.reset, rating: this.reset};
  newProduct: Product= {productId: this.reset , productName:"", refImage: "" , price: this.reset, rating: this.reset }; 
  constructor(private service: ProductService) { }

  ngOnInit() {
    this.service.showAll().subscribe(resp => this.allProducts = resp);

  }

  onSubmit(){
    if(this.buttonState==='Add'){
      this.service.add(this.product).subscribe(resp => {this.message = '  One Product Added '; this.result='Success!!';
                                                        this.allProducts.push(resp);
                                                       this.product=this.newProduct});
    }

    else if(this.buttonState==='Update'){
      this.service.update(this.product).subscribe(resp => {
        this.message = 'One Product Updated'; this.result='Success!!'; this.buttonState='Add';
        this.product=this.newProduct});
    }
  }

  updateButton(eachProduct){
    console.log("edit fired");
    this.buttonState='Update';
    this.product=eachProduct;

  }

  delete(eachProduct){
    const idxpostion = this.allProducts.indexOf(eachProduct);
      this.service.delete(eachProduct).subscribe(resp => {this.message = '  One Product Deleted ';     this.allProducts.splice(idxpostion,1);
      this.result='Success!!';
      });

  }
}
