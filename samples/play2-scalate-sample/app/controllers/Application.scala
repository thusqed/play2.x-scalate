package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index()=Action{implicit request=>
    Ok(views.html.hello())
  }

  def renderWithTemplate(templateName:String)=Action{implicit request =>
    Ok(Template.render("sample."+templateName,Map("values"->persons(10,"Sample","sample@corp.com").toList)))
  }


  def persons(nb:Int, name:String,email:String )=
    for (i <- (0 to nb))
    yield person(name+"_"+i,email+"_"+i)
  def person(name:String,email: String)=Map("name"->name,"email"->email)

}