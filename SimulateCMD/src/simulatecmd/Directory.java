
package simulatecmd;

import java.util.Arrays;

public class Directory {
    private File[] files;
    private int fIndex;
    private Directory[] directorys;
    private int dIndex;
    private String name;
    private Directory parent;
    private String path;
    
    public Directory (String name, Directory parent) {
        this.name = name;
        this.parent = parent;
        this.files = new File[2];
        this.fIndex = 0;
        this.directorys = new Directory[2];
        this.dIndex = 0;
        
    }
    
    public void createFile (String name) {
        if (fIndex == files.length) {
            this.files = Arrays.copyOf(this.files,this.files.length * 2);
        }
        this.files[fIndex++] = new File(name);
    }
    
    public void createDirectory (String name,Directory parent) {
        if (dIndex == directorys.length) {
            this.directorys = Arrays.copyOf(this.directorys,this.directorys.length * 2);
        }
        this.directorys[dIndex++] = new Directory(name, parent);
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < dIndex; i++) {
            str = str + "[" + directorys[i].getName() + "]" + "\n";
        }
        for(int i = 0; i < fIndex; i++) {
            str = str +  files[i].getName() + "\n";
        }
        str = str + "Total: " + getFindex() + " files  " + getDindex() + " directorys";
        return str;
    }
    
    public int getFindex () {
        return this.fIndex;
    }
    
    public int getDindex () {
        return this.dIndex;
    }
    
    public Directory getParent() {
        return parent;
    }
    
    public Directory intoDirectory (String name) {
        for(int i = 0; i < dIndex; i++) {
            if (directorys[i].getName().equals(name)) {
                return directorys[i];
            }
        }
        return null;
    }
    
    public Directory getDirectory(int index) {
        return directorys[index];
    }
    
    public File getFile(int index) {
        return files[index];
    }
        
    public String search(String key) {
        String str = "";
        
        if(dIndex > 0) {
            for (int i = 0; i < dIndex; i++) {
                if(directorys[i].name.contains(key)) {
                    str = str + getPath()+ "\\" +directorys[i].name + "\n";
                }
                str = str + directorys[i].search(key);
            }
        }
        
        if(fIndex > 0) {
            for (int i = 0; i < fIndex; i++) {
                if(files[i].getName().contains(key)) {
                    str = str + "\\" + directorys[i].getPath() +files[i].getName() + "\n";
                }
            }
        }
        
        return str;
    }
    
    public String getPath() {
        String str = "";
        str = "\\" + this.getParent().getName();
        return str;
    }
    
}
