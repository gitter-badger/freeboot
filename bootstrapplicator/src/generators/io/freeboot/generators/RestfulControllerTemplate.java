package io.freeboot.generators;

import io.freeboot.generators.models.*;

public class RestfulControllerTemplate
{
  protected static String nl;
  public static synchronized RestfulControllerTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    RestfulControllerTemplate result = new RestfulControllerTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = " " + NL + "" + NL + "package ";
  protected final String TEXT_3 = ".controllers;" + NL + "" + NL + "import org.springframework.beans.factory.annotation.Autowired;" + NL + "import org.springframework.http.MediaType;" + NL + "import org.springframework.stereotype.Controller;" + NL + "import org.springframework.ui.Model;" + NL + "import org.springframework.web.bind.annotation.RequestBody;" + NL + "import org.springframework.web.bind.annotation.RequestMapping;" + NL + "import org.springframework.web.bind.annotation.RequestMethod;" + NL + "import org.springframework.web.bind.annotation.ResponseBody;" + NL + "" + NL + "@Controller" + NL + "@RequestMapping(value=\"/";
  protected final String TEXT_4 = "\")" + NL + "public class ";
  protected final String TEXT_5 = "Controller {" + NL + "     " + NL + "    @Autowired" + NL + "    private ";
  protected final String TEXT_6 = "Service ";
  protected final String TEXT_7 = "Service;" + NL + "     " + NL + "    @RequestMapping(value=\"/create\", method=RequestMethod.GET)" + NL + "    public String create";
  protected final String TEXT_8 = "Page(Model model) {" + NL + "    \tmodel.addAttribute(\"";
  protected final String TEXT_9 = "\", new ";
  protected final String TEXT_10 = "());" + NL + "        return \"";
  protected final String TEXT_11 = "/new-";
  protected final String TEXT_12 = "\";" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/create\", method=RequestMethod.POST, " + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    @ResponseBody" + NL + "    public ";
  protected final String TEXT_13 = " create";
  protected final String TEXT_14 = "(@RequestBody ";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = ") {" + NL + "        return ";
  protected final String TEXT_17 = "Service.create(";
  protected final String TEXT_18 = ");" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/edit/{id}\", method=RequestMethod.GET)" + NL + "    public String edit";
  protected final String TEXT_19 = "Page(@PathVariable int id, Model model) {" + NL + "        model.addAttribute(\"";
  protected final String TEXT_20 = "\", ";
  protected final String TEXT_21 = "Service.get";
  protected final String TEXT_22 = "ById(id));" + NL + "        return \"";
  protected final String TEXT_23 = "/edit-";
  protected final String TEXT_24 = "\";" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/edit/{id}\", method=RequestMethod.PUT, " + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    @ResponseBody" + NL + "    public ";
  protected final String TEXT_25 = " edit";
  protected final String TEXT_26 = "(@PathVariable int id, " + NL + "            @RequestBody ";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = ") {";
  protected final String TEXT_29 = NL + "        ";
  protected final String TEXT_30 = ".setId(id);" + NL + "        return ";
  protected final String TEXT_31 = "Service.update(";
  protected final String TEXT_32 = ");" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/delete/{id}\", method=RequestMethod.DELETE, " + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    @ResponseBody" + NL + "    public void delete";
  protected final String TEXT_33 = "(@PathVariable int id) {";
  protected final String TEXT_34 = NL + "        ";
  protected final String TEXT_35 = "Service.delete";
  protected final String TEXT_36 = "(id);" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"\", method=RequestMethod.GET," + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    @ResponseBody" + NL + "    public List< ";
  protected final String TEXT_37 = " > all";
  protected final String TEXT_38 = "() {" + NL + "        return ";
  protected final String TEXT_39 = "Service.getAll";
  protected final String TEXT_40 = "();" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"\", method=RequestMethod.GET)" + NL + "    public String all";
  protected final String TEXT_41 = "Page(Model model) {" + NL + "        model.addAttribute(\"";
  protected final String TEXT_42 = "List\", all";
  protected final String TEXT_43 = "());" + NL + "        return \"";
  protected final String TEXT_44 = "/all-";
  protected final String TEXT_45 = "\";" + NL + "    }" + NL + "     " + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     ControllerModel model = (ControllerModel) argument; 
   String className = model.getClassRoot();
   String lowerClass = className.toLowerCase();
 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(model.getPackageRoot());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_45);
    return stringBuffer.toString();
  }
}
