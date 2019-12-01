<b>Q: Do I need to do something on Liferay Portal?</b><br>
A: Yes. Associate Single Approver process (or a copy of it) with Blog Entry

<b>Q: How to execute the groovy scripts?</b><br>
A: Go to Liferay Portal > Control Panel > Server Administration > Script, paste the script there and click on Execute.

<b>Q: How to use createBlogContent_curl.sh</b><br>
A: bash createBlogContent_curl.sh (number_of_instances)

<b>List of scripts:</b>

<ins><b>ADD USERS</b>

<b>addUsers.groovy</b>
  - Adds i users with "Administrador" roles

<b>addUsersWithRoles.groovy</b>
  - Adds i users with i roles

<ins><b>ASSIGN TASKS</b>

<b>AssignOpenTasksToCurrentUserAndAndComplete.groovy</b>
  - Assignes all eligible open tasks to the current user and complete them all

<b>AssignOpenTasksToUsers.groovy</b>
  - Assignes ALL open tasks to available users. The script assignes 1 task per user until the tasks are finished. 

<b>AssignTasksToCurrentUser.groovy</b>
  - Assignes all eligible tasks to the current user

<ins><b>COMPLETE TASKS</b>

<b>CompleteTasksAssignedToCurrentUser.groovy</b>
  - Approves ALL tasks of the current user

<b>CompleteTasksAssignedToUsers.groovy</b>
  - Completes ALL open tasks from ALL users 

<b>RejectTasksFromCurrentUser.groovy</b>
  - Rejects ALL tasks Assigned to the current user

<b>ResubmitTasksFromCurrentUser.groovy</b>
  - Resubmits ALL tasks of the current user

<ins><b>CREATE BLOG ENTRIES</b>

<b>createBlogContent_curl.sh</b>
  - Creates $1 blog instances

<b>createBlogs.groovy</b>
  - Creates i blogs

<ins><b>FULL WORKFLOW PROCESS</b>

<b>fullWorkflow.groovy</b>
  - Creates i user with i role, 1 blog per user, assign 1 task per user and complete it





