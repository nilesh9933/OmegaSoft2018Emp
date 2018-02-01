<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');




class Productmodel extends CI_Model{

	public function addproduct($data)
	{
		//$this->load->database();

		$count=$this->db->insert('product',$data);
	    $this->session->set_flashdata("success","You have successfully added product details");

	}
}
?>






