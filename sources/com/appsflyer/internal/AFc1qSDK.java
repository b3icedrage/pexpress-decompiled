package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK {

    @NotNull
    final List<AFc1pSDK> d;

    public AFc1qSDK(@NotNull List<AFc1pSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1qSDK) && Intrinsics.a(this.d, ((AFc1qSDK) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.d + ")";
    }
}
