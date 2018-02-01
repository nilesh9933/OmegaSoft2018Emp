<?php

class Role extends CI_Controller{

	public function index()
	{

		$this->load->view("roleview");
	}


	public function userrole()
	{
            
        $this->form_validation->set_rules('rolname','Role Name','required|alpha');
        $this->form_validation->set_rules('roldes','Role Description','required');
          
         $this->form_validation->set_error_delimiters("<p class='text-danger', style='float:left'>","</p>"); 
         if($this->form_validation->run()) // true
         {
            //echo" Validation Successfull"; 

            $data=array('rolName'=>$_POST['rolname'],  //add data in database
                        'rolDes'=>$_POST['roldes']);
                        
                        

                 $this->load->model('rolemodel');
                 $this->rolemodel->addrole($data);

                 redirect("http://localhost/MAS/index.php/role","refresh");
         }
         else
         {
            $this->load->view("roleview");
           //echo validation_errors();
         }
   }
}

?>