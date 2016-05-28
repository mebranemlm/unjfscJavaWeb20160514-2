package daoi;

import java.util.List;

import javax.persistence.Query;
import javax.swing.JOptionPane;







//import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;
import util.Conn;
import model.Usuario;
import daol.UsuarioDAOL;

public class UsuarioDAOI implements UsuarioDAOL
{
	Conn cn=new Conn();

	@Override
	public Usuario validateUsua(Usuario obj) throws Exception {
		
		cn.open();
		Usuario objusu=new Usuario();
		try 
		{			
			Query q1=cn.em.createQuery("select a from Usuario a where a.usua=:p1 and a.pass=:p2");
			q1.setParameter("p1", obj.getUsua());
			q1.setParameter("p2", obj.getPass());
			List<Usuario>lista1=q1.getResultList();
			for (Usuario usuario : lista1) {
				objusu=lista1.get(0);
			}			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return objusu;
	}

	@Override
	public Usuario questUsua(Usuario obj) throws Exception {
		cn.open();
		Usuario objusu=new Usuario();
		try 
		{
			objusu=cn.em.find(Usuario.class, obj.getUsua());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return objusu;
	}

	@Override
	public void addUsua(Usuario obj) throws Exception {
		cn.open();
		Usuario objusu=new Usuario();
		try 
		{
			objusu.setUsua(obj.getUsua());
			objusu.setPass(obj.getPass());
			objusu.setEsta(obj.getEsta());
			objusu.setFreg(obj.getFreg());
			cn.em.getTransaction().begin();
			cn.em.persist(objusu);
			cn.em.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

	@Override
	public void editUsua(Usuario obj) throws Exception {
		cn.open();
		Usuario objusu=new Usuario();
		try 
		{
			objusu.setUsua(obj.getUsua());
			objusu.setPass(obj.getPass());
			objusu.setEsta(obj.getEsta());
			objusu.setFreg(obj.getFreg());
			cn.em.getTransaction().begin();
			cn.em.merge(objusu);
			cn.em.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}

	@Override
	public List<Usuario> questListUsua(Usuario obj) throws Exception {
		cn.open();
		List<Usuario>lista1=null;
		try 
		{
			Query q1=cn.em.createQuery("select a from Usuario a where a.usua=:p1").setParameter("p1", obj.getUsua());
			lista1=q1.getResultList();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return lista1;
		
	}	
	

}
