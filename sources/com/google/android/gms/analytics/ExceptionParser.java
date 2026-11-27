package com.google.android.gms.analytics;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ExceptionParser {
    @NonNull
    String getDescription(String str, @NonNull Throwable th);
}
