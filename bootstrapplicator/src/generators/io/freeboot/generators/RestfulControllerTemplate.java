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
  protected final String TEXT_3 = ".controllers;" + NL + "" + NL + "import org.springframework.beans.factory.annotation.Autowired;" + NL + "import org.springframework.http.MediaType;" + NL + "import org.springframework.ui.Model;" + NL + "import org.springframework.web.bind.annotation.RequestBody;" + NL + "import org.springframework.web.bind.annotation.RequestMapping;" + NL + "import org.springframework.web.bind.annotation.RequestMethod;" + NL + "import org.springframework.web.bind.annotation.ResponseBody;" + NL + "import org.springframework.web.bind.annotation.RestController;" + NL + "" + NL + "@RestController" + NL + "@RequestMapping(value=\"/";
  protected final String TEXT_4 = "\")" + NL + "public class ";
  protected final String TEXT_5 = "Controller {" + NL + "     " + NL + "    @Autowired" + NL + "    private ";
  protected final String TEXT_6 = "Service ";
  protected final String TEXT_7 = "Service;" + NL + "     " + NL + "    @RequestMapping(value=\"/create\", method=RequestMethod.POST, " + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    public ";
  protected final String TEXT_8 = " create";
  protected final String TEXT_9 = "(@RequestBody ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = ") {" + NL + "        return ";
  protected final String TEXT_12 = "Service.create";
  protected final String TEXT_13 = "(";
  protected final String TEXT_14 = ");" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/all\", method=RequestMethod.GET," + NL + "            produces = MediaType.APPLICATION_JSON_VALUE)" + NL + "    public Iterable< ";
  protected final String TEXT_15 = " > all";
  protected final String TEXT_16 = "() {" + NL + "        return ";
  protected final String TEXT_17 = "Service.getAll";
  protected final String TEXT_18 = "();" + NL + "    }" + NL + "    " + NL + "    @RequestMapping(value=\"/get/{id}\", method=RequestMethod.GET," + NL + "            produces = MediaType.APPLICATION_JSON_VALUE)" + NL + "    public Iterable< ";
  protected final String TEXT_19 = " > get";
  protected final String TEXT_20 = "(@PathVariable int id) {" + NL + "        return ";
  protected final String TEXT_21 = "Service.get";
  protected final String TEXT_22 = "ById(id);" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/edit/{id}\", method=RequestMethod.PUT, " + NL + "            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)" + NL + "    public ";
  protected final String TEXT_23 = " edit";
  protected final String TEXT_24 = "(@PathVariable int id, " + NL + "            @RequestBody ";
  protected final String TEXT_25 = " ";
  protected final String TEXT_26 = ") {";
  protected final String TEXT_27 = NL + "        ";
  protected final String TEXT_28 = ".setId(id);" + NL + "        return ";
  protected final String TEXT_29 = "Service.update";
  protected final String TEXT_30 = "(";
  protected final String TEXT_31 = ");" + NL + "    }" + NL + "     " + NL + "    @RequestMapping(value=\"/delete/{id}\", method=RequestMethod.DELETE)" + NL + "    public void delete";
  protected final String TEXT_32 = "(@PathVariable int id) {";
  protected final String TEXT_33 = NL + "        ";
  protected final String TEXT_34 = "Service.delete";
  protected final String TEXT_35 = "(id);" + NL + "    }" + NL + "     " + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     ControllerModel model = (ControllerModel) argument; 
   String className = model.getClassRoot();
   String lowerCamel = model.getClassRootCamelCase();
   String kebabCase = model.getClassRootKebabCase();
 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(model.getPackageRoot());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
