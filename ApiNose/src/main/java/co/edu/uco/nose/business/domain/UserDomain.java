package co.edu.uco.nose.business.domain;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.BooleanHelper;
import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class UserDomain extends Domain{
		private String name;
		private IdTypeDomain idType;
		private String idNumber;
		private String firstName;
		private String secondName;
		private String firstLastName;
		private String secondLastName;
		private CityDomain city;
		private String email;
		private String phoneNumber;
		private boolean ConfirmedEmail;
		private boolean ConfirmedPhoneNumber;
		
		
		public UserDomain() {
			super(UUIDHelper.getUUIDHelper().getDefault());
			setName(TextHelper.getDefault());
			setIdType(IdTypeDomain.getDefault());
			setIdNumber(TextHelper.getDefault());
			setFirstName(TextHelper.getDefault());
			setSecondName(TextHelper.getDefault());
			setFirstLastName(TextHelper.getDefault());
			setSecondName(TextHelper.getDefault());
			setCity(CityDomain.getDefault());
			setEmail(TextHelper.getDefault());
			setPhoneNumber(TextHelper.getDefault());
			setConfirmedEmail(BooleanHelper.getDefault());
			setConfirmedPhoneNumber(BooleanHelper.getDefault());
		}
		
		public UserDomain (final UUID id) {
			super(id);
			setName(TextHelper.getDefault());
			setIdType(IdTypeDomain.getDefault());
			setIdNumber(TextHelper.getDefault());
			setFirstName(TextHelper.getDefault());
			setSecondName(TextHelper.getDefault());
			setFirstLastName(TextHelper.getDefault());
			setSecondName(TextHelper.getDefault());
			setCity(CityDomain.getDefault());
			setEmail(TextHelper.getDefault());
			setPhoneNumber(TextHelper.getDefault());
			setConfirmedEmail(BooleanHelper.getDefault());
			setConfirmedPhoneNumber(BooleanHelper.getDefault());			
		}

		public UserDomain(final UUID id, final String name, final IdTypeDomain idType, final String idNumber, final String firstName, 
				final String secondName, final String firstLastName, final String secondLastName, final CityDomain city, 
				final String email, final String phoneNumber, final  boolean confirmedEmail, final boolean confirmedPhoneNumber) {
			
			super(id);
			setName(name);
			setIdType(idType);
			setIdNumber(idNumber);
			setFirstName(firstName);
			setSecondName(secondName);
			setFirstLastName(firstLastName);
			setSecondName(secondLastName);
			setCity(city);
			setEmail(email);
			setPhoneNumber(phoneNumber);
			setConfirmedEmail(confirmedEmail);	
			setConfirmedPhoneNumber(confirmedPhoneNumber);
		}

		public String getName() {
			return name;
		}

		public void setName(final String name) {
			this.name = TextHelper.getDefaultWhithTrim(name);
		}
		
		public IdTypeDomain getIdType() {
			return idType;
		}

		public void setIdType(IdTypeDomain idType) {
			this.idType = idType;
		}

		public String getIdNumber() {
			return idNumber;
		}

		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}

		public String getFirstLastName() {
			return firstLastName;
		}

		public void setFirstLastName(String firstLastName) {
			this.firstLastName = firstLastName;
		}

		public String getSecondLastName() {
			return secondLastName;
		}

		public void setSecondLastName(String secondLastName) {
			this.secondLastName = secondLastName;
		}

		public CityDomain getCity() {
			return city;
		}

		public void setCity(CityDomain city) {
			this.city = city;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public boolean isConfirmedEmail() {
			return ConfirmedEmail;
		}

		public void setConfirmedEmail(boolean confirmedEmail) {
			ConfirmedEmail = confirmedEmail;
		}

		public boolean isConfirmedPhoneNumber() {
			return ConfirmedPhoneNumber;
		}

		public void setConfirmedPhoneNumber(boolean confirmedPhoneNumber) {
			ConfirmedPhoneNumber = confirmedPhoneNumber;
		}

		public static UserDomain getDefault() {
	        return new UserDomain();
	    }

	}

