package com.revature.services;

import com.revature.repos.ReimbursementRequestDAO;
import com.revature.repos.ReimbursementRequestDAOImple;

public class FinanceManagerService {
    private ReimbursementRequestDAO request = new ReimbursementRequestDAOImple();

    public void viewAllReimbursementRequests(){
        request.getAllRequests();
    }

    public void filterRequestsByStatus(){
        request.getAllRequestsByStatus();
    }

    public void approveDenyRequest(){
        request.updateRequest();
    }
}
