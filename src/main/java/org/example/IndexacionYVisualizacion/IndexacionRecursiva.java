package org.example.IndexacionYVisualizacion;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
public class IndexacionRecursiva {

    private Map<String, FileMetadata> fileMetadataMap = new HashMap<>();

    public void indexarDirectorio(File directorio) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexarDirectorio(archivo);
                } else {
                    FileMetadata metadata = new FileMetadata(archivo.length(), archivo.lastModified());
                    fileMetadataMap.put(archivo.getAbsolutePath(), metadata);
                }
            }
        }
    }

    private void indexearDirectorioRecursivo(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexearDirectorioRecursivo(archivo);
                } else {
                    String filePath = archivo.getAbsolutePath();
                    FileMetadata metadata = new FileMetadata(archivo.length(), archivo.lastModified());
                }
            }
        }
    }
}

class FileMetadata {
    private long size;
    private long lastModified;

    public FileMetadata(long size, long lastModified) {
        this.size = size;
        this.lastModified = lastModified;
    }

    public long getSize() {
        return size;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

}
