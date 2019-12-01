//Approve ALL tasks of the current user

import com.liferay.portal.kernel.dao.orm.*
import com.liferay.portal.kernel.util.*
import com.liferay.portal.kernel.workflow.*
import java.util.*

companyId = PortalUtil.getCompanyId(actionRequest)

userId = PortalUtil.getUserId(actionRequest)

List<WorkflowTask> workflowTasks = new ArrayList<>()
        
workflowTasks.addAll(
    WorkflowTaskManagerUtil.getWorkflowTasksByUser(
        companyId, userId, false, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null))

for (WorkflowTask workflowTask : workflowTasks) {

    WorkflowTaskManagerUtil.completeWorkflowTask(
        companyId, userId, workflowTask.getWorkflowTaskId(), Constants.APPROVE, StringPool.BLANK, null);
}
