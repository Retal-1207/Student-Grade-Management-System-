/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanageproject;

import java.io.Serializable;
/**
 * Student Management System
 * Team Members:
 * - Name: Retal Alkabawi
 * - Name: Safaa Ahmed Sobh
 * - Name: Wasn Hussien Alwafi
 * Group: 8
 */

/**
 * Model class representing a student
 */
public class Students implements Serializable {

    // Student name
    String name;
    // Student ID
    int ID;
    // Student grade
    double score;

    /**
     * Create a new student object
     */
    public Students(String name, int ID) {
        this.name = name;
        this.ID = ID;

        // Initialize grade with zero
        this.score = 0;
    }

    /**
     * Return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Update student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return student ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Update student ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Return student grade
     */
    public double getScore() {
        return score;
    }

    /**
     * Update student grade
     */
    public void setScore(double score) {
        this.score = score;
    }

}
