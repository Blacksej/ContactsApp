package dev.danieltm.contactsapp.utilities

import dev.danieltm.contactsapp.models.Contact

sealed interface ContactEvent {
    // Good way of handling event regarding the contact screen
    object SaveContact: ContactEvent

    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent

    object ShowDialog: ContactEvent
    object HideDialog: ContactEvent

    data class SortContacts(val sortType: SortType): ContactEvent
    data class DeleteContact(val contact: Contact): ContactEvent
}