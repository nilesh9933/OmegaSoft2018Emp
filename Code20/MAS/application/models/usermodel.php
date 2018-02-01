<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');




class Usermodel extends CI_Model{

	public function adduser($data)
	{
		//$this->load->database();

		$count=$this->db->insert('users',$data);
	    $this->session->set_flashdata("success","You have successfully Registered");

	}
}
?>






