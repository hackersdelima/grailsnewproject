import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_contact_contactlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/contact/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
for( contact in (contacts) ) {
printHtmlPart(5)
expressionOut.print(contact.name)
printHtmlPart(6)
expressionOut.print(contact.phoneNumber)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',11,['action':("edit"),'id':(contact.id)],3)
printHtmlPart(7)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',13,['action':("delete"),'id':(contact.id)],3)
printHtmlPart(10)
}
printHtmlPart(1)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',15,['action':("create")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',16,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1514692489304L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
