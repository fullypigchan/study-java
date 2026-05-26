package postvo.test;

import java.util.Objects;

public class PostVOTest {

	private long id;
	private String postContent;
	private long memberId;
	public PostVOTest() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "PostVOTest [id=" + id + ", postContent=" + postContent + ", memberId=" + memberId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, memberId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostVOTest other = (PostVOTest) obj;
		return id == other.id && memberId == other.memberId;
	}
	
}
