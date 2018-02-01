<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');



class Product extends CI_Controller{

	public function index()
	{
        
       $this->load->helper('form');
		   $this->load->view('productview');
	}
	public function prodetail()
	
        {
            
            $this->form_validation->set_rules('protypeId','Product Type Id','required');
            $this->form_validation->set_rules('prodname','Product Name','required|alpha|trim');
            $this->form_validation->set_rules('proddes',' Product Description','required|alpha_numeric');
            $this->form_validation->set_rules('purchdate','Purchase date','required');
            $this->form_validation->set_rules('purchrate','Purchase Rate','required|decimal');
            $this->form_validation->set_rules('salerate','Sale Rate','required|decimal');
            $this->form_validation->set_rules('manufdate','Manufacture date','required');
            $this->form_validation->set_rules('expdate','Expiry date','required');
            $this->form_validation->set_rules('manufcomp','Manufacture Company','required|alpha_numeric');
            $this->form_validation->set_rules('warrperiod','Warranty Period','required|alpha_numeric');


             $this->form_validation->set_error_delimiters("<p class='text-danger', style='float:left'>","</p>"); 
                 if($this->form_validation->run())
                   {
                      //echo" Validation Successfull"; 
                      $data=array('proTypeId'=>$_POST['protypeId'],
                                  'proName'=>$_POST['prodname'],
                                  'proDes'=>$_POST['proddes'],
                                  'proPurDate'=>$_POST['purchdate'],
                                  'proPurRate'=>$_POST['purchrate'],
                                  'proSaleRate'=>$_POST['salerate'],
                                  'proManDate'=>$_POST['manufdate'],
                                  'proExpDate'=>$_POST['expdate'],
                                  'proManComp'=>$_POST['manufcomp'],
                                  'proWarrPeriod'=>$_POST['warrperiod']);
                        
                       $this->load->model('productmodel');
                       $this->productmodel->addproduct($data);

                       redirect("http://localhost/MAS/index.php/product","refresh");
                    
                   }
                 else
                   {
                       $this->load->view("productview");
                       //echo validation_errors();
                   }
          }
}

?>