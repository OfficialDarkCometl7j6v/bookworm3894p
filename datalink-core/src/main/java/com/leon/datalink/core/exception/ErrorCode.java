

package com.leon.datalink.core.exception;

/**
 * Core module code starts with 40001.
 *
 * @author Leon
 */
public enum ErrorCode {
    
    /**
     * unknow error.
     */
    UnKnowError(40001),
    
    // kv error
    
    /**
     * KVStorage write error.
     */
    KVStorageWriteError(40100),
    
    /**
     * KVStorage read error.
     */
    KVStorageReadError(40101),
    
    /**
     * KVStorage delete error.
     */
    KVStorageDeleteError(40102),
    
    /**
     * KVStorage snapshot save error.
     */
    KVStorageSnapshotSaveError(40103),
    
    /**
     * KVStorage snapshot load error.
     */
    KVStorageSnapshotLoadError(40104),
    
    /**
     * KVStorage reset error.
     */
    KVStorageResetError(40105),
    
    /**
     * KVStorage create error.
     */
    KVStorageCreateError(40106),
    
    /**
     * KVStorage write error.
     */
    KVStorageBatchWriteError(40107),
    
    // disk error
    
    /**
     * mkdir error.
     */
    IOMakeDirError(40201),
    
    /**
     * copy directory has error.
     */
    IOCopyDirError(40202);

    
    private final int code;
    
    ErrorCode(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
}
