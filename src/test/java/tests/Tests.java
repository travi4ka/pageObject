package tests;

import org.junit.jupiter.api.Test;

public class Tests extends TestsBase {
    @Test
    public void fillOutForm() {
        String
                nameFirst = "nameFirst",
                nameLast = "nameLast",
                email = "hello@world.com",
                gender = "Female",
                phone = "1234567890",
                subject1 = "Maths",
                subject2 = "Arts",
                hobby = "Music",
                pictureName = "ws_Hidden_Sun_&_Wheat_Field_640x960.jpg",
                currentAddress = "currentAddress",
                birthDateYear = "1990",
                birthDateMonth = "October",
                birthDateDay = "20",
                state = "Haryana",
                city = "Panipat";

        automationPracticeFormPage
                .openPage()
                .setUserFirstNameInput(nameFirst)
                .setUserLastNameInput(nameLast)
                .setUserEmailInput(email)
                .setUserPhoneInput(phone)
                .setUserGenderSection(gender)
                .setUserBOD(birthDateDay, birthDateMonth, birthDateYear)
                .setSubjects(subject1, subject2)
                .setHobbies(hobby)
                .setImage(pictureName)
                .setCurrentAddressInput(currentAddress)
                .setState(state)
                .setCity(city)
                .clickSubmitButton()
                .verifyTableValues("Student Name", nameFirst + " " + nameLast)
                .verifyTableValues("Student Email", email)
                .verifyTableValues("Gender", gender)
                .verifyTableValues("Mobile", phone)
                .verifyTableValues("Date of Birth", birthDateDay + " " + birthDateMonth + "," + birthDateYear)
                .verifyTableValues("Hobbies", hobby)
                .verifyTableValues("Picture", pictureName)
                .verifyTableValues("Address", currentAddress)
                .verifyTableValues("State and City", state + " " + city)
                .verifyTableValues("Subjects", subject1 + ", " + subject2);
    }
}
