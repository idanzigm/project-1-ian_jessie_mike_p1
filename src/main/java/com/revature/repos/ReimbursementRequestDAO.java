package com.revature.repos;

public interface ReimbursementRequestDAO {
    // =============== Employee ================
    public void getEmployeeRequests();
    public void addRequest();

    // =============== Finance Manager ================
    public void getAllRequests();
    public void getAllRequestsByStatus();
    public void updateRequest();
}
