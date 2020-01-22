package com.java.tricky;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TestEquals {

	private String fname, lname;

	public TestEquals(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof TestEquals) {
			return fname.equals(((TestEquals) o).fname) && lname.equals(((TestEquals) o).lname);
//			return Objects.equals(fname, ((TestEquals) o).fname) && Objects.equals(lname, ((TestEquals) o).lname);
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; TestEquals other = (TestEquals) obj; if (fname == null) { if
	 * (other.fname != null) return false; } else if (!fname.equals(other.fname))
	 * return false; if (lname == null) { if (other.lname != null) return false; }
	 * else if (!lname.equals(other.lname)) return false; return true; }
	 */

	public static void main(String[] args) {

		List<TestEquals> list = new ArrayList<>();
		list.add(new TestEquals("Sandeep", "negi"));
		list.add(new TestEquals("Amit", "negi"));

		Set<TestEquals> set = new HashSet<>();
		set.add(new TestEquals("Sandeep", "negi"));
		set.add(new TestEquals("Aman", "negi"));

		System.out.println(list.contains(new TestEquals("Sandeep", "negi")));
		System.out.println(set.contains(new TestEquals("Aman", "negi")));

		System.out.println(list.size());
		System.out.println(set.size());

	}

}
