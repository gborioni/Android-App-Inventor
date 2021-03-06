// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.appinventor.shared.rpc.project;

import java.io.Serializable;

/**
 * Describes a file (using its project and file IDs).
 *
 */
public class FileDescriptor implements Serializable {

  // For serialization
  private static final long serialVersionUID = -690489735274323033L;

  // Fields describing the file
  private long projectId;
  private String fileId;

  /**
   * Default constructor (for serialization only).
   * Unfortunately this will prevent any fields from being marked as final!
   */
  protected FileDescriptor() {
  }

  /**
   * Creates a new descriptor for a file and its content.
   *
   * @param projectId  project ID
   * @param fileId  file ID
   */
  public FileDescriptor(long projectId, String fileId) {
    this.projectId = projectId;
    this.fileId = fileId;
  }

  /**
   * Returns the project ID for the associated file.
   *
   * @return  project ID
   */
  public long getProjectId() {
    return projectId;
  }

  /**
   * Returns the file ID for the associated file.
   *
   * @return  file ID
   */
  public String getFileId() {
    return fileId;
  }
}
