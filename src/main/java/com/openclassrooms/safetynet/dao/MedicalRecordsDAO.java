package com.openclassrooms.safetynet.dao;

import com.openclassrooms.safetynet.model.MedicalRecord;


import java.util.List;

public interface MedicalRecordsDAO {

    public List<MedicalRecord> getAllMedicalRecords();

    public void setAllMedicalRecords(List<MedicalRecord> listMedicalRecord);


    MedicalRecord getMedicalRecords(String firstName, String lastName);

    Boolean deleteMedicalRecords(String firstName, String lastName);

    MedicalRecord modifyMedicalRecords(MedicalRecord medicalRecord);

    MedicalRecord addMedicalRecords(MedicalRecord medicalRecord);
}
