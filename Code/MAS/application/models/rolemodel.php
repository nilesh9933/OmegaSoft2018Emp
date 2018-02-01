<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');




class Rolemodel extends CI_Model{

	public function addrole($data)
	{
		//$this->load->database();
       
		$count=$this->db->insert('roles',$data);
		$this->session->set_flashdata("success","You have successfully Registered");
 

	}
}
?>






