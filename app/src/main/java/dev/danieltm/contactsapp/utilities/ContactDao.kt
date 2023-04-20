package dev.danieltm.contactsapp.utilities

import androidx.room.*
import dev.danieltm.contactsapp.models.Contact
import kotlinx.coroutines.flow.Flow

// Data Access Object: An interface with all the functions we need to be able
// to modify our contact table.
@Dao
interface ContactDao {

    // You can use @Insert to let Room know we wanna insert in the table
    // You can also use @Upsert for inserting AND updating. So if a contact with the same
    // ID exists, it will then instead update the contact.
    @Upsert
    suspend fun upsertContact(contact: Contact)

    // Tells room to delete contact
    @Delete
    suspend fun deleteContact(contact: Contact)



    // QUERIES

    // Flow will make sure to notify us when there is a change in the table
    // So if we insert a new contact, the List<Contact> will then return the new List
    // with the newly added contact

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getContactsOrderedByFirstName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getContactsOrderedByLastName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>

}