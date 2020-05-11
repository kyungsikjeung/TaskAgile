package com.taskagile.domain.common.mail;

public class MessageVariable {
	private String key;
	private Object value;
	
	private MessageVariable(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public static MessageVariable from(String key , Object value) {
		return new MessageVariable(key,value);
	}

	public String getKey() {
		return key;
	}


	public Object getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageVariable other = (MessageVariable) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MessageVariable [key=" + key + ", value=" + value + "]";
	}	
	
}
