package prj;

public class Account1 {
	private String owner;
	private long balance;

	public Account1(String owner) {
		this.owner = owner;
	}

	public Account1(long balance) {
		this.balance = balance;
	}

	public Account1(String owner, long balance) {
		this(owner);
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());

	}
}