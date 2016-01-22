<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/CONTRACT">
			<Head>
				<APPLICANTNO>
					<xsl:apply-templates select="HEAD/APPLICANTNO"/>
				</APPLICANTNO>
			</Head>
	</xsl:template>
</xsl:stylesheet>