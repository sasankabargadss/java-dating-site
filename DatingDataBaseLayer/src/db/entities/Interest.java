package db.entities;

public class Interest {
	
	private Long interestId;
	private Long userId;
	private String interest;
	/**
	 * Used to set InterestID for the current object/row.
	 * This should only be used by Hibernate itself, do not use this explicitly.
	 * @param interestId The id.
	 */
	public void setInterestId(Long interestId) {
		this.interestId = interestId;
	}
	/**
	 * @return InterestID for the current object/row, the primary key for the Interests table.
	 */
	public Long getInterestId() {
		return interestId;
	}
	/**
	 * Used to set an interests text block for a user.
	 * @param interest
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/**
	 * Used to access the interest text block associated with a user.
	 * @return The interests text block.
	 */
	public String getInterest() {
		return interest;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserId() {
		return userId;
	}
}
