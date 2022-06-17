namespace Recurse
{
    partial class Recurse
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.TextArea = new System.Windows.Forms.TextBox();
            this.FileName = new System.Windows.Forms.Label();
            this.OpenFileDialog = new System.Windows.Forms.OpenFileDialog();
            this.SaveFileDialog = new System.Windows.Forms.SaveFileDialog();
            this.SuspendLayout();
            // 
            // TextArea
            // 
            this.TextArea.AcceptsReturn = true;
            this.TextArea.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.TextArea.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(25)))), ((int)(((byte)(25)))), ((int)(((byte)(25)))));
            this.TextArea.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.TextArea.Font = new System.Drawing.Font("Segoe UI", 11F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.TextArea.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(225)))), ((int)(((byte)(225)))), ((int)(((byte)(225)))));
            this.TextArea.Location = new System.Drawing.Point(12, 42);
            this.TextArea.Multiline = true;
            this.TextArea.Name = "TextArea";
            this.TextArea.PlaceholderText = "Start typing to create a file or press Control+O to open one.";
            this.TextArea.Size = new System.Drawing.Size(776, 396);
            this.TextArea.TabIndex = 0;
            this.TextArea.WordWrap = false;
            this.TextArea.TextChanged += new System.EventHandler(this.TextArea_TextChanged);
            // 
            // FileName
            // 
            this.FileName.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.FileName.AutoSize = true;
            this.FileName.Font = new System.Drawing.Font("Cascadia Mono", 17F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.FileName.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(225)))), ((int)(((byte)(225)))), ((int)(((byte)(225)))));
            this.FileName.Location = new System.Drawing.Point(12, 9);
            this.FileName.Name = "FileName";
            this.FileName.Size = new System.Drawing.Size(117, 30);
            this.FileName.TabIndex = 1;
            this.FileName.Text = "Untitled";
            // 
            // OpenFileDialog
            // 
            this.OpenFileDialog.DefaultExt = "txt";
            this.OpenFileDialog.Title = "Open File | Recurse";
            this.OpenFileDialog.FileOk += new System.ComponentModel.CancelEventHandler(this.OpenFileDialog_FileOk);
            // 
            // SaveFileDialog
            // 
            this.SaveFileDialog.DefaultExt = "txt";
            this.SaveFileDialog.Title = "Save File | Recurse";
            this.SaveFileDialog.FileOk += new System.ComponentModel.CancelEventHandler(this.SaveFileDialog_FileOk);
            // 
            // Recurse
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(47)))), ((int)(((byte)(47)))), ((int)(((byte)(47)))));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.FileName);
            this.Controls.Add(this.TextArea);
            this.MinimumSize = new System.Drawing.Size(450, 300);
            this.Name = "Recurse";
            this.Text = "Recurse | No file";
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Recurse_KeyDown);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private TextBox TextArea;
        private Label FileName;
        private OpenFileDialog OpenFileDialog;
        private SaveFileDialog SaveFileDialog;
    }
}