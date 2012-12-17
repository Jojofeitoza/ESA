package esa.entidades;

public class Review {
	private String review;
	private int like;
	
	public Review(String review, int like) {
		
		this.review = review;
		this.like = like;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * @return the like
	 */
	public int getLike() {
		return like;
	}

	/**
	 * @param like the like to set
	 */
	public void setLike(int like) {
		this.like = like;
	}
	
	

}
