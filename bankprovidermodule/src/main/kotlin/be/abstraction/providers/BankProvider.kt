package be.abstraction.providers

import be.abstraction.core.interfaces.IBankProvider
import be.abstraction.core.models.Bank

class BankProvider(var banks: List<Bank>) : IBankProvider {

    override fun getBanks(): List<Bank> {
        val bankNames = listOf( // todo: make json of each be.bank, for if we'd add fields in the future.
            "BNP Paribas",
            "ING",
            "KBC",
            "Europabank",
            "Beobank",
            "Belfius",
            "AXA",
            "Argenta"
        )

        banks = bankNames.map { Bank(it) }

        return banks
    }
}