<?php

class Inventory extends CI_Controller{

	public function index()
	{

		$this->load->view("inventview");
	}


	public function inventdata()
	{
        $this->form_validation->set_rules('prodid','Product Id','required');
        $this->form_validation->set_rules('prodquantity','Product Quantity','required|numeric');
        $this->form_validation->set_rules('instock','Instock','required');
          
         $this->form_validation->set_error_delimiters("<p class='text-danger', style='float:left'>","</p>"); 
         if($this->form_validation->run()) // true
         {
            //echo" Validation Successfull"; 

            $data=array('proQty'=>$_POST['prodquantity'],  //add data in database
                        'instock'=>$_POST['instock']);
                        
                        

                 $this->load->model('inventmodel');
                 $this->inventmodel->addinvent($data);

                 redirect("http://localhost/MAS/index.php/inventory","refresh");
         }
         else
         {
            $this->load->view("inventview");
           //echo validation_errors();
         }
   }
}

?>