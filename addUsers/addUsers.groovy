//Add i users with "Administrador" roles

companyId = com.liferay.portal.kernel.util.PortalUtil.getCompanyId(actionRequest)
userId = com.liferay.portal.kernel.util.PortalUtil.getUserId(actionRequest)
group = com.liferay.portal.kernel.service.GroupLocalServiceUtil.getGroup(companyId, "Guest");
groupId = group.getGroupId();

for (i =1; i < 11; i++) {
   boolean autoPassword = true;
   String password = "123";
   String screenName = i + "test";
   String emailAddress = i + "test@liferay.com";
   long facebookId = 0;
   String openId = "";
   String firstName = i + "test";
   String middleName = "";
   String lastName = "test" + i;
   long prefixId = 0;
   long suffixId = 0;
   boolean male = true;
   int birthdayMonth = 1;
   int birthdayDay = 1;
   int birthdayYear = 1970;
   String jobTitle = "";
   long[] organizationIds = null;
   long[] roleIds = null;
   long[] userGroupIds = null;
   boolean sendMail = false;
   long[] groudIds = [groupId];
   serviceContext = new com.liferay.portal.kernel.service.ServiceContext();
   serviceContext.setCompanyId(companyId);
   serviceContext.setUserId(userId);

   groupUser = com.liferay.portal.kernel.service.UserLocalServiceUtil.addUser(
       0L, companyId, autoPassword, password, password,
       false, screenName, emailAddress, facebookId,
       openId, java.util.Locale.US, firstName, middleName, lastName, prefixId, suffixId,
       male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groudIds,
       organizationIds, roleIds, userGroupIds, sendMail, serviceContext);

   role = com.liferay.portal.kernel.service.RoleLocalServiceUtil.getRole(companyId, "Administrator");

   long [] userIds = [groupUser.getUserId()];
   com.liferay.portal.kernel.service.UserLocalServiceUtil.addRoleUser(role.getRoleId(), groupUser);
   com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil.addUserGroupRoles(userIds, groupId, role.getRoleId());
}