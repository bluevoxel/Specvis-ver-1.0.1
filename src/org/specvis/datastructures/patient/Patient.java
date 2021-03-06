package org.specvis.datastructures.patient;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Piotr Dzwiniel on 2016-02-09.
 */

/*
 * Copyright from 2014 till now - Piotr Dzwiniel
 *
 * This file is part of Specvis.
 *
 * Specvis is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * Specvis is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Specvis; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

public class Patient {

    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private int age;
    private String phone;
    private String email;
    private String city;
    private String postalCode;
    private String visualAcuityL;
    private String visualAcuityR;
    private String additionalInformation;

    private String testedEye;

    // Main results.
    private ArrayList<String> resultsInfo;
    private double[][] resultsData;
    private PatientResults patientResults;

    // Results chosen to compare.
    private ArrayList<String> resultsInfoToCompare;
    private double[][] resultsDataToCompare;
    private PatientResults patientResultsToCompare;

    private String settingsName;

    public Patient() {

    }

    public Patient(String id, String firstName, String lastName, String gender, LocalDate dateOfBirth, int age, String phone, String email, String city, String postalCode, String visualAcuityL, String visualAcuityR, String additionalInformation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.postalCode = postalCode;
        this.visualAcuityL = visualAcuityL;
        this.visualAcuityR = visualAcuityR;
        this.additionalInformation = additionalInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getVisualAcuityL() {
        return visualAcuityL;
    }

    public void setVisualAcuityL(String visualAcuityL) {
        this.visualAcuityL = visualAcuityL;
    }

    public String getVisualAcuityR() {
        return visualAcuityR;
    }

    public void setVisualAcuityR(String visualAcuityR) {
        this.visualAcuityR = visualAcuityR;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getTestedEye() {
        return testedEye;
    }

    public void setTestedEye(String testedEye) {
        this.testedEye = testedEye;
    }

    public ArrayList<String> getResultsInfo() {
        return resultsInfo;
    }

    public void setResultsInfo(ArrayList<String> resultsInfo) {
        this.resultsInfo = resultsInfo;
    }

    public double[][] getResultsData() {
        return resultsData;
    }

    public void setResultsData(double[][] resultsData) {
        this.resultsData = resultsData;
    }

    public PatientResults getPatientResults() {
        return patientResults;
    }

    public void setPatientResults(PatientResults patientResults) {
        this.patientResults = patientResults;
    }

    public ArrayList<String> getResultsInfoToCompare() {
        return resultsInfoToCompare;
    }

    public void setResultsInfoToCompare(ArrayList<String> resultsInfoToCompare) {
        this.resultsInfoToCompare = resultsInfoToCompare;
    }

    public double[][] getResultsDataToCompare() {
        return resultsDataToCompare;
    }

    public void setResultsDataToCompare(double[][] resultsDataToCompare) {
        this.resultsDataToCompare = resultsDataToCompare;
    }

    public PatientResults getPatientResultsToCompare() {
        return patientResultsToCompare;
    }

    public void setPatientResultsToCompare(PatientResults patientResultsToCompare) {
        this.patientResultsToCompare = patientResultsToCompare;
    }

    public String getSettingsName() {
        return settingsName;
    }

    public void setSettingsName(String settingsName) {
        this.settingsName = settingsName;
    }

    public static String[] getFieldsNames() {
        Field[] fields = Patient.class.getDeclaredFields();
        String[] fieldsNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldsNames[i] = fields[i].getName();
        }
        return fieldsNames;
    }
}
