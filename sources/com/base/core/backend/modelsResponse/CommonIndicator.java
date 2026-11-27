package com.base.core.backend.modelsResponse;

import defpackage.C1039Gc0;
import defpackage.C2983be;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.EnumC2121Ty0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonIndicator;", "", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "description", "getDescription", "key", "getKey", "", "activationRequired", "Z", "getActivationRequired", "()Z", "", "LTy0;", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "", "priority", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonIndicator {
    private final boolean activationRequired;

    @NotNull
    private final String description;

    @NotNull
    private final String key;

    @Nullable
    private final Integer priority;

    @NotNull
    private final List<EnumC2121Ty0> tags;

    @NotNull
    private final String title;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonIndicator)) {
            return false;
        }
        CommonIndicator commonIndicator = (CommonIndicator) obj;
        return Intrinsics.a(this.title, commonIndicator.title) && Intrinsics.a(this.description, commonIndicator.description) && Intrinsics.a(this.key, commonIndicator.key) && this.activationRequired == commonIndicator.activationRequired && Intrinsics.a(this.tags, commonIndicator.tags) && Intrinsics.a(this.priority, commonIndicator.priority);
    }

    public final int hashCode() {
        int iB = C5491nL.b(C2983be.a(C1039Gc0.b(C1039Gc0.b(this.title.hashCode() * 31, 31, this.description), 31, this.key), this.activationRequired, 31), 31, this.tags);
        Integer num = this.priority;
        return iB + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.key;
        boolean z = this.activationRequired;
        List<EnumC2121Ty0> list = this.tags;
        Integer num = this.priority;
        StringBuilder sbA = C5896pG.a("CommonIndicator(title=", str, ", description=", str2, ", key=");
        sbA.append(str3);
        sbA.append(", activationRequired=");
        sbA.append(z);
        sbA.append(", tags=");
        sbA.append(list);
        sbA.append(", priority=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }
}
