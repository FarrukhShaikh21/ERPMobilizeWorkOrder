package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 12:15:54 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseRfqLinesImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfqlinesseqno,
        Rfqheaderseqno,
        RequiredBy,
        NoteToBuyer,
        NoteToSupplier,
        SupplierItemName,
        RequesterId,
        ItemId,
        Quantity,
        AproxPrice,
        Remarks,
        ProjectId,
        DepartmentId,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        txtItemName,
        Demandlinesseq,
        SrPurchaseRfqHeader,
        SrItems,
        SrPurchaseDemandLines;
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


    public static final int RFQLINESSEQNO = AttributesEnum.Rfqlinesseqno.index();
    public static final int RFQHEADERSEQNO = AttributesEnum.Rfqheaderseqno.index();
    public static final int REQUIREDBY = AttributesEnum.RequiredBy.index();
    public static final int NOTETOBUYER = AttributesEnum.NoteToBuyer.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int SUPPLIERITEMNAME = AttributesEnum.SupplierItemName.index();
    public static final int REQUESTERID = AttributesEnum.RequesterId.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int APROXPRICE = AttributesEnum.AproxPrice.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int DEMANDLINESSEQ = AttributesEnum.Demandlinesseq.index();
    public static final int SRPURCHASERFQHEADER = AttributesEnum.SrPurchaseRfqHeader.index();
    public static final int SRITEMS = AttributesEnum.SrItems.index();
    public static final int SRPURCHASEDEMANDLINES = AttributesEnum.SrPurchaseDemandLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseRfqLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseRfqLines");
    }


    /**
     * Gets the attribute value for Rfqlinesseqno, using the alias name Rfqlinesseqno.
     * @return the value of Rfqlinesseqno
     */
    public Integer getRfqlinesseqno() {
        return (Integer) getAttributeInternal(RFQLINESSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rfqlinesseqno.
     * @param value value to set the Rfqlinesseqno
     */
    public void setRfqlinesseqno(Integer value) {
        setAttributeInternal(RFQLINESSEQNO, value);
    }

    /**
     * Gets the attribute value for Rfqheaderseqno, using the alias name Rfqheaderseqno.
     * @return the value of Rfqheaderseqno
     */
    public Integer getRfqheaderseqno() {
        return (Integer) getAttributeInternal(RFQHEADERSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rfqheaderseqno.
     * @param value value to set the Rfqheaderseqno
     */
    public void setRfqheaderseqno(Integer value) {
        setAttributeInternal(RFQHEADERSEQNO, value);
    }

    /**
     * Gets the attribute value for RequiredBy, using the alias name RequiredBy.
     * @return the value of RequiredBy
     */
    public Date getRequiredBy() {
        return (Date) getAttributeInternal(REQUIREDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequiredBy.
     * @param value value to set the RequiredBy
     */
    public void setRequiredBy(Date value) {
        setAttributeInternal(REQUIREDBY, value);
    }

    /**
     * Gets the attribute value for NoteToBuyer, using the alias name NoteToBuyer.
     * @return the value of NoteToBuyer
     */
    public String getNoteToBuyer() {
        return (String) getAttributeInternal(NOTETOBUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteToBuyer.
     * @param value value to set the NoteToBuyer
     */
    public void setNoteToBuyer(String value) {
        setAttributeInternal(NOTETOBUYER, value);
    }

    /**
     * Gets the attribute value for NoteToSupplier, using the alias name NoteToSupplier.
     * @return the value of NoteToSupplier
     */
    public String getNoteToSupplier() {
        return (String) getAttributeInternal(NOTETOSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteToSupplier.
     * @param value value to set the NoteToSupplier
     */
    public void setNoteToSupplier(String value) {
        setAttributeInternal(NOTETOSUPPLIER, value);
    }

    /**
     * Gets the attribute value for SupplierItemName, using the alias name SupplierItemName.
     * @return the value of SupplierItemName
     */
    public String getSupplierItemName() {
        return (String) getAttributeInternal(SUPPLIERITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierItemName.
     * @param value value to set the SupplierItemName
     */
    public void setSupplierItemName(String value) {
        setAttributeInternal(SUPPLIERITEMNAME, value);
    }

    /**
     * Gets the attribute value for RequesterId, using the alias name RequesterId.
     * @return the value of RequesterId
     */
    public Integer getRequesterId() {
        return (Integer) getAttributeInternal(REQUESTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequesterId.
     * @param value value to set the RequesterId
     */
    public void setRequesterId(Integer value) {
        setAttributeInternal(REQUESTERID, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the value of ItemId
     */
    public Integer getItemId() {
        return (Integer) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Integer value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for AproxPrice, using the alias name AproxPrice.
     * @return the value of AproxPrice
     */
    public BigDecimal getAproxPrice() {
        return (BigDecimal) getAttributeInternal(APROXPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AproxPrice.
     * @param value value to set the AproxPrice
     */
    public void setAproxPrice(BigDecimal value) {
        setAttributeInternal(APROXPRICE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public Integer getProjectId() {
        return (Integer) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Integer value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public String getDepartmentId() {
        return (String) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(String value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy.
     * @return the value of ModifiedBy
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedBy.
     * @param value value to set the ModifiedBy
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for Modifieddate, using the alias name Modifieddate.
     * @return the value of Modifieddate
     */
    public Date getModifieddate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifieddate.
     * @param value value to set the Modifieddate
     */
    public void setModifieddate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for txtItemName, using the alias name txtItemName.
     * @return the value of txtItemName
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemName.
     * @param value value to set the txtItemName
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for Demandlinesseq, using the alias name Demandlinesseq.
     * @return the value of Demandlinesseq
     */
    public Integer getDemandlinesseq() {
        return (Integer) getAttributeInternal(DEMANDLINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Demandlinesseq.
     * @param value value to set the Demandlinesseq
     */
    public void setDemandlinesseq(Integer value) {
        setAttributeInternal(DEMANDLINESSEQ, value);
    }

    /**
     * @return the associated entity SrPurchaseRfqHeaderImpl.
     */
    public SrPurchaseRfqHeaderImpl getSrPurchaseRfqHeader() {
        return (SrPurchaseRfqHeaderImpl) getAttributeInternal(SRPURCHASERFQHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseRfqHeaderImpl.
     */
    public void setSrPurchaseRfqHeader(SrPurchaseRfqHeaderImpl value) {
        setAttributeInternal(SRPURCHASERFQHEADER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSrItems() {
        return (EntityImpl) getAttributeInternal(SRITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSrItems(EntityImpl value) {
        setAttributeInternal(SRITEMS, value);
    }

    /**
     * @return the associated entity SrPurchaseDemandLinesImpl.
     */
    public SrPurchaseDemandLinesImpl getSrPurchaseDemandLines() {
        return (SrPurchaseDemandLinesImpl) getAttributeInternal(SRPURCHASEDEMANDLINES);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseDemandLinesImpl.
     */
    public void setSrPurchaseDemandLines(SrPurchaseDemandLinesImpl value) {
        setAttributeInternal(SRPURCHASEDEMANDLINES, value);
    }


    /**
     * @param rfqlinesseqno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rfqlinesseqno) {
        return new Key(new Object[] { rfqlinesseqno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Rfqlinesseqno");
        setERPSolPKSeqName("SR_PURCHASE_RFQ_LINES_SEQ");
    //        setERPISGenertePK("NO");
    //        SequenceImpl seq = new SequenceImpl("SO_SALES_ORDER_SEQ", getDBTransaction());
    //        setSalesorderseq(seq.getSequenceNumber());
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

