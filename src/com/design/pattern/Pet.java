package com.design.pattern;

public class Pet {
	private final String animal;
	private final String petName;
	private final String ownerName;
	private final String address;
	private final String telephone;
	private final String dateOfBirth; // optional
	private final String emailAddress; // optional

	private Pet(final String animal, final String petName, final String ownerName, final String address,
			final String telephone, final String dateOfBirth, final String emailAddress) {
		this.animal = animal;
		this.petName = petName;
		this.ownerName = ownerName;
		this.address = address;
		this.telephone = telephone;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
	}

		public static class Builder {
			private String animal;
			private String petName;
			private String ownerName;
			private String address;
			private String telephone;
			private String dateOfBirth;
			private String emailAddress;

			public Builder withAnimal(final String animal) {
				this.animal = animal;
				return this;
			}

			public Builder withPetName(final String petName) {
				this.petName = petName;
				return this;
			}

			public Builder withOwnerName(final String ownerName) {
				this.ownerName = ownerName;
				return this;
			}

			public Builder withAddress(final String address) {
				this.address = address;
				return this;
			}

			public Builder withTelephone(final String telephone) {
				this.telephone = telephone;
				return this;
			}

			public Builder withDateOfBirth(final String dateOfBirth) {
				this.dateOfBirth = dateOfBirth;
				return this;
			}

			public Builder withEmailAddress(final String emailAddress) {
				this.emailAddress = emailAddress;
				return this;
			}

			Pet build() {
				if (animal == null || petName == null || ownerName == null || address == null || 
						telephone == null) {
					throw new IllegalStateException("Cannot create Pet");
				}
				return new Pet(animal, petName, ownerName, address, telephone, dateOfBirth,
						emailAddress);
			}
		}
	}
