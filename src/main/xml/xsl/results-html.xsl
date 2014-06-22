<?xml version="1.0" encoding="UTF-8"?>
<!--
	cursus - Race series management program
	Copyright 2012-2014  Simon Arlott

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU Affero General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Affero General Public License for more details.

	You should have received a copy of the GNU Affero General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns:d="urn:oid:1.3.6.1.4.1.39777.1.0.1.0.1"
		xmlns:r="urn:oid:1.3.6.1.4.1.39777.1.0.1.2.1"
		xmlns:s="urn:oid:1.3.6.1.4.1.39777.1.0.1.1.1"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="urn:oid:1.3.6.1.4.1.39777.1.0.1.0.1 https://xsd.s85.org/urn/oid/1.3.6.1.4.1.39777.1.0.1.0.1
			urn:oid:1.3.6.1.4.1.39777.1.0.1.1.1 https://xsd.s85.org/urn/oid/1.3.6.1.4.1.39777.1.0.1.1.1
			urn:oid:1.3.6.1.4.1.39777.1.0.1.2.1 https://xsd.s85.org/urn/oid/1.3.6.1.4.1.39777.1.0.1.2.1"
		version="1.0" xml:lang="en">

	<xsl:output method="html" version="5.0" encoding="UTF-8" indent="yes"/>

	<xsl:variable name="flags" select="/r:cursus/r:flag"/>
	<xsl:variable name="classes" select="/r:cursus/r:class"/>

	<xsl:template match="s:seriesResults" mode="r:name"><xsl:value-of select="/s:cursus/d:series[@xml:id=current()/@series]/d:name"/></xsl:template>
	<xsl:template match="s:eventResults" mode="r:name"><xsl:value-of select="/s:cursus/d:series/d:events/d:event[@xml:id=current()/@event]/d:name"/></xsl:template>
	<xsl:template match="s:raceResults" mode="r:name"><xsl:value-of select="/s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=current()/@race]/d:name"/></xsl:template>

	<xsl:template match="s:seriesResults" mode="r:desc"><xsl:value-of select="/s:cursus/d:series[@xml:id=current()/@series]/d:description"/></xsl:template>
	<xsl:template match="s:eventResults" mode="r:desc"><xsl:value-of select="/s:cursus/d:series/d:events/d:event[@xml:id=current()/@event]/d:description"/></xsl:template>
	<xsl:template match="s:raceResults" mode="r:desc"><xsl:value-of select="/s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=current()/@race]/d:description"/></xsl:template>

	<xsl:template match="s:seriesResults" mode="r:class">series</xsl:template>
	<xsl:template match="s:eventResults" mode="r:class">event</xsl:template>
	<xsl:template match="s:raceResults" mode="r:class">race</xsl:template>

	<xsl:template match="s:seriesResults" mode="r:type">Overall</xsl:template>
	<xsl:template match="s:eventResults" mode="r:type">Event</xsl:template>
	<xsl:template match="s:raceResults" mode="r:type">Race</xsl:template>

	<xsl:template match="s:seriesResults" mode="r:index">series<xsl:value-of select="count(preceding-sibling::s:seriesResults)+1"/></xsl:template>
	<xsl:template match="s:eventResults" mode="r:index">event<xsl:value-of select="count(preceding-sibling::s:eventResults)+1"/></xsl:template>
	<xsl:template match="s:raceResults" mode="r:index">race<xsl:value-of select="count(preceding-sibling::s:raceResults)+1"/></xsl:template>

	<xsl:template match="d:event|d:race" mode="r:th">
		<span>
			<xsl:if test="d:description != ''">
				<xsl:attribute name="title">
					<xsl:apply-templates select="." mode="r:description"/>
				</xsl:attribute>
			</xsl:if>
			<xsl:apply-templates select="." mode="r:name"/>
		</span>
	</xsl:template>

	<xsl:template match="d:race" mode="r:name">
		<xsl:choose>
			<xsl:when test="$flags[@name='compact-race']">
				R<xsl:value-of select="count(preceding-sibling::d:race)+count(../../preceding-sibling::d:event/d:races/d:race)+1"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="d:name"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="d:event" mode="r:name">
		<xsl:choose>
			<xsl:when test="$flags[@name='compact-event']">
				E<xsl:value-of select="count(preceding-sibling::d:event[count(d:races/d:race)>0])+1"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="d:name"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="d:race" mode="r:description">
		<xsl:choose>
			<xsl:when test="$flags[@name='compact-race']">
				<xsl:value-of select="d:name"/> — <xsl:value-of select="d:description"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="d:description"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="d:event" mode="r:description">
		<xsl:choose>
			<xsl:when test="$flags[@name='compact-event']">
				<xsl:value-of select="d:name"/> — <xsl:value-of select="d:description"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="d:description"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="d:event|d:race" mode="r:penalty">
		<strong>
			<xsl:if test="d:description != ''">
				<xsl:attribute name="title">
					<xsl:value-of select="d:description"/>
				</xsl:attribute>
			</xsl:if>
			<xsl:value-of select="d:name"/>
		</strong>
	</xsl:template>

	<xsl:template match="s:seriesResults" mode="r:body">
		<xsl:apply-templates select="." mode="r:internal">
			<xsl:with-param name="name"><xsl:apply-templates select="." mode="r:name"/></xsl:with-param>
			<xsl:with-param name="desc"><xsl:apply-templates select="." mode="r:desc"/></xsl:with-param>
			<xsl:with-param name="class">series</xsl:with-param>
			<xsl:with-param name="type"><xsl:apply-templates select="." mode="r:type"/></xsl:with-param>
			<xsl:with-param name="events" select="s:seriesEventResults"/>
			<xsl:with-param name="races" select="s:seriesEventResults/s:eventRaceResults"/>
			<xsl:with-param name="parent"/>
		</xsl:apply-templates>
	</xsl:template>

	<xsl:template match="s:eventResults" mode="r:body">
		<xsl:apply-templates select="." mode="r:internal">
			<xsl:with-param name="name"><xsl:apply-templates select="." mode="r:name"/></xsl:with-param>
			<xsl:with-param name="desc"><xsl:apply-templates select="." mode="r:desc"/></xsl:with-param>
			<xsl:with-param name="class">event</xsl:with-param>
			<xsl:with-param name="type"><xsl:apply-templates select="." mode="r:type"/></xsl:with-param>
			<xsl:with-param name="events" select="."/>
			<xsl:with-param name="races" select="s:eventRaceResults"/>
			<xsl:with-param name="parent"/>
		</xsl:apply-templates>
	</xsl:template>

	<xsl:template match="s:raceResults" mode="r:body">
		<xsl:variable name="parent" select="/s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=current()/@race]/../.."/>
		<xsl:apply-templates select="." mode="r:internal">
			<xsl:with-param name="name"><xsl:apply-templates select="." mode="r:name"/></xsl:with-param>
			<xsl:with-param name="desc"><xsl:apply-templates select="." mode="r:desc"/></xsl:with-param>
			<xsl:with-param name="class">race</xsl:with-param>
			<xsl:with-param name="type"><xsl:apply-templates select="." mode="r:type"/></xsl:with-param>
			<xsl:with-param name="events" select="/.."/>
			<xsl:with-param name="races" select="."/>
			<xsl:with-param name="parent" select="$parent"/>
		</xsl:apply-templates>
	</xsl:template>

	<xsl:template match="s:seriesResults|s:eventResults|s:raceResults" mode="r:internal">
		<!-- Name of results -->
		<xsl:param name="name"/>
		<!-- Description of results -->
		<xsl:param name="desc"/>
		<!-- Class of results -->
		<xsl:param name="class"/>
		<!-- Type of results -->
		<xsl:param name="type"/>
		<!-- Set of event results -->
		<xsl:param name="events"/>
		<!-- Set of event/race results -->
		<xsl:param name="races"/>
		<!-- Parent of these results -->
		<xsl:param name="parent"/>

		<!-- Output laps if these are race results -->
		<xsl:variable name="laps" select="count($events) = 0"/>
		<!-- Determine if there are any penalties -->
		<xsl:variable name="penalties" select="sum(s:overallOrder/s:overallScore/@penalties) > 0"/>
		<!-- Show did not participate column -->
		<xsl:variable name="dnp" select="$penalties and $class = 'series' and s:overallOrder/s:overallScore/d:penalty[@type = 'EVENT_NON_ATTENDANCE']"/>
		<!-- Determine if there are any penalties -->
		<xsl:variable name="notes" select="($class != 'series' and ($penalties or /s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=$races/@race]/d:raceAttendee/d:penalty)) or (not($dnp) and s:overallOrder/s:overallScore/d:penalty) or ($dnp and s:overallOrder/s:overallScore/d:penalty[@type != 'EVENT_NON_ATTENDANCE'])"/>

		<h1><xsl:value-of select="$name"/></h1>
		<table>
			<xsl:attribute name="class">results <xsl:value-of select="$class"/></xsl:attribute>
			<thead>
				<tr>
					<th class="type" colspan="2"><xsl:value-of select="$type"/></th>
					<xsl:if test="$classes">
						<th class="classes"><xsl:attribute name="colspan"><xsl:value-of select="count($classes)"/></xsl:attribute>Classes</th>
					</xsl:if>
					<td></td>

					<!-- Output all the events -->
					<xsl:for-each select="$events">
						<th class="event">
								<xsl:attribute name="colspan">
									<xsl:value-of select="count(s:eventRaceResults)"/>
								</xsl:attribute>
								<xsl:apply-templates select="/s:cursus/d:series/d:events/d:event[@xml:id=current()/@event]" mode="r:th"/>
						</th>
					</xsl:for-each>

					<!-- Padding on top row -->
					<th>
						<xsl:attribute name="class">
							<xsl:choose>
								<xsl:when test="$parent">parent</xsl:when>
								<xsl:otherwise>pad</xsl:otherwise>
							</xsl:choose>
						</xsl:attribute>
						<xsl:attribute name="colspan">
							<xsl:choose>
								<!-- If these are not race results, extra padding is required for the race/laps columns -->
								<xsl:when test="$laps"><xsl:value-of select="count($races) * 2 + number($penalties) + number($dnp) + number($notes) + 2"/></xsl:when>
								<xsl:otherwise><xsl:value-of select="@discards + number($penalties) + number($dnp) + number($notes) + 2"/></xsl:otherwise>
							</xsl:choose>
						</xsl:attribute>
						<xsl:if test="$parent">
							<xsl:apply-templates select="$parent" mode="r:th"/>
						</xsl:if>
					</th>
				</tr>
				<tr>
					<th class="pos left">Position</th>
					<th class="pilot name">Name</th>
					<xsl:for-each select="$classes">
						<th class="class"><xsl:value-of select="r:output"/></th>
					</xsl:for-each>
					<th class="pilot num">Race <abbr title="Number">No.</abbr></th>

					<!-- Output all the races -->
					<xsl:for-each select="$races">
						<th class="race">
							<xsl:apply-templates select="/s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=current()/@race]" mode="r:th"/>
						</th>
						<xsl:if test="$laps">
							<th class="laps">Laps</th>
						</xsl:if>
					</xsl:for-each>

					<!-- Output discards columns if there are any discards -->
					<xsl:if test="not($laps) and @discards > 0">
						<th class="dis"><xsl:attribute name="colspan"><xsl:value-of select="@discards"/></xsl:attribute>Discards</th>
					</xsl:if>

					<!-- Output penalties column if there are any penalties -->
					<xsl:if test="$penalties">
						<th class="pen"><abbr title="Penalties">Pen</abbr></th>
						<xsl:if test="$dnp">
							<th class="dnp"><abbr title="Did not participate">DNP</abbr></th>
						</xsl:if>
					</xsl:if>

					<th class="pts">Points</th>
					<th class="pos right">Position</th>

					<xsl:if test="$notes">
						<th class="notes"></th>
					</xsl:if>
				</tr>
			</thead>
			<tbody>
				<xsl:for-each select="s:overallOrder/s:overallScore">
						<!-- Keep a reference to the current pilot's classes while looping through $classes -->
						<xsl:variable name="zPilotClasses" select="/s:cursus/d:series/d:pilots/d:pilot[@xml:id=current()/@pilot]/d:member"/>
						<!-- Count the people with the same position and use it to add a "=" -->
						<xsl:variable name="joint" select="count(../s:overallScore[@position=current()/@position]) > 1"/>

						<tr>
							<th class="pos left"><xsl:value-of select="@position"/><xsl:if test="$joint">=</xsl:if></th>
							<td class="pilot name"><xsl:value-of select="/s:cursus/d:series/d:pilots/d:pilot[@xml:id=current()/@pilot]/d:name"/></td>
							<xsl:for-each select="$classes">
								<td class="pilot class">
									<xsl:if test="$zPilotClasses[@class=/s:cursus/d:series/d:classes/d:class[d:name=current()/r:name]/@xml:id]">*</xsl:if>
								</td>
							</xsl:for-each>
							<td class="pilot num"><xsl:value-of select="/s:cursus/d:series/d:pilots/d:pilot[@xml:id=current()/@pilot]/d:raceNumber/@organisation"/><xsl:text> </xsl:text><xsl:value-of select="format-number(number(/s:cursus/d:series/d:pilots/d:pilot[@xml:id=current()/@pilot]/d:raceNumber/@number), '000')"/></td>

							<!-- For each race score for this pilot -->
							<xsl:for-each select="$races/s:raceOrder/s:raceScore[@pilot=current()/@pilot]">
								<td>
									<xsl:attribute name="class" xml:space="preserve">race pts <xsl:if test="@simulated = 'true'">sim</xsl:if> <xsl:if test="@discarded = 'true'">dis</xsl:if></xsl:attribute>
									<xsl:value-of select="@points"/>
								</td>
								<xsl:if test="$laps">
									<td class="race laps"><xsl:value-of select="@laps"/></td>
								</xsl:if>
							</xsl:for-each>

							<!-- For each discarded race -->
							<xsl:for-each select="s:discard">
								<!-- Find the results for the race referenced by the discard and then find the points for that pilot -->
								<td class="dis"><xsl:value-of select="../../..//s:eventRaceResults[@race=current()/@race]/s:raceOrder/s:raceScore[@pilot=current()/../@pilot]/@points"/></td>
							</xsl:for-each>

							<!-- Output penalties column if there are any penalties -->
							<xsl:if test="$penalties">
								<xsl:choose>
									<xsl:when test="$dnp">
										<!-- Count of DNP penalties -->
										<xsl:variable name="dnpCount" select="sum(d:penalty[@type = 'EVENT_NON_ATTENDANCE']/@value)"/>

										<td class="over pen"><xsl:value-of select="@penalties - $dnpCount"/></td>
										<td class="over dnp"><xsl:value-of select="$dnpCount"/></td>
									</xsl:when>
									<xsl:otherwise><td class="over pen"><xsl:value-of select="@penalties"/></td></xsl:otherwise>
								</xsl:choose>
							</xsl:if>

							<td class="over pts"><xsl:value-of select="@points"/></td>
							<!-- Count the people with the same position and use it to add a "=" -->
							<th class="pos right"><xsl:value-of select="@position"/><xsl:if test="$joint">=</xsl:if></th>

							<xsl:if test="$notes">
								<td class="notes">
									<xsl:choose>
										<xsl:when test="$dnp">
											<xsl:variable name="simuPenalties" select="d:penalty[@type != 'EVENT_NON_ATTENDANCE']"/>
											<!-- If DNP then this is a series, so we don't show real penalties -->
											<xsl:if test="$simuPenalties">
												<ul class="pen">
													<xsl:for-each select="$simuPenalties">
														<xsl:apply-templates select="." mode="r:internal">
															<xsl:with-param name="name"/>
														</xsl:apply-templates>
													</xsl:for-each>
												</ul>
											</xsl:if>
										</xsl:when>
										<xsl:otherwise>
											<xsl:variable name="realPenalties" select="/s:cursus/d:series/d:events/d:event/d:races/d:race[@xml:id=$races/@race]/d:raceAttendee[@pilot=current()/@pilot]/d:penalty"/>
											<xsl:variable name="simuPenalties" select="d:penalty"/>
											<xsl:if test="($realPenalties and $class != 'series') or $simuPenalties">
												<ul class="pen">
													<xsl:if test="$class != 'series'">
														<xsl:for-each select="$realPenalties">
															<xsl:apply-templates select="." mode="r:internal">
																<xsl:with-param name="race" select="current()/../.."/>
															</xsl:apply-templates>
														</xsl:for-each>
													</xsl:if>
													<xsl:for-each select="$simuPenalties">
														<xsl:apply-templates select="." mode="r:internal">
															<xsl:with-param name="race"/>
														</xsl:apply-templates>
													</xsl:for-each>
												</ul>
											</xsl:if>
										</xsl:otherwise>
									</xsl:choose>
								</td>
							</xsl:if>
						</tr>
					</xsl:for-each>
			</tbody>
			<xsl:if test="$desc != ''">
				<caption><xsl:value-of select="$desc"/></caption>
			</xsl:if>
		</table>
	</xsl:template>

	<xsl:template match="d:penalty" mode="r:internal">
		<xsl:param name="race"/>
		<xsl:variable name="absvalue" select="@value * (@value >= 0) - @value * (@value &lt; 0)"/>

		<li>
			<xsl:if test="$race"><xsl:apply-templates select="$race" mode="r:penalty"/>: </xsl:if>
			<xsl:choose>
				<xsl:when test="@type = 'EVENT_NON_ATTENDANCE'">Did not attend <strong><xsl:value-of select="d:reason"/></strong></xsl:when>
				<xsl:otherwise><xsl:value-of select="d:reason"/></xsl:otherwise>
			</xsl:choose>
			<xsl:text> (</xsl:text>
			<xsl:choose>
				<xsl:when test="@type = 'AUTOMATIC'">
					<xsl:value-of select="@value"/> penalt<xsl:choose><xsl:when test="$absvalue = 1">y</xsl:when><xsl:otherwise>ies</xsl:otherwise></xsl:choose>
				</xsl:when>
				<xsl:when test="@type = 'FIXED'">
					<xsl:value-of select="@value"/> point<xsl:if test="$absvalue != 1">s</xsl:if>
				</xsl:when>
				<xsl:when test="@type = 'CANCEL_LAPS'">
					<xsl:value-of select="$absvalue"/> lap<xsl:if test="$absvalue != 1">s</xsl:if><xsl:choose><xsl:when test="@value > 0"> cancelled</xsl:when><xsl:otherwise> readmitted</xsl:otherwise></xsl:choose>
				</xsl:when>
				<xsl:when test="@type = 'ADJUST_LAPS'">
					<xsl:value-of select="$absvalue"/> lap<xsl:if test="$absvalue != 1">s</xsl:if><xsl:choose><xsl:when test="@value > 0"> added</xsl:when><xsl:otherwise> removed</xsl:otherwise></xsl:choose>
				</xsl:when>
				<xsl:when test="@type = 'EVENT_NON_ATTENDANCE'">
					<xsl:value-of select="@value"/> point<xsl:if test="$absvalue != 1">s</xsl:if>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="@value"/><xsl:text> </xsl:text><xsl:value-of select="@type"/>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:text>)</xsl:text>
		</li>
	</xsl:template>
</xsl:stylesheet>
