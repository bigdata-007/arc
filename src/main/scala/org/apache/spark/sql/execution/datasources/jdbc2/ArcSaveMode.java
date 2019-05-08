package org.apache.spark.sql.execution.datasources.jdbc2;

import org.apache.spark.annotation.InterfaceStability;

@InterfaceStability.Stable
public enum ArcSaveMode {

    Append,

    Overwrite,

    ErrorIfExists,

    Ignore,

    Update
}
