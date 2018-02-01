<?php

class Prodtype extends CI_Controller{

	public function index()
	{

		$this->load->view("prodtypeview");
	}


	public function protypedetail()
	{
            
        $this->form_validation->set_rules('prodtype','Product Type','required');
        $this->form_validation->set_rules('prodtypedes','Product Type Description','required');
          
         $this->form_validation->set_error_delimiters("<p class='text-danger', style='float:left'>","</p>"); 
         if($this->form_validation->run()) // true
         {
            //echo" Validation Successfull"; 

            $data=array('proType'=>$_POST['prodtype'],  //add data in database
                        'proTypeDes'=>$_POST['prodtypedes']);
                        
                        

                 $this->load->model('prodtypemodel');
                 $this->prodtypemodel->addprotype($data);

                 redirect("http://localhost/MAS/index.php/prodtype","refresh");
         }
         else
         {
            $this->load->view("prodtypeview");
           //echo validation_errors();
         }
   }
}

?>