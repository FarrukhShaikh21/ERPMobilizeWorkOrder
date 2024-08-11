package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseOrderHeaderImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 10 22:31:11 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseOrderHeaderVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SRPURCHASEORDERHEADER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Poheaderseq,
        PoCode,
        RfqHeaderCode,
        Supplierid,
        ReferenceNo,
        BillTo,
        ShipTo,
        DemandCode,
        CompareCode,
        PoDate,
        Remarks,
        PoFor,
        PoType,
        Companyid,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Locationid,
        txtLocationName,
        txtSupplierName,
        Posted,
        PostedDate,
        Paymenttermid,
        SrPurchaseOrderLinesVO,
        AllLocationsVO,
        PuSuppliersVO,
        SrPoReceivingHeaderVO,
        SrPurchaseAdvanceVO,
        SrPoInvoicePayHeaderView,
        SrPoInvoiceHeaderVO,
        AccSrPurchaseDemandHeaderView,
        AccVuDemandForQVO,
        AccVwPoType,
        AccAllLocationsVO,
        AccPuSuppliersVO,
        AccAllPaymentTermsVO;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int POHEADERSEQ = AttributesEnum.Poheaderseq.index();
    public static final int POCODE = AttributesEnum.PoCode.index();
    public static final int RFQHEADERCODE = AttributesEnum.RfqHeaderCode.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int REFERENCENO = AttributesEnum.ReferenceNo.index();
    public static final int BILLTO = AttributesEnum.BillTo.index();
    public static final int SHIPTO = AttributesEnum.ShipTo.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int COMPARECODE = AttributesEnum.CompareCode.index();
    public static final int PODATE = AttributesEnum.PoDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POFOR = AttributesEnum.PoFor.index();
    public static final int POTYPE = AttributesEnum.PoType.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int PAYMENTTERMID = AttributesEnum.Paymenttermid.index();
    public static final int SRPURCHASEORDERLINESVO = AttributesEnum.SrPurchaseOrderLinesVO.index();
    public static final int ALLLOCATIONSVO = AttributesEnum.AllLocationsVO.index();
    public static final int PUSUPPLIERSVO = AttributesEnum.PuSuppliersVO.index();
    public static final int SRPORECEIVINGHEADERVO = AttributesEnum.SrPoReceivingHeaderVO.index();
    public static final int SRPURCHASEADVANCEVO = AttributesEnum.SrPurchaseAdvanceVO.index();
    public static final int SRPOINVOICEPAYHEADERVIEW = AttributesEnum.SrPoInvoicePayHeaderView.index();
    public static final int SRPOINVOICEHEADERVO = AttributesEnum.SrPoInvoiceHeaderVO.index();
    public static final int ACCSRPURCHASEDEMANDHEADERVIEW = AttributesEnum.AccSrPurchaseDemandHeaderView.index();
    public static final int ACCVUDEMANDFORQVO = AttributesEnum.AccVuDemandForQVO.index();
    public static final int ACCVWPOTYPE = AttributesEnum.AccVwPoType.index();
    public static final int ACCALLLOCATIONSVO = AttributesEnum.AccAllLocationsVO.index();
    public static final int ACCPUSUPPLIERSVO = AttributesEnum.AccPuSuppliersVO.index();
    public static final int ACCALLPAYMENTTERMSVO = AttributesEnum.AccAllPaymentTermsVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseOrderHeaderVORowImpl() {
    }

    /**
     * Gets SrPurchaseOrderHeader entity object.
     * @return the SrPurchaseOrderHeader
     */
    public SrPurchaseOrderHeaderImpl getSrPurchaseOrderHeader() {
        return (SrPurchaseOrderHeaderImpl) getEntity(ENTITY_SRPURCHASEORDERHEADER);
    }

    /**
     * Gets the attribute value for POHEADERSEQ using the alias name Poheaderseq.
     * @return the POHEADERSEQ
     */
    public Integer getPoheaderseq() {
        return (Integer) getAttributeInternal(POHEADERSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for POHEADERSEQ using the alias name Poheaderseq.
     * @param value value to set the POHEADERSEQ
     */
    public void setPoheaderseq(Integer value) {
        setAttributeInternal(POHEADERSEQ, value);
    }

    /**
     * Gets the attribute value for PO_CODE using the alias name PoCode.
     * @return the PO_CODE
     */
    public String getPoCode() {
        return (String) getAttributeInternal(POCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_CODE using the alias name PoCode.
     * @param value value to set the PO_CODE
     */
    public void setPoCode(String value) {
        setAttributeInternal(POCODE, value);
    }

    /**
     * Gets the attribute value for RFQ_HEADER_CODE using the alias name RfqHeaderCode.
     * @return the RFQ_HEADER_CODE
     */
    public String getRfqHeaderCode() {
        return (String) getAttributeInternal(RFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_HEADER_CODE using the alias name RfqHeaderCode.
     * @param value value to set the RFQ_HEADER_CODE
     */
    public void setRfqHeaderCode(String value) {
        setAttributeInternal(RFQHEADERCODE, value);
    }

    /**
     * Gets the attribute value for SUPPLIERID using the alias name Supplierid.
     * @return the SUPPLIERID
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIERID using the alias name Supplierid.
     * @param value value to set the SUPPLIERID
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for REFERENCE_NO using the alias name ReferenceNo.
     * @return the REFERENCE_NO
     */
    public String getReferenceNo() {
        return (String) getAttributeInternal(REFERENCENO);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_NO using the alias name ReferenceNo.
     * @param value value to set the REFERENCE_NO
     */
    public void setReferenceNo(String value) {
        setAttributeInternal(REFERENCENO, value);
    }

    /**
     * Gets the attribute value for BILL_TO using the alias name BillTo.
     * @return the BILL_TO
     */
    public String getBillTo() {
        return (String) getAttributeInternal(BILLTO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_TO using the alias name BillTo.
     * @param value value to set the BILL_TO
     */
    public void setBillTo(String value) {
        setAttributeInternal(BILLTO, value);
    }

    /**
     * Gets the attribute value for SHIP_TO using the alias name ShipTo.
     * @return the SHIP_TO
     */
    public String getShipTo() {
        return (String) getAttributeInternal(SHIPTO);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIP_TO using the alias name ShipTo.
     * @param value value to set the SHIP_TO
     */
    public void setShipTo(String value) {
        setAttributeInternal(SHIPTO, value);
    }

    /**
     * Gets the attribute value for DEMAND_CODE using the alias name DemandCode.
     * @return the DEMAND_CODE
     */
    public String getDemandCode() {
        return (String) getAttributeInternal(DEMANDCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_CODE using the alias name DemandCode.
     * @param value value to set the DEMAND_CODE
     */
    public void setDemandCode(String value) {
        setAttributeInternal(DEMANDCODE, value);
    }

    /**
     * Gets the attribute value for COMPARE_CODE using the alias name CompareCode.
     * @return the COMPARE_CODE
     */
    public String getCompareCode() {
        return (String) getAttributeInternal(COMPARECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPARE_CODE using the alias name CompareCode.
     * @param value value to set the COMPARE_CODE
     */
    public void setCompareCode(String value) {
        setAttributeInternal(COMPARECODE, value);
    }

    /**
     * Gets the attribute value for PO_DATE using the alias name PoDate.
     * @return the PO_DATE
     */
    public Date getPoDate() {
        return (Date) getAttributeInternal(PODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_DATE using the alias name PoDate.
     * @param value value to set the PO_DATE
     */
    public void setPoDate(Date value) {
        setAttributeInternal(PODATE, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for PO_FOR using the alias name PoFor.
     * @return the PO_FOR
     */
    public String getPoFor() {
        return (String) getAttributeInternal(POFOR);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_FOR using the alias name PoFor.
     * @param value value to set the PO_FOR
     */
    public void setPoFor(String value) {
        setAttributeInternal(POFOR, value);
    }

    /**
     * Gets the attribute value for PO_TYPE using the alias name PoType.
     * @return the PO_TYPE
     */
    public String getPoType() {
        return (String) getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_TYPE using the alias name PoType.
     * @param value value to set the PO_TYPE
     */
    public void setPoType(String value) {
        setAttributeInternal(POTYPE, value);
    }

    /**
     * Gets the attribute value for COMPANYID using the alias name Companyid.
     * @return the COMPANYID
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANYID using the alias name Companyid.
     * @param value value to set the COMPANYID
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @return the MODIFIED_BY
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @param value value to set the MODIFIED_BY
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for LOCATIONID using the alias name Locationid.
     * @return the LOCATIONID
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATIONID using the alias name Locationid.
     * @param value value to set the LOCATIONID
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @return the TXT_LOCATION_NAME
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @param value value to set the TXT_LOCATION_NAME
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @return the TXT_SUPPLIER_NAME
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @param value value to set the TXT_SUPPLIER_NAME
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for POSTED using the alias name Posted.
     * @return the POSTED
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED using the alias name Posted.
     * @param value value to set the POSTED
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for POSTED_DATE using the alias name PostedDate.
     * @return the POSTED_DATE
     */
    public Date getPostedDate() {
        return (Date) getAttributeInternal(POSTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED_DATE using the alias name PostedDate.
     * @param value value to set the POSTED_DATE
     */
    public void setPostedDate(Date value) {
        setAttributeInternal(POSTEDDATE, value);
    }

    /**
     * Gets the attribute value for PAYMENTTERMID using the alias name Paymenttermid.
     * @return the PAYMENTTERMID
     */
    public String getPaymenttermid() {
        return (String) getAttributeInternal(PAYMENTTERMID);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENTTERMID using the alias name Paymenttermid.
     * @param value value to set the PAYMENTTERMID
     */
    public void setPaymenttermid(String value) {
        setAttributeInternal(PAYMENTTERMID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseOrderLinesVO.
     */
    public RowIterator getSrPurchaseOrderLinesVO() {
        return (RowIterator) getAttributeInternal(SRPURCHASEORDERLINESVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AllLocationsVO.
     */
    public Row getAllLocationsVO() {
        return (Row) getAttributeInternal(ALLLOCATIONSVO);
    }

    /**
     * Sets the master-detail link AllLocationsVO between this object and <code>value</code>.
     */
    public void setAllLocationsVO(Row value) {
        setAttributeInternal(ALLLOCATIONSVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link PuSuppliersVO.
     */
    public Row getPuSuppliersVO() {
        return (Row) getAttributeInternal(PUSUPPLIERSVO);
    }

    /**
     * Sets the master-detail link PuSuppliersVO between this object and <code>value</code>.
     */
    public void setPuSuppliersVO(Row value) {
        setAttributeInternal(PUSUPPLIERSVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPoReceivingHeaderVO.
     */
    public RowIterator getSrPoReceivingHeaderVO() {
        return (RowIterator) getAttributeInternal(SRPORECEIVINGHEADERVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseAdvanceVO.
     */
    public RowIterator getSrPurchaseAdvanceVO() {
        return (RowIterator) getAttributeInternal(SRPURCHASEADVANCEVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPoInvoicePayHeaderView.
     */
    public RowIterator getSrPoInvoicePayHeaderView() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEPAYHEADERVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPoInvoiceHeaderVO.
     */
    public RowIterator getSrPoInvoiceHeaderVO() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEHEADERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseDemandHeaderView.
     */
    public RowSet getAccSrPurchaseDemandHeaderView() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEDEMANDHEADERVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVuDemandForQVO.
     */
    public RowSet getAccVuDemandForQVO() {
        return (RowSet) getAttributeInternal(ACCVUDEMANDFORQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVwPoType.
     */
    public RowSet getAccVwPoType() {
        return (RowSet) getAttributeInternal(ACCVWPOTYPE);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsVO.
     */
    public RowSet getAccAllLocationsVO() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPuSuppliersVO.
     */
    public RowSet getAccPuSuppliersVO() {
        return (RowSet) getAttributeInternal(ACCPUSUPPLIERSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllPaymentTermsVO.
     */
    public RowSet getAccAllPaymentTermsVO() {
        return (RowSet) getAttributeInternal(ACCALLPAYMENTTERMSVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

