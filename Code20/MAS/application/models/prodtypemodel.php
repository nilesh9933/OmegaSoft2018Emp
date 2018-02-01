<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');




class Prodtypemodel extends CI_Model{

	public function addprotype($data)
	{
		//$this->load->database();
       
		$count=$this->db->insert('prodtype',$data);
		$this->session->set_flashdata("success","You have successfully Registered");
 

	}
}
?>






