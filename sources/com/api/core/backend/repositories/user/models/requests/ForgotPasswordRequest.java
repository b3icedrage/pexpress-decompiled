package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/ForgotPasswordRequest;", "", "", "email", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "captchaToken", R51.PUSH_ADDITIONAL_DATA_KEY, "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForgotPasswordRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final String captchaToken;

    @InterfaceC2691aI1("identifier")
    @NotNull
    private final String email;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/ForgotPasswordRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ForgotPasswordRequest() {
        this("", null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaptchaToken() {
        return this.captchaToken;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public ForgotPasswordRequest(@NotNull String email, @Nullable String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.captchaToken = str;
    }
}
