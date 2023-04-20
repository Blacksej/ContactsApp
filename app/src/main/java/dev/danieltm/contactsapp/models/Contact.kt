package dev.danieltm.contactsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Entity lets the code know that its a table we are defining
// You can specify tableName, foreignkeys and other things with @Entity(...)
@Entity
data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,

    // Setting primary key for our DB and telling Room to autogenerate the Id.
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
