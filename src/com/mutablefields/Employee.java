package com.mutablefields;

public final class Employee {
	private final int employee_id;
	private final String employee_name;
	private final Address address;

	public Employee(int employee_id, String employee_name, Address address) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;

		Address dummyadd1 = new Address();
		dummyadd1.setCity(address.getCity());
		dummyadd1.setCountry(address.getCountry());
		dummyadd1.setPin(address.getPin());

		this.address = dummyadd1;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public Address getAddress() {

		Address dummyadd2 = new Address();

		dummyadd2.setCity(this.address.getCity());
		dummyadd2.setCountry(this.address.getCountry());
		dummyadd2.setPin(this.address.getPin());

		return dummyadd2;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", address=" + address
				+ "]";
	}

}
