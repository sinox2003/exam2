//package org.example.exam1.security;
//
//import org.example.exam1.entities.Employee;
//import org.example.exam1.services.EmployeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private EmployeService employeService;
//
//    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Employee employee = employeeRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        return new User(employee.getUsername(), employee.getPassword(), Collections.emptyList());
//    }
//}
