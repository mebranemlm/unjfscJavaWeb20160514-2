package bean;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.Usuario;
import daoi.UsuarioDAOI;

public class UsuarioBean {
	public String usua,pass;
	public Date freg;
	public Integer esta;
	
	public UsuarioDAOI usudaoimpl=new UsuarioDAOI();
	
	private List<Usuario>list_user;
	private int list_size;
	private boolean sw_edit;
	
	Usuario obj=new Usuario();
	
	public boolean actionAdd()
	{
		sw_edit=false;
		return sw_edit;
	}
	public boolean actionEdit()
	{
		sw_edit=true;
		return sw_edit;
	}
	
	public String validar_login() throws Exception
	{
		String r="ERROR";
		Usuario objusu=new Usuario();
		objusu.setUsua(getUsua());
		objusu.setPass(getPass());
		obj=usudaoimpl.validateUsua(objusu);
		if (obj!=null && obj.getUsua()!=null)
		{
			r="SUCCESS";
			setUsua(obj.getUsua());
			setPass(obj.getPass());
		}
		//JOptionPane.showMessageDialog(null,"El resultado de la validación es: "+ r);
		System.out.println("Resultado: "+r);
		return r;
	}
	public void addUsuario() throws Exception
	{
		Usuario objusu=new Usuario();
		objusu.setUsua(getUsua());
		objusu.setPass(getPass());
		objusu.setEsta(getEsta());
		objusu.setFreg(getFreg());
		usudaoimpl.addUsua(objusu);
	}
	public void editUsuario() throws Exception
	{
		Usuario objusu=new Usuario();
		objusu.setUsua(getUsua());
		objusu.setPass(getPass());
		objusu.setEsta(getEsta());
		objusu.setFreg(getFreg());
		usudaoimpl.editUsua(objusu);
	}
	public void questListUsuario() throws Exception
	{
		Usuario objusu=new Usuario();
		objusu.setUsua(getUsua());
		objusu=usudaoimpl.questUsua(objusu);
		list_user=usudaoimpl.questListUsua(objusu);
		list_size=list_user.size();
	}
	
	public void limpiar()
	{
		setUsua(null);
		setPass(null);
		setFreg(null);
		setEsta(-1);
	}
	public String getUsua() {
		return usua;
	}
	public void setUsua(String usua) {
		this.usua = usua;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getFreg() {
		return freg;
	}
	public void setFreg(Date freg) {
		this.freg = freg;
	}
	public Integer getEsta() {
		return esta;
	}
	public void setEsta(Integer esta) {
		this.esta = esta;
	}
	public List<Usuario> getList_user() {
		return list_user;
	}
	public void setList_user(List<Usuario> list_user) {
		this.list_user = list_user;
	}
	public int getList_size() {
		return list_size;
	}
	public void setList_size(int list_size) {
		this.list_size = list_size;
	}
	public boolean isSw_edit() {
		return sw_edit;
	}
	public void setSw_edit(boolean sw_edit) {
		this.sw_edit = sw_edit;
	}
	public Usuario getObj() {
		return obj;
	}
	public void setObj(Usuario obj) {
		this.obj = obj;
	}	
	
}
