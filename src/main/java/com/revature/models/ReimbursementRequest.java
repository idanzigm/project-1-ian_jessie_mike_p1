package com.revature.models;

import java.util.Objects;

public class ReimbursementRequest {
    private int reimbursementID;
    private int amount;
    private String submitted;
    private String resolved;
    private String description;
    private String receipt;
    private String author;
    private String resolver;
    private String statusID;
    private String typeID;

    public ReimbursementRequest() {
    }

    public ReimbursementRequest(int reimbursementID, int amount, String submitted, String resolved, String description, String receipt, String author, String resolver, String statusID, String typeID) {
        this.reimbursementID = reimbursementID;
        this.amount = amount;
        this.submitted = submitted;
        this.resolved = resolved;
        this.description = description;
        this.receipt = receipt;
        this.author = author;
        this.resolver = resolver;
        this.statusID = statusID;
        this.typeID = typeID;
    }

    public int getReimbursementID() {
        return reimbursementID;
    }

    public void setReimbursementID(int reimbursementID) {
        this.reimbursementID = reimbursementID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResolver() {
        return resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReimbursementRequest)) return false;
        ReimbursementRequest that = (ReimbursementRequest) o;
        return getReimbursementID() == that.getReimbursementID() && getAmount() == that.getAmount() && getSubmitted().equals(that.getSubmitted()) && getResolved().equals(that.getResolved()) && getDescription().equals(that.getDescription()) && getReceipt().equals(that.getReceipt()) && getAuthor().equals(that.getAuthor()) && getResolver().equals(that.getResolver()) && getStatusID().equals(that.getStatusID()) && getTypeID().equals(that.getTypeID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReimbursementID(), getAmount(), getSubmitted(), getResolved(), getDescription(), getReceipt(), getAuthor(), getResolver(), getStatusID(), getTypeID());
    }

    @Override
    public String toString() {
        return "ReimbursementRequest{" +
                "reimbursementID=" + reimbursementID +
                ", amount=" + amount +
                ", submitted='" + submitted + '\'' +
                ", resolved='" + resolved + '\'' +
                ", description='" + description + '\'' +
                ", receipt='" + receipt + '\'' +
                ", author='" + author + '\'' +
                ", resolver='" + resolver + '\'' +
                ", statusID='" + statusID + '\'' +
                ", typeID='" + typeID + '\'' +
                '}';
    }
}
