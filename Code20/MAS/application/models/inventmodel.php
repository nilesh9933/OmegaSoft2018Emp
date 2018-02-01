<?php if ( ! defined('BASEPATH')) exit('No direct script access allowed');




class Inventmodel extends CI_Model{

	public function addinvent($data)
	{
		//$this->load->database();

		$count=$this->db->insert('inventory',$data);
	    $this->session->set_flashdata("success","You have added details successfully");

	}
}
?>


