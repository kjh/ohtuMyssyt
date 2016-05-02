/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myssyt.bibtex;

/**
 *
 * @author jphkylli
 */
public class IncollectionPanel extends javax.swing.JPanel {
     /*
    A part of a book having its own title. 
        Required fields: 
            author, title, booktitle, publisher, year. 
        Optional fields: 
            editor, volume or number, series, type, chapter, pages, address, edition, month, note.
    */

    /**
     * Creates new form BookPanel
     */
    public IncollectionPanel() {
        initComponents();
    }
    
    public void clearTextFields() {
        
        optionalFieldsScrollPane.getVerticalScrollBar().setValue(optionalFieldsScrollPane.getVerticalScrollBar().getMinimum());
        
        getTfBibtexkey().setText("");
        
        getTfAuthor().setText("");
        getTfTitle().setText("");
        getTfBooktitle().setText("");
        getTfPublisher().setText("");
        getTfYear().setText("");
        
        getTfEditor().setText("");
        getTfVolume().setText("");
        getTfNumber().setText("");
        getTfSeries().setText("");
        getTfType().setText("");
        getTfChapter().setText("");
        getTfPages().setText("");
        getTfAddress().setText("");
        getTfEdition().setText("");
        getTfMonth().setText("");
        getTfNote().setText("");
        
        getcExport().setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lAuthor = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        tfTitle = new javax.swing.JTextField();
        lTitle = new javax.swing.JLabel();
        tfBooktitle = new javax.swing.JTextField();
        lBooktitle = new javax.swing.JLabel();
        tfYear = new javax.swing.JTextField();
        lYear = new javax.swing.JLabel();
        tfBibtexkey = new javax.swing.JTextField();
        lBibtexkey = new javax.swing.JLabel();
        optionalFieldsScrollPane = new javax.swing.JScrollPane();
        optionalFieldsPanel = new javax.swing.JPanel();
        lEditor = new javax.swing.JLabel();
        tfEditor = new javax.swing.JTextField();
        tfVolume = new javax.swing.JTextField();
        tfNumber = new javax.swing.JTextField();
        tfSeries = new javax.swing.JTextField();
        tfType = new javax.swing.JTextField();
        lVolume = new javax.swing.JLabel();
        lNumber = new javax.swing.JLabel();
        lSeries = new javax.swing.JLabel();
        lType = new javax.swing.JLabel();
        tfChapter = new javax.swing.JTextField();
        tfPages = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfEdition = new javax.swing.JTextField();
        lChapter = new javax.swing.JLabel();
        lPages = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lEdition = new javax.swing.JLabel();
        tfMonth = new javax.swing.JTextField();
        tfNote = new javax.swing.JTextField();
        lMonth = new javax.swing.JLabel();
        lNote = new javax.swing.JLabel();
        tfPublisher = new javax.swing.JTextField();
        lPublisher = new javax.swing.JLabel();
        cExport = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Incollection"));
        setPreferredSize(new java.awt.Dimension(100, 100));

        lAuthor.setText("Author");

        lTitle.setText("Title");

        lBooktitle.setText("Booktitle");

        lYear.setText("Year");

        lBibtexkey.setText("Bibtexkey");

        optionalFieldsScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Optional Fields"));
        optionalFieldsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lEditor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lEditor.setText("Editor");
        lEditor.setPreferredSize(new java.awt.Dimension(90, 16));

        lVolume.setText("Volume");

        lNumber.setText("Number");

        lSeries.setText("Series");

        lType.setText("Type");

        lChapter.setText("Chapter");

        lPages.setText("Pages");

        lAddress.setText("Address");

        lEdition.setText("Edition");

        lMonth.setText("Month");

        lNote.setText("Note");

        javax.swing.GroupLayout optionalFieldsPanelLayout = new javax.swing.GroupLayout(optionalFieldsPanel);
        optionalFieldsPanel.setLayout(optionalFieldsPanelLayout);
        optionalFieldsPanelLayout.setHorizontalGroup(
            optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalFieldsPanelLayout.createSequentialGroup()
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lVolume)
                    .addComponent(lNumber)
                    .addComponent(lSeries)
                    .addComponent(lType)
                    .addComponent(lChapter)
                    .addComponent(lPages)
                    .addComponent(lAddress)
                    .addComponent(lEdition)
                    .addComponent(lEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMonth)
                    .addComponent(lNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfVolume)
                    .addComponent(tfEditor)
                    .addComponent(tfNumber)
                    .addComponent(tfSeries)
                    .addComponent(tfType)
                    .addComponent(tfChapter)
                    .addComponent(tfPages)
                    .addComponent(tfAddress)
                    .addComponent(tfEdition, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addComponent(tfMonth)
                    .addComponent(tfNote))
                .addContainerGap())
        );
        optionalFieldsPanelLayout.setVerticalGroup(
            optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSeries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lChapter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEdition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNote))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionalFieldsScrollPane.setViewportView(optionalFieldsPanel);

        lPublisher.setText("Publisher");

        cExport.setText("Export");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optionalFieldsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lAuthor)
                            .addComponent(lTitle)
                            .addComponent(lBooktitle)
                            .addComponent(lYear)
                            .addComponent(lBibtexkey))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAuthor)
                            .addComponent(tfTitle)
                            .addComponent(tfBooktitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfBibtexkey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(tfYear, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lPublisher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPublisher))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cExport)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAuthor)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBooktitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lYear)
                    .addComponent(tfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPublisher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBibtexkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBibtexkey)
                    .addComponent(cExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionalFieldsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cExport;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lAuthor;
    private javax.swing.JLabel lBibtexkey;
    private javax.swing.JLabel lBooktitle;
    private javax.swing.JLabel lChapter;
    private javax.swing.JLabel lEdition;
    private javax.swing.JLabel lEditor;
    private javax.swing.JLabel lMonth;
    private javax.swing.JLabel lNote;
    private javax.swing.JLabel lNumber;
    private javax.swing.JLabel lPages;
    private javax.swing.JLabel lPublisher;
    private javax.swing.JLabel lSeries;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lType;
    private javax.swing.JLabel lVolume;
    private javax.swing.JLabel lYear;
    private javax.swing.JPanel optionalFieldsPanel;
    private javax.swing.JScrollPane optionalFieldsScrollPane;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBibtexkey;
    private javax.swing.JTextField tfBooktitle;
    private javax.swing.JTextField tfChapter;
    private javax.swing.JTextField tfEdition;
    private javax.swing.JTextField tfEditor;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfNote;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfPages;
    private javax.swing.JTextField tfPublisher;
    private javax.swing.JTextField tfSeries;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfType;
    private javax.swing.JTextField tfVolume;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tfAddress
     */
    public javax.swing.JTextField getTfAddress() {
        return tfAddress;
    }

    /**
     * @param tfAddress the tfAddress to set
     */
    public void setTfAddress(javax.swing.JTextField tfAddress) {
        this.tfAddress = tfAddress;
    }

    /**
     * @return the tfAuthor
     */
    public javax.swing.JTextField getTfAuthor() {
        return tfAuthor;
    }

    /**
     * @param tfAuthor the tfAuthor to set
     */
    public void setTfAuthor(javax.swing.JTextField tfAuthor) {
        this.tfAuthor = tfAuthor;
    }

    /**
     * @return the tfBibtexkey
     */
    public javax.swing.JTextField getTfBibtexkey() {
        return tfBibtexkey;
    }

    /**
     * @param tfBibtexkey the tfBibtexkey to set
     */
    public void setTfBibtexkey(javax.swing.JTextField tfBibtexkey) {
        this.tfBibtexkey = tfBibtexkey;
    }

    /**
     * @return the tfBooktitle
     */
    public javax.swing.JTextField getTfBooktitle() {
        return tfBooktitle;
    }

    /**
     * @param tfBooktitle the tfBooktitle to set
     */
    public void setTfBooktitle(javax.swing.JTextField tfBooktitle) {
        this.tfBooktitle = tfBooktitle;
    }

    /**
     * @return the tfChapter
     */
    public javax.swing.JTextField getTfChapter() {
        return tfChapter;
    }

    /**
     * @param tfChapter the tfChapter to set
     */
    public void setTfChapter(javax.swing.JTextField tfChapter) {
        this.tfChapter = tfChapter;
    }

    /**
     * @return the tfEdition
     */
    public javax.swing.JTextField getTfEdition() {
        return tfEdition;
    }

    /**
     * @param tfEdition the tfEdition to set
     */
    public void setTfEdition(javax.swing.JTextField tfEdition) {
        this.tfEdition = tfEdition;
    }

    /**
     * @return the tfEditor
     */
    public javax.swing.JTextField getTfEditor() {
        return tfEditor;
    }

    /**
     * @param tfEditor the tfEditor to set
     */
    public void setTfEditor(javax.swing.JTextField tfEditor) {
        this.tfEditor = tfEditor;
    }

    /**
     * @return the tfMonth
     */
    public javax.swing.JTextField getTfMonth() {
        return tfMonth;
    }

    /**
     * @param tfMonth the tfMonth to set
     */
    public void setTfMonth(javax.swing.JTextField tfMonth) {
        this.tfMonth = tfMonth;
    }

    /**
     * @return the tfNote
     */
    public javax.swing.JTextField getTfNote() {
        return tfNote;
    }

    /**
     * @param tfNote the tfNote to set
     */
    public void setTfNote(javax.swing.JTextField tfNote) {
        this.tfNote = tfNote;
    }

    /**
     * @return the tfNumber
     */
    public javax.swing.JTextField getTfNumber() {
        return tfNumber;
    }

    /**
     * @param tfNumber the tfNumber to set
     */
    public void setTfNumber(javax.swing.JTextField tfNumber) {
        this.tfNumber = tfNumber;
    }

    /**
     * @return the tfPages
     */
    public javax.swing.JTextField getTfPages() {
        return tfPages;
    }

    /**
     * @param tfPages the tfPages to set
     */
    public void setTfPages(javax.swing.JTextField tfPages) {
        this.tfPages = tfPages;
    }

    /**
     * @return the tfPublisher
     */
    public javax.swing.JTextField getTfPublisher() {
        return tfPublisher;
    }

    /**
     * @param tfPublisher the tfPublisher to set
     */
    public void setTfPublisher(javax.swing.JTextField tfPublisher) {
        this.tfPublisher = tfPublisher;
    }

    /**
     * @return the tfSeries
     */
    public javax.swing.JTextField getTfSeries() {
        return tfSeries;
    }

    /**
     * @param tfSeries the tfSeries to set
     */
    public void setTfSeries(javax.swing.JTextField tfSeries) {
        this.tfSeries = tfSeries;
    }

    /**
     * @return the tfTitle
     */
    public javax.swing.JTextField getTfTitle() {
        return tfTitle;
    }

    /**
     * @param tfTitle the tfTitle to set
     */
    public void setTfTitle(javax.swing.JTextField tfTitle) {
        this.tfTitle = tfTitle;
    }

    /**
     * @return the tfType
     */
    public javax.swing.JTextField getTfType() {
        return tfType;
    }

    /**
     * @param tfType the tfType to set
     */
    public void setTfType(javax.swing.JTextField tfType) {
        this.tfType = tfType;
    }

    /**
     * @return the tfVolume
     */
    public javax.swing.JTextField getTfVolume() {
        return tfVolume;
    }

    /**
     * @param tfVolume the tfVolume to set
     */
    public void setTfVolume(javax.swing.JTextField tfVolume) {
        this.tfVolume = tfVolume;
    }

    /**
     * @return the tfYear
     */
    public javax.swing.JTextField getTfYear() {
        return tfYear;
    }

    /**
     * @param tfYear the tfYear to set
     */
    public void setTfYear(javax.swing.JTextField tfYear) {
        this.tfYear = tfYear;
    }

    /**
     * @return the cExport
     */
    public javax.swing.JCheckBox getcExport() {
        return cExport;
    }

    /**
     * @param cExport the cExport to set
     */
    public void setcExport(javax.swing.JCheckBox cExport) {
        this.cExport = cExport;
    }

}