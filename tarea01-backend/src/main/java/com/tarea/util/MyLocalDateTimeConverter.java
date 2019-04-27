package com.tarea.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MyLocalDateTimeConverter implements AttributeConverter<java.time.LocalDateTime, java.sql.Timestamp>{

	@Override
	public java.sql.Timestamp convertToDatabaseColumn(java.time.LocalDateTime attribute) {
		// TODO Auto-generated method stub
		return attribute == null ? null:java.sql.Timestamp.valueOf(attribute);
	}
	
	@Override
	public java.time.LocalDateTime convertToEntityAttribute(java.sql.Timestamp dbData) {
		// TODO Auto-generated method stub
		return dbData == null ? null : dbData.toLocalDateTime();
	}
	
	
}
