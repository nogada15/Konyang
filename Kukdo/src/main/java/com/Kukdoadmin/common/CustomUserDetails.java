package com.Kukdoadmin.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.Kukdoadmin.DAO.DAO;

@SuppressWarnings("serial")
public class CustomUserDetails implements UserDetails{
	
	private String username;
	private String password;
	
	private String bMain;
	private String bInvestment;
	private String bHire;
	private String bNews;
	private String bTerms;
	private String bAdmin;
	
	DAO dao = new DAO();
	
	public CustomUserDetails(String userName, String password) {
		this.username = userName;
		this.password = password;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();    
        
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getbMain() {
		return bMain;
	}

	public void setbMain(String bMain) {
		this.bMain = bMain;
	}

	public String getbInvestment() {
		return bInvestment;
	}

	public void setbInvestment(String bInvestment) {
		this.bInvestment = bInvestment;
	}

	public String getbHire() {
		return bHire;
	}

	public void setbHire(String bHire) {
		this.bHire = bHire;
	}

	public String getbNews() {
		return bNews;
	}

	public void setbNews(String bNews) {
		this.bNews = bNews;
	}

	public String getbAdmin() {
		return bAdmin;
	}

	public void setbAdmin(String bAdmin) {
		this.bAdmin = bAdmin;
	}

	public String getbTerms() {
		return bTerms;
	}

	public void setbTerms(String bTerms) {
		this.bTerms = bTerms;
	}

}
