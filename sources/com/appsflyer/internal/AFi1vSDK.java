package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {

    @NotNull
    public final Context AFLogger;

    @Nullable
    public AFi1ySDK d;

    public AFi1vSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AFLogger = context;
    }
}
