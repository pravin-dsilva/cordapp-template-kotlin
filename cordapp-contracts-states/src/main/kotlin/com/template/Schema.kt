package com.template

import net.corda.core.schemas.MappedSchema
import net.corda.core.schemas.PersistentState
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

object MedicalSchema
object MedicalSchemaV1 : MappedSchema(
        schemaFamily = MedicalSchema.javaClass,
        version = 1,
        mappedTypes = listOf(PersistentMedicalState::class.java)) {

    @Entity
    @Table(name = "patient")
    class PersistentMedicalState(
            @Column(name = "patient_ehr", nullable = false)
            var ehr: Int
    ) : PersistentState()
}