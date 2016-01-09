package io.freeboot.generators;

import io.freeboot.generators.models.*;

public class CrudRepositoryTemplate
{
  protected static String nl;
  public static synchronized CrudRepositoryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    CrudRepositoryTemplate result = new CrudRepositoryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = " " + NL + "package ";
  protected final String TEXT_3 = ".repositories;" + NL + "" + NL + "import org.springframework.data.repository.CrudRepository;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".domain.";
  protected final String TEXT_5 = ";" + NL + "" + NL + "public interface ";
  protected final String TEXT_6 = "Repository extends CrudRepository< ";
  protected final String TEXT_7 = ", Integer> {" + NL + "" + NL + "}";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     RepositoryModel model = (RepositoryModel) argument; 
   String className = model.getClassRoot();
   String lowerClass = className.toLowerCase();
 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(model.getPackageRoot());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(model.getPackageRoot());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
