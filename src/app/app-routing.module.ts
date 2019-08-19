import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditProductComponent } from './edit-product/edit-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ShowProductComponent } from './show-product/show-product.component';


const routes: Routes = [
  {path:'',redirectTo:'show', pathMatch: 'full'},
  {path:'show',component:ShowProductComponent, pathMatch: 'full'},
  {path:'add',component:AddProductComponent, pathMatch: 'full'},
  {path:'delete',component:DeleteProductComponent,pathMatch: 'full'},
  {path:'edit',component:EditProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
