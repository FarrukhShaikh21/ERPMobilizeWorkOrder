package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseRfqSupplierImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 08 00:12:52 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseRfqSupplierViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_SRPURCHASERFQSUPPLIER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfqsupplierseqno,
        Rfqheaderseqno,
        Supplierid,
        ContactNo,
        SupplierRemarks,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        txtRfqHeaderCode,
        SrPurchaseRfqHeaderView,
        SrPurchaseBidHeaderView,
        PuSuppliersVO,
        AccPuSuppliersVO;
        private static AttributesEnum[] vals = null;
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
    public static final int RFQSUPPLIERSEQNO = AttributesEnum.Rfqsupplierseqno.index();
    public static final int RFQHEADERSEQNO = AttributesEnum.Rfqheaderseqno.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int CONTACTNO = AttributesEnum.ContactNo.index();
    public static final int SUPPLIERREMARKS = AttributesEnum.SupplierRemarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int SRPURCHASERFQHEADERVIEW = AttributesEnum.SrPurchaseRfqHeaderView.index();
    public static final int SRPURCHASEBIDHEADERVIEW = AttributesEnum.SrPurchaseBidHeaderView.index();
    public static final int PUSUPPLIERSVO = AttributesEnum.PuSuppliersVO.index();
    public static final int ACCPUSUPPLIERSVO = AttributesEnum.AccPuSuppliersVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseRfqSupplierViewRowImpl() {
    }

    /**
     * Gets SrPurchaseRfqSupplier entity object.
     * @return the SrPurchaseRfqSupplier
     */
    public SrPurchaseRfqSupplierImpl getSrPurchaseRfqSupplier() {
        return (SrPurchaseRfqSupplierImpl) getEntity(ENTITY_SRPURCHASERFQSUPPLIER);
    }

    /**
     * Gets the attribute value for RFQSUPPLIERSEQNO using the alias name Rfqsupplierseqno.
     * @return the RFQSUPPLIERSEQNO
     */
    public Integer getRfqsupplierseqno() {
        return (Integer) getAttributeInternal(RFQSUPPLIERSEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQSUPPLIERSEQNO using the alias name Rfqsupplierseqno.
     * @param value value to set the RFQSUPPLIERSEQNO
     */
    public void setRfqsupplierseqno(Integer value) {
        setAttributeInternal(RFQSUPPLIERSEQNO, value);
    }

    /**
     * Gets the attribute value for RFQHEADERSEQNO using the alias name Rfqheaderseqno.
     * @return the RFQHEADERSEQNO
     */
    public Integer getRfqheaderseqno() {
        return (Integer) getAttributeInternal(RFQHEADERSEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQHEADERSEQNO using the alias name Rfqheaderseqno.
     * @param value value to set the RFQHEADERSEQNO
     */
    public void setRfqheaderseqno(Integer value) {
        setAttributeInternal(RFQHEADERSEQNO, value);
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
     * Gets the attribute value for CONTACT_NO using the alias name ContactNo.
     * @return the CONTACT_NO
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_NO using the alias name ContactNo.
     * @param value value to set the CONTACT_NO
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
    }

    /**
     * Gets the attribute value for SUPPLIER_REMARKS using the alias name SupplierRemarks.
     * @return the SUPPLIER_REMARKS
     */
    public String getSupplierRemarks() {
        return (String) getAttributeInternal(SUPPLIERREMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_REMARKS using the alias name SupplierRemarks.
     * @param value value to set the SUPPLIER_REMARKS
     */
    public void setSupplierRemarks(String value) {
        setAttributeInternal(SUPPLIERREMARKS, value);
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
     * Gets the attribute value for MODIFIEDDATE using the alias name Modifieddate.
     * @return the MODIFIEDDATE
     */
    public Date getModifieddate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDDATE using the alias name Modifieddate.
     * @param value value to set the MODIFIEDDATE
     */
    public void setModifieddate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for TXT_RFQ_HEADER_CODE using the alias name txtRfqHeaderCode.
     * @return the TXT_RFQ_HEADER_CODE
     */
    public String gettxtRfqHeaderCode() {
        return (String) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_RFQ_HEADER_CODE using the alias name txtRfqHeaderCode.
     * @param value value to set the TXT_RFQ_HEADER_CODE
     */
    public void settxtRfqHeaderCode(String value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseRfqHeaderView.
     */
    public Row getSrPurchaseRfqHeaderView() {
        return (Row) getAttributeInternal(SRPURCHASERFQHEADERVIEW);
    }

    /**
     * Sets the master-detail link SrPurchaseRfqHeaderView between this object and <code>value</code>.
     */
    public void setSrPurchaseRfqHeaderView(Row value) {
        setAttributeInternal(SRPURCHASERFQHEADERVIEW, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseBidHeaderView.
     */
    public RowIterator getSrPurchaseBidHeaderView() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDHEADERVIEW);
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
     * Gets the view accessor <code>RowSet</code> AccPuSuppliersVO.
     */
    public RowSet getAccPuSuppliersVO() {
        return (RowSet) getAttributeInternal(ACCPUSUPPLIERSVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getSrPurchaseRfqHeaderView().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}
