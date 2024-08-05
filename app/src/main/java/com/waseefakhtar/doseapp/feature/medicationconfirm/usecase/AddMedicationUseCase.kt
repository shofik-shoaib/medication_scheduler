package com.waseefakhtar.doseapp.feature.medicationconfirm.usecase

import com.waseefakhtar.doseapp.domain.model.Medication
import com.waseefakhtar.doseapp.domain.repository.MedicationRepository
import javax.inject.Inject

class AddMedicationUseCase @Inject constructor(
    private val repository: MedicationRepository
) {
    suspend fun addMedication(medications: List<Medication>) {
        repository.insertMedications(medications)
    }
}
