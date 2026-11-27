package com.base.core.backend.modelsResponse;

import defpackage.C4694ja0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonCaptchaRequirementsResponse;", "", "", "Lcom/base/core/backend/modelsResponse/CommonCaptchaRequirementsResponse$CaptchaType;", "types", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "CaptchaType", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonCaptchaRequirementsResponse {

    @NotNull
    private final List<CaptchaType> types;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonCaptchaRequirementsResponse$CaptchaType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "key", "getKey", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CaptchaType {

        @NotNull
        private final String key;

        @NotNull
        private final String type;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CaptchaType)) {
                return false;
            }
            CaptchaType captchaType = (CaptchaType) obj;
            return Intrinsics.a(this.type, captchaType.type) && Intrinsics.a(this.key, captchaType.key);
        }

        public final int hashCode() {
            return this.key.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return C4694ja0.a("CaptchaType(type=", this.type, ", key=", this.key, ")");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCaptchaRequirementsResponse) && Intrinsics.a(this.types, ((CommonCaptchaRequirementsResponse) obj).types);
    }

    public final int hashCode() {
        return this.types.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonCaptchaRequirementsResponse(types=" + this.types + ")";
    }
}
