package dev.danieltm.contactsapp.utilities

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.danieltm.contactsapp.models.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase: RoomDatabase() {

    abstract val dao: ContactDao
}