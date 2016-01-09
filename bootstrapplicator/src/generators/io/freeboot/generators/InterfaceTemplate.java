package io.freeboot.generators;

import io.freeboot.generators.models.*;

public class InterfaceTemplate
{
  protected static String nl;
  public static synchronized InterfaceTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    InterfaceTemplate result = new InterfaceTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = " " + NL + "package ";
  protected final String TEXT_3 = ".services;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".domain.";
  protected final String TEXT_5 = ";" + NL + "" + NL + "public interface I";
  protected final String TEXT_6 = "Service {" + NL + "" + NL + "\t";
  protected final String TEXT_7 = " create";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ");" + NL + "\tIterable< ";
  protected final String TEXT_11 = " > create";
  protected final String TEXT_12 = "(Iterable< ";
  protected final String TEXT_13 = " > ";
  protected final String TEXT_14 = ");" + NL + "\tIterable< ";
  protected final String TEXT_15 = " > getAll";
  protected final String TEXT_16 = "();" + NL + "\t";
  protected final String TEXT_17 = " get";
  protected final String TEXT_18 = "ById(Integer id);" + NL + "\tboolean ";
  protected final String TEXT_19 = "Exists(Integer id);" + NL + "\tlong ";
  protected final String TEXT_20 = "Count();" + NL + "\tvoid delete";
  protected final String TEXT_21 = "(Integer id);" + NL + "\tvoid detele";
  protected final String TEXT_22 = "(";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = ");" + NL + "\tvoid delete";
  protected final String TEXT_25 = "(Iterable< ";
  protected final String TEXT_26 = " > ";
  protected final String TEXT_27 = ");" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     InterfaceModel model = (InterfaceModel) argument; 
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
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(lowerClass);
    stringBuffer.append(TEXT_27);
    return stringBuffer.toString();
  }
}
