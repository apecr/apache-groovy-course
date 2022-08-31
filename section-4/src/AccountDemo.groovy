class Account{
    BigDecimal balance = 0
    String type

    BigDecimal deposit(BigDecimal quantity){
        this.balance += quantity
        return this.balance
    }

    BigDecimal withdraw(BigDecimal withdrawal){
        this.balance -= withdrawal
        return this.balance
    }

    BigDecimal plus(Account incrementAccount){
        this.balance + incrementAccount.balance
    }
}

Account checking = new Account(type:"Checking")
assert 100.00 == checking.deposit(100.00)
Account savings = new Account(type:"Savings")
assert 50.00 == savings.deposit(50.00)

assert 30.00 == savings.withdraw(20.00)

BigDecimal total = checking + savings
assert total == 130.00