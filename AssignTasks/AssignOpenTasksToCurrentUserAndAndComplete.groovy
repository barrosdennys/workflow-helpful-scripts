//Assign all eligible open tasks to the current user and complete them all

import com.liferay.portal.kernel.dao.orm.*
import com.liferay.portal.kernel.util.*
import com.liferay.portal.kernel.workflow.*
import java.util.*

companyId = PortalUtil.getCompanyId(actionRequest)

userId = PortalUtil.getUserId(actionRequest)

List<WorkflowTask> workflowTasks = new ArrayList<>()

workflowTasks.addAll(
    WorkflowTaskManagerUtil.getWorkflowTasksByUserRoles(
        companyId, userId, false, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null))
        
workflowTasks.addAll(
    WorkflowTaskManagerUtil.getWorkflowTasksByUser(
        companyId, userId, false, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null))

for (WorkflowTask workflowTask : workflowTasks) {
    WorkflowTaskManagerUtil.assignWorkflowTaskToUser(
        companyId, userId, workflowTask.getWorkflowTaskId(), userId, StringPool.BLANK, null, null)

    WorkflowTaskManagerUtil.completeWorkflowTask(
        companyId, userId, workflowTask.getWorkflowTaskId(), Constants.APPROVE, StringPool.BLANK, null);
}


