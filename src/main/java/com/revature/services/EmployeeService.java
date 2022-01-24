package com.revature.services;

import com.revature.repos.ReimbursementRequestDAO;
import com.revature.repos.ReimbursementRequestDAOImple;

public class EmployeeService {
    private ReimbursementRequestDAO request = new ReimbursementRequestDAOImple();

    public void viewPastTickets(){
        request.getEmployeeRequests();
    }

    public void addReimbursementRequest(){
        request.addRequest();
    }
}
