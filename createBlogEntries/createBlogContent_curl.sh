#!/bin/sh

for (( i=1; i <= $1; i++ ))
	do
		curl http://localhost:8080/api/jsonws/blogs.blogsentry/add-entry \
		  -u test@liferay.com:test \
		  -d title="title$i" \
		  -d subtitle="subtitle$i" \
		  -d urlTitle='' \
		  -d description="description$i" \
		  -d content="content$i" \
		  -d displayDateMonth=1 \
		  -d displayDateDay=1 \
		  -d displayDateYear=1 \
		  -d displayDateHour=1 \
		  -d displayDateMinute=1 \
		  -d allowPingbacks=false \
		  -d allowTrackbacks=false \
		  -d trackbacks="[]" \
		  -d coverImageCaption='' \
		  -d -coverImageImageSelector= \
		  -d -smallImageImageSelector=
done



