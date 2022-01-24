package com.revature.controllers;

import com.revature.services.FinanceManagerService;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class FinanceManagerController extends Controller{

    private FinanceManagerService fmService = new FinanceManagerService();

    Handler viewAllReimbursementRequests = (ctx) -> {};

    Handler filterRequestsByStatus = (ctx) -> {};

    Handler approveDenyRequest = (ctx) -> {};

    @Override
    public void addRoutes(Javalin app) {

    }
}
