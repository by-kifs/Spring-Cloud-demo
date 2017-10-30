package com.example.demo.vo;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by cys on 2017/7/11.
 */
public class HzsUBUser {
    private int ubuserId;
    private int organizationId;
    private int tenantId;
    private String userPassword;
    private String secretQuestion;
    private String secretAnswer;
    private String firstName;
    private String middleName;
    private String lastName;
    private int gender;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfJoining;

    private String email;
    private String phoneNumber;
    private String cellNumber;
    private String userAddress;
    private String city;
    private int countryId;
    private String profileImagePath;
    private int userThemeId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastLogOn;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastPasswordChange;

    private boolean changePasswordOnLogon;
    private boolean isDeleted;
    private int userStatus;
    private int activeRoleId;
    private String jobTitle;
    private String interests;
    private String fullName;
    private boolean isSocialUser;
    private String username;
    private int indexFailOver;
    private String companyName;
    private String companyWebsite;
    private String userRoleTitles;
    private boolean isLearner;
    private int cityId;
    private int schoolId;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUbuserId() {
        return ubuserId;
    }

    public void setUbuserId(int ubuserId) {
        this.ubuserId = ubuserId;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
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

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public int getUserThemeId() {
        return userThemeId;
    }

    public void setUserThemeId(int userThemeId) {
        this.userThemeId = userThemeId;
    }

    public Date getDateLastLogOn() {
        return dateLastLogOn;
    }

    public void setDateLastLogOn(Date dateLastLogOn) {
        this.dateLastLogOn = dateLastLogOn;
    }

    public Date getDateLastPasswordChange() {
        return dateLastPasswordChange;
    }

    public void setDateLastPasswordChange(Date dateLastPasswordChange) {
        this.dateLastPasswordChange = dateLastPasswordChange;
    }

    public boolean isChangePasswordOnLogon() {
        return changePasswordOnLogon;
    }

    public void setChangePasswordOnLogon(boolean changePasswordOnLogon) {
        this.changePasswordOnLogon = changePasswordOnLogon;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public int getActiveRoleId() {
        return activeRoleId;
    }

    public void setActiveRoleId(int activeRoleId) {
        this.activeRoleId = activeRoleId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isSocialUser() {
        return isSocialUser;
    }

    public void setSocialUser(boolean socialUser) {
        isSocialUser = socialUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIndexFailOver() {
        return indexFailOver;
    }

    public void setIndexFailOver(int indexFailOver) {
        this.indexFailOver = indexFailOver;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getUserRoleTitles() {
        return userRoleTitles;
    }

    public void setUserRoleTitles(String userRoleTitles) {
        this.userRoleTitles = userRoleTitles;
    }

    public boolean isLearner() {
        return isLearner;
    }

    public void setLearner(boolean learner) {
        this.isLearner = learner;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
}
