package com.sridurgapg.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper; 

import com.sridurgapg.beans.Tenant;   
import java.sql.PreparedStatement;
 
  
  
import org.springframework.dao.DataAccessException;  
  
import org.springframework.jdbc.core.PreparedStatementCallback;
    
public class TenantDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
/*public int save(Tenant p){    
    String sql="insert into tenants(id, roomNo, name, ShareType, Rent, student, working, payment) values('"+p.getRoomNo()+",'"+p.getName()+",'"+p.getShareType()+",'"+p.getRent()+",'"+p.getStudent()+",'"+p.getWorking()+",'"+p.getPayment()+")";    
    return jdbcTemplate.update(sql);    
}    
public int update(Tenant p){    
    String sql="update tenants set roomNo='"+p.getRoomNo()+"', name="+p.getName()+",ShareType='"+p.getShareType()+", Rent='"+p.getRent()+", student='"+p.getStudent()+", working='"+p.getWorking()+", payment='"+p.getPayment()+" where id="+p.getId()+"";    
    return jdbcTemplate.update(sql);    
}    
public int delete(int id){    
    String sql="delete from tenants where id="+id+"";    
    return jdbcTemplate.update(sql);    
}    
public Tenant getTenantById(int id){    
    String sql="select * from tenants where id=?";    
    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Tenant>(Tenant.class));    
}    
public List<Tenant> getTenants(){    
    return jdbcTemplate.query("select * from tenants",new RowMapper<Tenant>(){    
        public Tenant mapRow(ResultSet rs, int row) throws SQLException {    
            Tenant e=new Tenant();    
            e.setId(rs.getInt(1));    
            e.setRoomNo(rs.getInt(2));    
            e.setName(rs.getString(3));    
            e.setShareType(rs.getInt(4));
            e.setRent(rs.getInt(5));
            e.setStudent(rs.getString(6));
            e.setWorking(rs.getString(7));
            e.setPayment(rs.getString(8));
            return e;    
        }    
    });    
}  */
public Boolean saveTenantByPreparedStatement(final Tenant e){  
    String query="insert into tenants values(?,?,?,?,?,?,?,?)";  
    return template.execute(query,new PreparedStatementCallback<Boolean>(){  
    @Override  
    public Boolean doInPreparedStatement(PreparedStatement ps)  
            throws SQLException, DataAccessException {  
              
        ps.setInt(1,e.getId());  
        ps.setInt(2,e.getRoomNo());
        ps.setString(3,e.getName());  
        ps.setInt(4,e.getShareType()); 
        ps.setInt(5,e.getRent());
        ps.setString(6,e.getStudent());
        ps.setString(7,e.getWorking());
        ps.setString(8,e.getPayment());

              
        return ps.execute();  
              
    }  
    });  
}  
public Tenant getTenantById(int id){    
    String sql="select * from tenants where id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Tenant>(Tenant.class));
}
}   
