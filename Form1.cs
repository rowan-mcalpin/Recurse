namespace Recurse
{
    public partial class Recurse : Form
    {
        private string FileContent = String.Empty;
        public Recurse()
        {
            InitializeComponent();
            OpenFileDialog.RestoreDirectory = true;
            SaveFileDialog.RestoreDirectory = true;
            FileName.Focus();
            KeyPreview = true;
        }

        private void TextArea_TextChanged(object sender, EventArgs e)
        {
            FileContent = TextArea.Text;
        }

        private void Open()
        {
            OpenFileDialog.ShowDialog(this);
        }

        private void Save()
        {
            SaveFileDialog.ShowDialog(this);
        }

        private void UpdateFileName(string path)
        {
            Text = "Recurse | " + path;
            string[] name = path.Split(new char[] { '\\', '/' });
            FileName.Text = name[name.Length-1];
        }

        private void Recurse_KeyDown(object sender, KeyEventArgs e)
        {
            if(e.Control && e.KeyCode == Keys.O)
            {
                Open();
            } else if(e.Control && e.KeyCode == Keys.S)
            {
                Save();
            } else if(e.Control && e.KeyCode == Keys.Q)
            {
                if (MessageBox.Show("Are you sure you want to exit?", "Confirm Exit", MessageBoxButtons.YesNo) == DialogResult.Yes)
                {
                    Environment.Exit(0);
                }
            }
        }

        private void OpenFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            var filePath = OpenFileDialog.FileName;

            var fileStream = OpenFileDialog.OpenFile();

            using (StreamReader reader = new StreamReader(fileStream))
            {
                FileContent = reader.ReadToEnd();
                UpdateFileName(filePath);
                TextArea.Text = FileContent;
            }
        }

        private void SaveFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            File.WriteAllText(SaveFileDialog.FileName, FileContent);
            UpdateFileName(SaveFileDialog.FileName);
        }
    }
}