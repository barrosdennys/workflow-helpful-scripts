//Create i blogs

import com.liferay.portal.kernel.dao.orm.*
import com.liferay.portal.kernel.model.*
import com.liferay.portal.kernel.service.*
import com.liferay.portal.kernel.test.util.*
import com.liferay.portal.kernel.util.*
import com.liferay.portal.kernel.workflow.*
import com.liferay.blogs.service.*
import java.util.*

companyId = PortalUtil.getCompanyId(actionRequest)

group = GroupServiceUtil.getCompanyGroup(companyId)

userId = PortalUtil.getUserId(actionRequest)

ServiceContext serviceContext = new ServiceContext()

serviceContext.setCompanyId(companyId)
serviceContext.setScopeGroupId(group.getGroupId())
serviceContext.setUserId(userId)

for (int i = 0; i <= 10; i++) {
    BlogsEntryLocalServiceUtil.addEntry(
        userId, "Blog " + i, "Blog "+ i, serviceContext)    
}