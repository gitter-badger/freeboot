package io.freeboot.generators;

import io.freeboot.generators.models.*;

public class jQueryRestClientTemplate
{
  protected static String nl;
  public static synchronized jQueryRestClientTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    jQueryRestClientTemplate result = new jQueryRestClientTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = NL + NL + "//rest-client.js" + NL + "function callRestEndpoint(httpVerb, endpointURL, entityData, successCallback, errorCallback) {" + NL + "\tif(entityData != null) {" + NL + "\t\t$.ajax({" + NL + "\t\t\tmethod: httpVerb," + NL + "\t\t\turl: endpointURL," + NL + "\t\t\tdata: JSON.stringify(entityData)," + NL + "\t\t\tcontentType: \"application/json\"," + NL + "\t\t\tdataType: \"json\"," + NL + "\t\t\tsuccess: function (data, status, jqXHR) {" + NL + "\t\t\t\tsuccessCallback(data);" + NL + "\t\t\t}," + NL + "\t\t\terror: function (jqXHR, status) {            " + NL + "\t\t\t\terrorCallback(status);" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t} else {" + NL + "\t\t$.ajax({" + NL + "\t\t\tmethod: httpVerb," + NL + "\t\t\turl: endpointURL," + NL + "\t\t\tdataType: \"json\"," + NL + "\t\t\tsuccess: function (data, status, jqXHR) {" + NL + "\t\t\t\tsuccessCallback(data);" + NL + "\t\t\t}," + NL + "\t\t\terror: function (jqXHR, status) {            " + NL + "\t\t\t\terrorCallback(status);" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t}" + NL + "}" + NL + "" + NL + "//";
  protected final String TEXT_3 = ".service-client.js" + NL + "function ";
  protected final String TEXT_4 = "Create(data) {" + NL + "\tcallRestEndpoint(" + NL + "\t\t\t\"POST\"," + NL + "\t\t\t\"/";
  protected final String TEXT_5 = "/create\"," + NL + "\t\t\tdata," + NL + "\t\t\t";
  protected final String TEXT_6 = "CreateSuccessCallback," + NL + "\t\t\t";
  protected final String TEXT_7 = "CreateErrorCallback);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_8 = "CreateSuccessCallback(data) {" + NL + "\t//alert(data); - update the DOM here" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_9 = "CreateErrorCallback(status) {" + NL + "\talert(\"something went wrong! status=\" + status);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_10 = "Get(id) {" + NL + "\tcallRestEndpoint(" + NL + "\t\t\t\"GET\"," + NL + "\t\t\t\"/";
  protected final String TEXT_11 = "/get/\" + id," + NL + "\t\t\tnull," + NL + "\t\t\t";
  protected final String TEXT_12 = "GetSuccessCallback," + NL + "\t\t\t";
  protected final String TEXT_13 = "GetErrorCallback);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_14 = "GetSuccessCallback(data) {" + NL + "\t//alert(data); - update the DOM here" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_15 = "GetErrorCallback(status) {" + NL + "\talert(\"something went wrong! status=\" + status);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_16 = "GetAll() {" + NL + "\tcallRestEndpoint(" + NL + "\t\t\t\"GET\"," + NL + "\t\t\t\"/";
  protected final String TEXT_17 = "/all\"," + NL + "\t\t\tnull," + NL + "\t\t\t";
  protected final String TEXT_18 = "GetAllSuccessCallback," + NL + "\t\t\t";
  protected final String TEXT_19 = "GetAllErrorCallback);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_20 = "GetAllSuccessCallback(data) {" + NL + "\t//alert(data); - update the DOM here" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_21 = "GetAllErrorCallback(status) {" + NL + "\talert(\"something went wrong! status=\" + status);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_22 = "Edit(id, data) {" + NL + "\tcallRestEndpoint(" + NL + "\t\t\t\"PUT\"," + NL + "\t\t\t\"/";
  protected final String TEXT_23 = "/edit/\" + id," + NL + "\t\t\tdata," + NL + "\t\t\t";
  protected final String TEXT_24 = "EditSuccessCallback," + NL + "\t\t\t";
  protected final String TEXT_25 = "EditErrorCallback);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_26 = "EditSuccessCallback(data) {" + NL + "\t//alert(data); - update the DOM here" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_27 = "EditErrorCallback(status) {" + NL + "\talert(\"something went wrong! status=\" + status);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_28 = "Delete(id) {" + NL + "\tcallRestEndpoint(" + NL + "\t\t\t\"DELETE\"," + NL + "\t\t\t\"/";
  protected final String TEXT_29 = "/delete/\" + id," + NL + "\t\t\tnull," + NL + "\t\t\t";
  protected final String TEXT_30 = "DeleteSuccessCallback," + NL + "\t\t\t";
  protected final String TEXT_31 = "DeleteErrorCallback);" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_32 = "DeleteSuccessCallback(data) {" + NL + "\t//alert(data); - update the DOM here" + NL + "}" + NL + "" + NL + "function ";
  protected final String TEXT_33 = "EditErrorCallback(status) {" + NL + "\talert(\"something went wrong! status=\" + status);" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
   ControllerModel model = (ControllerModel) argument; 
   String lowerCamel = model.getClassRootCamelCase();
   String kebabCase = model.getClassRootKebabCase(); 

    stringBuffer.append(TEXT_2);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(kebabCase);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(lowerCamel);
    stringBuffer.append(TEXT_33);
    return stringBuffer.toString();
  }
}
