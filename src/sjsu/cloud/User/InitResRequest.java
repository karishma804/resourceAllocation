package sjsu.cloud.User;

import java.util.Date;

import sjsu.cloud.LabUser;
import sjsu.cloud.vm.VM;

public class InitResRequest implements UserRequest {
	/**
	 * The user of the request.
	 */
	private LabUser labUser;
	/**
	 * if the request from the user includes all resources.
	 */
	private boolean allRes;
	/**
	 * the type of vm resource the user requests
	 */
	private VM vm;
	/**
	 * the number of vm resource the user requests
	 */
	private Integer vmCount;
	/**
	 * The start date of resource schedule.
	 */
	private Date startDate;
	/**
	 * The end data of resources schedule.
	 */
	private Date endDate;

	/**
	 * The default constructor of the class.
	 */
	public InitResRequest() {
	}

	/**
	 * Override method. Specify the user of the request, must be included.
	 */
	@Override
	public UserRequest withUserID(int userID) {
		labUser = new LabUser();
		labUser.setLabUserID(userID);
		return this;
	}

	/**
	 * Override method. Set if the request includes all the resources.
	 */
	@Override
	public UserRequest withAllRes(Boolean allRes) {
		return null;
	}

	/**
	 * The type of vm resource included in the request. Return the Object
	 * request.
	 * 
	 * @param the
	 *            type of VM resources.
	 * @return The reference of the updated Ojbect.
	 */
	public UserRequest withVM(VM vm) {
		this.vm = vm;
		return this;
	}

	/**
	 * The number of vm resources which included in the request. Return the
	 * updated Object.
	 * 
	 * @param The
	 *            number of vms.
	 * @return The updated Object.
	 */
	public UserRequest withCount(Integer count) {
		this.vmCount = count;
		return this;
	}
	/**
	 * The start date of schedule in the request.
	 * @param The start date
	 * @return The updated object.
	 */
	public UserRequest withStartDate(Date stDate) {
		this.startDate = stDate;
		return this;
	}
	/**
	 * The end date of resource schedule.
	 * @param the end date
	 * @return the updated request object.
	 */
	public UserRequest withEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}

	public boolean isAllRes() {
		return allRes;
	}

	public void setAllRes(boolean allRes) {
		this.allRes = allRes;
	}

	public VM getVm() {
		return vm;
	}

	public void setVm(VM vm) {
		this.vm = vm;
	}

	public Integer getVmCount() {
		return vmCount;
	}

	public void setVmCount(Integer vmCount) {
		this.vmCount = vmCount;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
