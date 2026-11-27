package com.api.core.deeplinks.models;

import defpackage.C4694ja0;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/api/core/deeplinks/models/DeeplinkData;", "", "", "type", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "action", "getAction", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeeplinkData {

    @NotNull
    private final String action;

    @NotNull
    private final String type;

    public DeeplinkData() {
        Intrinsics.checkNotNullParameter("one_action", "type");
        Intrinsics.checkNotNullParameter("navigate_to_support_chat", "action");
        this.type = "one_action";
        this.action = "navigate_to_support_chat";
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeeplinkData)) {
            return false;
        }
        DeeplinkData deeplinkData = (DeeplinkData) obj;
        return Intrinsics.a(this.type, deeplinkData.type) && Intrinsics.a(this.action, deeplinkData.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return C4694ja0.a("DeeplinkData(type=", this.type, ", action=", this.action, ")");
    }
}
