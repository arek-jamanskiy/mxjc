package com.leansoft.mxjc.model.annotation;

import com.leansoft.mxjc.model.Annotatable;
import com.leansoft.mxjc.util.StringUtil;

public class ElementAnnotation implements Annotatable {
	
	private String name = "";
   private String fieldNamespace = "";

   public String getFieldNamespace()
   {
      return fieldNamespace;
   }

   public void setFieldNamespace(String fieldNamespace)
   {
      this.fieldNamespace = fieldNamespace;
   }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean isParameterProvided() {
		return !StringUtil.isEmpty(name) || !StringUtil.isEmpty(fieldNamespace);
	}

	
	public String toString() {
		String value = "";
		if (!StringUtil.isEmpty(name)) {
			value += "name = \"" + name + "\"";
		}
      if (!StringUtil.isEmpty(fieldNamespace)) {
         if (!StringUtil.isEmpty(value)) {
            value +=", ";
         }
         value += "namespace = \""+ fieldNamespace+"\"";
      }
		value = "Element(" + value + ")";
		return value;
	}
	
}
