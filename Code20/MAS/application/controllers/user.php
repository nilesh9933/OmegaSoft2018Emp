<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');



class User extends CI_Controller{

	public function index()
	{
        
       $this->load->helper('form');
		   $this->load->view('userview');
	}
	public function register()
	
        {
            
            $this->form_validation->set_rules('firstname','User First Name','required|alpha|trim');
            $this->form_validation->set_rules('lastname','User Last Name','required|alpha|trim');
            $this->form_validation->set_rules('email',' Email','required|valid_email|is_unique[users.userEmail]');
            $this->form_validation->set_rules('username','User Name','required|alpha_numeric|is_unique[users.userName]');
            $this->form_validation->set_rules('password','password','required|alpha_numeric|min_length[8]');
            $this->form_validation->set_rules('confpassword','Confirm Password','required|matches[password]');

             $this->form_validation->set_error_delimiters("<p class='text-danger', style='float:left'>","</p>"); 
                 if($this->form_validation->run())
                   {
                      //echo" Validation Successfull"; 
                      $data=array('userFirstName'=>$_POST['firstname'],
                                  'userLastName'=>$_POST['lastname'],
                                  'userEmail'=>$_POST['email'],
                                  'userName'=>$_POST['username'],
                                  'password'=>$_POST['password']);
                        
                       $this->load->model('usermodel');
                       $this->usermodel->adduser($data);

                       redirect("http://localhost/MAS/index.php/user","refresh");
                    
                   }
                 else
                   {
                       $this->load->view("userview");
                       //echo validation_errors();
                   }
          }
}

?>