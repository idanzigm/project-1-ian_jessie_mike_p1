package com.revature.controllers;

import com.revature.services.EmployeeService;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class EmployeeController extends Controller{

    EmployeeService employeeService = new EmployeeService();

    Handler viewPastTickets = (ctx) -> {};

    Handler ReimbursementRequest = (ctx) -> {};

    @Override
    public void addRoutes(Javalin app) {

    }
}
