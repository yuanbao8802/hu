
package com.enuoai.soa.agent.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enuoai.soa.agent.controller package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadAgentFaceImg_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "uploadAgentFaceImg");
    private final static QName _QueryAgentInfo_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentInfo");
    private final static QName _UploadAgentFaceImgResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "uploadAgentFaceImgResponse");
    private final static QName _GetRenewListResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getRenewListResponse");
    private final static QName _GetCommission_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getCommission");
    private final static QName _UpdateAgentInfoResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "updateAgentInfoResponse");
    private final static QName _SettleAccountResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "settleAccountResponse");
    private final static QName _RegisterAgent101Response_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "registerAgent101Response");
    private final static QName _SettleAccount_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "settleAccount");
    private final static QName _UpdateAgentInfo_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "updateAgentInfo");
    private final static QName _GetCommissionDetailsResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getCommissionDetailsResponse");
    private final static QName _QueryAgentInfoResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentInfoResponse");
    private final static QName _QueryAgentInfo101Response_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentInfo101Response");
    private final static QName _QueryAgentStatusResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentStatusResponse");
    private final static QName _RegisterAgentResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "registerAgentResponse");
    private final static QName _GetRenewList_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getRenewList");
    private final static QName _RegisterAgent101_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "registerAgent101");
    private final static QName _QueryAgentStatus_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentStatus");
    private final static QName _GetCommissionResponse_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getCommissionResponse");
    private final static QName _RegisterAgent_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "registerAgent");
    private final static QName _UpdateAgentInfo101Response_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "updateAgentInfo101Response");
    private final static QName _QueryAgentInfo101_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "queryAgentInfo101");
    private final static QName _UpdateAgentInfo101_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "updateAgentInfo101");
    private final static QName _GetCommissionDetails_QNAME = new QName("http://controller.agent.soa.enuoai.com/", "getCommissionDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enuoai.soa.agent.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link CommissionDetailData }
     * 
     */
    public CommissionDetailData createCommissionDetailData() {
        return new CommissionDetailData();
    }

    /**
     * Create an instance of {@link AgentInfo101 }
     * 
     */
    public AgentInfo101 createAgentInfo101() {
        return new AgentInfo101();
    }

    /**
     * Create an instance of {@link RenewDetail }
     * 
     */
    public RenewDetail createRenewDetail() {
        return new RenewDetail();
    }

    /**
     * Create an instance of {@link CommissionData }
     * 
     */
    public CommissionData createCommissionData() {
        return new CommissionData();
    }

    /**
     * Create an instance of {@link CommissionDetail }
     * 
     */
    public CommissionDetail createCommissionDetail() {
        return new CommissionDetail();
    }

    /**
     * Create an instance of {@link UploadAgentFaceImg }
     * 
     */
    public UploadAgentFaceImg createUploadAgentFaceImg() {
        return new UploadAgentFaceImg();
    }

    /**
     * Create an instance of {@link QueryAgentInfo }
     * 
     */
    public QueryAgentInfo createQueryAgentInfo() {
        return new QueryAgentInfo();
    }

    /**
     * Create an instance of {@link UploadAgentFaceImgResponse }
     * 
     */
    public UploadAgentFaceImgResponse createUploadAgentFaceImgResponse() {
        return new UploadAgentFaceImgResponse();
    }

    /**
     * Create an instance of {@link GetRenewListResponse }
     * 
     */
    public GetRenewListResponse createGetRenewListResponse() {
        return new GetRenewListResponse();
    }

    /**
     * Create an instance of {@link GetCommission }
     * 
     */
    public GetCommission createGetCommission() {
        return new GetCommission();
    }

    /**
     * Create an instance of {@link UpdateAgentInfoResponse }
     * 
     */
    public UpdateAgentInfoResponse createUpdateAgentInfoResponse() {
        return new UpdateAgentInfoResponse();
    }

    /**
     * Create an instance of {@link SettleAccountResponse }
     * 
     */
    public SettleAccountResponse createSettleAccountResponse() {
        return new SettleAccountResponse();
    }

    /**
     * Create an instance of {@link RegisterAgent101Response }
     * 
     */
    public RegisterAgent101Response createRegisterAgent101Response() {
        return new RegisterAgent101Response();
    }

    /**
     * Create an instance of {@link SettleAccount }
     * 
     */
    public SettleAccount createSettleAccount() {
        return new SettleAccount();
    }

    /**
     * Create an instance of {@link UpdateAgentInfo }
     * 
     */
    public UpdateAgentInfo createUpdateAgentInfo() {
        return new UpdateAgentInfo();
    }

    /**
     * Create an instance of {@link GetCommissionDetailsResponse }
     * 
     */
    public GetCommissionDetailsResponse createGetCommissionDetailsResponse() {
        return new GetCommissionDetailsResponse();
    }

    /**
     * Create an instance of {@link QueryAgentInfo101Response }
     * 
     */
    public QueryAgentInfo101Response createQueryAgentInfo101Response() {
        return new QueryAgentInfo101Response();
    }

    /**
     * Create an instance of {@link QueryAgentInfoResponse }
     * 
     */
    public QueryAgentInfoResponse createQueryAgentInfoResponse() {
        return new QueryAgentInfoResponse();
    }

    /**
     * Create an instance of {@link RegisterAgentResponse }
     * 
     */
    public RegisterAgentResponse createRegisterAgentResponse() {
        return new RegisterAgentResponse();
    }

    /**
     * Create an instance of {@link QueryAgentStatusResponse }
     * 
     */
    public QueryAgentStatusResponse createQueryAgentStatusResponse() {
        return new QueryAgentStatusResponse();
    }

    /**
     * Create an instance of {@link RegisterAgent101 }
     * 
     */
    public RegisterAgent101 createRegisterAgent101() {
        return new RegisterAgent101();
    }

    /**
     * Create an instance of {@link GetRenewList }
     * 
     */
    public GetRenewList createGetRenewList() {
        return new GetRenewList();
    }

    /**
     * Create an instance of {@link RegisterAgent }
     * 
     */
    public RegisterAgent createRegisterAgent() {
        return new RegisterAgent();
    }

    /**
     * Create an instance of {@link GetCommissionResponse }
     * 
     */
    public GetCommissionResponse createGetCommissionResponse() {
        return new GetCommissionResponse();
    }

    /**
     * Create an instance of {@link QueryAgentStatus }
     * 
     */
    public QueryAgentStatus createQueryAgentStatus() {
        return new QueryAgentStatus();
    }

    /**
     * Create an instance of {@link UpdateAgentInfo101Response }
     * 
     */
    public UpdateAgentInfo101Response createUpdateAgentInfo101Response() {
        return new UpdateAgentInfo101Response();
    }

    /**
     * Create an instance of {@link QueryAgentInfo101 }
     * 
     */
    public QueryAgentInfo101 createQueryAgentInfo101() {
        return new QueryAgentInfo101();
    }

    /**
     * Create an instance of {@link UpdateAgentInfo101 }
     * 
     */
    public UpdateAgentInfo101 createUpdateAgentInfo101() {
        return new UpdateAgentInfo101();
    }

    /**
     * Create an instance of {@link GetCommissionDetails }
     * 
     */
    public GetCommissionDetails createGetCommissionDetails() {
        return new GetCommissionDetails();
    }

    /**
     * Create an instance of {@link MonthAmount }
     * 
     */
    public MonthAmount createMonthAmount() {
        return new MonthAmount();
    }

    /**
     * Create an instance of {@link AgentStatusResult }
     * 
     */
    public AgentStatusResult createAgentStatusResult() {
        return new AgentStatusResult();
    }

    /**
     * Create an instance of {@link AgentData }
     * 
     */
    public AgentData createAgentData() {
        return new AgentData();
    }

    /**
     * Create an instance of {@link AgentInfoVo }
     * 
     */
    public AgentInfoVo createAgentInfoVo() {
        return new AgentInfoVo();
    }

    /**
     * Create an instance of {@link RenewData }
     * 
     */
    public RenewData createRenewData() {
        return new RenewData();
    }

    /**
     * Create an instance of {@link CommissionDetailResult }
     * 
     */
    public CommissionDetailResult createCommissionDetailResult() {
        return new CommissionDetailResult();
    }

    /**
     * Create an instance of {@link AgentResult101 }
     * 
     */
    public AgentResult101 createAgentResult101() {
        return new AgentResult101();
    }

    /**
     * Create an instance of {@link MonthCommissionDetail }
     * 
     */
    public MonthCommissionDetail createMonthCommissionDetail() {
        return new MonthCommissionDetail();
    }

    /**
     * Create an instance of {@link AgentFaceImgParam }
     * 
     */
    public AgentFaceImgParam createAgentFaceImgParam() {
        return new AgentFaceImgParam();
    }

    /**
     * Create an instance of {@link AgentStatus }
     * 
     */
    public AgentStatus createAgentStatus() {
        return new AgentStatus();
    }

    /**
     * Create an instance of {@link AccountParam }
     * 
     */
    public AccountParam createAccountParam() {
        return new AccountParam();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link AgentResult }
     * 
     */
    public AgentResult createAgentResult() {
        return new AgentResult();
    }

    /**
     * Create an instance of {@link RecordAmount }
     * 
     */
    public RecordAmount createRecordAmount() {
        return new RecordAmount();
    }

    /**
     * Create an instance of {@link CommissionDetailsParm }
     * 
     */
    public CommissionDetailsParm createCommissionDetailsParm() {
        return new CommissionDetailsParm();
    }

    /**
     * Create an instance of {@link AccountResult }
     * 
     */
    public AccountResult createAccountResult() {
        return new AccountResult();
    }

    /**
     * Create an instance of {@link CommissionDataResult }
     * 
     */
    public CommissionDataResult createCommissionDataResult() {
        return new CommissionDataResult();
    }

    /**
     * Create an instance of {@link AgentInfoResult }
     * 
     */
    public AgentInfoResult createAgentInfoResult() {
        return new AgentInfoResult();
    }

    /**
     * Create an instance of {@link CommissionParm }
     * 
     */
    public CommissionParm createCommissionParm() {
        return new CommissionParm();
    }

    /**
     * Create an instance of {@link RenewResult }
     * 
     */
    public RenewResult createRenewResult() {
        return new RenewResult();
    }

    /**
     * Create an instance of {@link SoaUserPasswordToken }
     * 
     */
    public SoaUserPasswordToken createSoaUserPasswordToken() {
        return new SoaUserPasswordToken();
    }

    /**
     * Create an instance of {@link RenewParam }
     * 
     */
    public RenewParam createRenewParam() {
        return new RenewParam();
    }

    /**
     * Create an instance of {@link AgentCert }
     * 
     */
    public AgentCert createAgentCert() {
        return new AgentCert();
    }

    /**
     * Create an instance of {@link CommissionProductRate }
     * 
     */
    public CommissionProductRate createCommissionProductRate() {
        return new CommissionProductRate();
    }

    /**
     * Create an instance of {@link Account.CommissionDetailList }
     * 
     */
    public Account.CommissionDetailList createAccountCommissionDetailList() {
        return new Account.CommissionDetailList();
    }

    /**
     * Create an instance of {@link CommissionDetailData.CommissionDetailList }
     * 
     */
    public CommissionDetailData.CommissionDetailList createCommissionDetailDataCommissionDetailList() {
        return new CommissionDetailData.CommissionDetailList();
    }

    /**
     * Create an instance of {@link AgentInfo101 .UserNames }
     * 
     */
    public AgentInfo101 .UserNames createAgentInfo101UserNames() {
        return new AgentInfo101 .UserNames();
    }

    /**
     * Create an instance of {@link AgentInfo101 .AgentCertSet }
     * 
     */
    public AgentInfo101 .AgentCertSet createAgentInfo101AgentCertSet() {
        return new AgentInfo101 .AgentCertSet();
    }

    /**
     * Create an instance of {@link RenewDetail.PaymentRecords }
     * 
     */
    public RenewDetail.PaymentRecords createRenewDetailPaymentRecords() {
        return new RenewDetail.PaymentRecords();
    }

    /**
     * Create an instance of {@link CommissionData.MonthCommissionList }
     * 
     */
    public CommissionData.MonthCommissionList createCommissionDataMonthCommissionList() {
        return new CommissionData.MonthCommissionList();
    }

    /**
     * Create an instance of {@link CommissionDetail.CommissionProductRateList }
     * 
     */
    public CommissionDetail.CommissionProductRateList createCommissionDetailCommissionProductRateList() {
        return new CommissionDetail.CommissionProductRateList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadAgentFaceImg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "uploadAgentFaceImg")
    public JAXBElement<UploadAgentFaceImg> createUploadAgentFaceImg(UploadAgentFaceImg value) {
        return new JAXBElement<UploadAgentFaceImg>(_UploadAgentFaceImg_QNAME, UploadAgentFaceImg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentInfo")
    public JAXBElement<QueryAgentInfo> createQueryAgentInfo(QueryAgentInfo value) {
        return new JAXBElement<QueryAgentInfo>(_QueryAgentInfo_QNAME, QueryAgentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadAgentFaceImgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "uploadAgentFaceImgResponse")
    public JAXBElement<UploadAgentFaceImgResponse> createUploadAgentFaceImgResponse(UploadAgentFaceImgResponse value) {
        return new JAXBElement<UploadAgentFaceImgResponse>(_UploadAgentFaceImgResponse_QNAME, UploadAgentFaceImgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRenewListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getRenewListResponse")
    public JAXBElement<GetRenewListResponse> createGetRenewListResponse(GetRenewListResponse value) {
        return new JAXBElement<GetRenewListResponse>(_GetRenewListResponse_QNAME, GetRenewListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getCommission")
    public JAXBElement<GetCommission> createGetCommission(GetCommission value) {
        return new JAXBElement<GetCommission>(_GetCommission_QNAME, GetCommission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "updateAgentInfoResponse")
    public JAXBElement<UpdateAgentInfoResponse> createUpdateAgentInfoResponse(UpdateAgentInfoResponse value) {
        return new JAXBElement<UpdateAgentInfoResponse>(_UpdateAgentInfoResponse_QNAME, UpdateAgentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettleAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "settleAccountResponse")
    public JAXBElement<SettleAccountResponse> createSettleAccountResponse(SettleAccountResponse value) {
        return new JAXBElement<SettleAccountResponse>(_SettleAccountResponse_QNAME, SettleAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAgent101Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "registerAgent101Response")
    public JAXBElement<RegisterAgent101Response> createRegisterAgent101Response(RegisterAgent101Response value) {
        return new JAXBElement<RegisterAgent101Response>(_RegisterAgent101Response_QNAME, RegisterAgent101Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettleAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "settleAccount")
    public JAXBElement<SettleAccount> createSettleAccount(SettleAccount value) {
        return new JAXBElement<SettleAccount>(_SettleAccount_QNAME, SettleAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "updateAgentInfo")
    public JAXBElement<UpdateAgentInfo> createUpdateAgentInfo(UpdateAgentInfo value) {
        return new JAXBElement<UpdateAgentInfo>(_UpdateAgentInfo_QNAME, UpdateAgentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommissionDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getCommissionDetailsResponse")
    public JAXBElement<GetCommissionDetailsResponse> createGetCommissionDetailsResponse(GetCommissionDetailsResponse value) {
        return new JAXBElement<GetCommissionDetailsResponse>(_GetCommissionDetailsResponse_QNAME, GetCommissionDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentInfoResponse")
    public JAXBElement<QueryAgentInfoResponse> createQueryAgentInfoResponse(QueryAgentInfoResponse value) {
        return new JAXBElement<QueryAgentInfoResponse>(_QueryAgentInfoResponse_QNAME, QueryAgentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentInfo101Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentInfo101Response")
    public JAXBElement<QueryAgentInfo101Response> createQueryAgentInfo101Response(QueryAgentInfo101Response value) {
        return new JAXBElement<QueryAgentInfo101Response>(_QueryAgentInfo101Response_QNAME, QueryAgentInfo101Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentStatusResponse")
    public JAXBElement<QueryAgentStatusResponse> createQueryAgentStatusResponse(QueryAgentStatusResponse value) {
        return new JAXBElement<QueryAgentStatusResponse>(_QueryAgentStatusResponse_QNAME, QueryAgentStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "registerAgentResponse")
    public JAXBElement<RegisterAgentResponse> createRegisterAgentResponse(RegisterAgentResponse value) {
        return new JAXBElement<RegisterAgentResponse>(_RegisterAgentResponse_QNAME, RegisterAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRenewList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getRenewList")
    public JAXBElement<GetRenewList> createGetRenewList(GetRenewList value) {
        return new JAXBElement<GetRenewList>(_GetRenewList_QNAME, GetRenewList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAgent101 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "registerAgent101")
    public JAXBElement<RegisterAgent101> createRegisterAgent101(RegisterAgent101 value) {
        return new JAXBElement<RegisterAgent101>(_RegisterAgent101_QNAME, RegisterAgent101 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentStatus")
    public JAXBElement<QueryAgentStatus> createQueryAgentStatus(QueryAgentStatus value) {
        return new JAXBElement<QueryAgentStatus>(_QueryAgentStatus_QNAME, QueryAgentStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommissionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getCommissionResponse")
    public JAXBElement<GetCommissionResponse> createGetCommissionResponse(GetCommissionResponse value) {
        return new JAXBElement<GetCommissionResponse>(_GetCommissionResponse_QNAME, GetCommissionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "registerAgent")
    public JAXBElement<RegisterAgent> createRegisterAgent(RegisterAgent value) {
        return new JAXBElement<RegisterAgent>(_RegisterAgent_QNAME, RegisterAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgentInfo101Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "updateAgentInfo101Response")
    public JAXBElement<UpdateAgentInfo101Response> createUpdateAgentInfo101Response(UpdateAgentInfo101Response value) {
        return new JAXBElement<UpdateAgentInfo101Response>(_UpdateAgentInfo101Response_QNAME, UpdateAgentInfo101Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAgentInfo101 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "queryAgentInfo101")
    public JAXBElement<QueryAgentInfo101> createQueryAgentInfo101(QueryAgentInfo101 value) {
        return new JAXBElement<QueryAgentInfo101>(_QueryAgentInfo101_QNAME, QueryAgentInfo101 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgentInfo101 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "updateAgentInfo101")
    public JAXBElement<UpdateAgentInfo101> createUpdateAgentInfo101(UpdateAgentInfo101 value) {
        return new JAXBElement<UpdateAgentInfo101>(_UpdateAgentInfo101_QNAME, UpdateAgentInfo101 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommissionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.agent.soa.enuoai.com/", name = "getCommissionDetails")
    public JAXBElement<GetCommissionDetails> createGetCommissionDetails(GetCommissionDetails value) {
        return new JAXBElement<GetCommissionDetails>(_GetCommissionDetails_QNAME, GetCommissionDetails.class, null, value);
    }

}
