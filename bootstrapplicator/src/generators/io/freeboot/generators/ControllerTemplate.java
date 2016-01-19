package io.freeboot.generators;

import io.freeboot.generators.models.*;

public class ControllerTemplate
{
  protected static String nl;
  public static synchronized ControllerTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ControllerTemplate result = new ControllerTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = " " + NL + "package ";
  protected final String TEXT_3 = ".controllers;" + NL + "" + NL + "import org.springframework.beans.factory.annotation.Autowired;" + NL + "import org.springframework.stereotype.Controller;" + NL + "import org.springframework.ui.Model;" + NL + "import org.springframework.web.bind.annotation.PathVariable;" + NL + "import org.springframework.web.bind.annotation.RequestMapping;" + NL + "" + NL + "@Controller" + NL + "public class ";
  protected final String TEXT_4 = " {" + NL + "\t" + NL + "    @RequestMapping(\"/\")" + NL + "    String ";
  protected final String TEXT_5 = "(){" + NL + "        return \"";
  protected final String TEXT_6 = "\";" + NL + "    }" + NL + "    " + NL + "}";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     ControllerModel model = (ControllerModel) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(model.getPackageRoot());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(model.getClassName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(model.getClassRootCamelCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(model.getClassRootCamelCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
