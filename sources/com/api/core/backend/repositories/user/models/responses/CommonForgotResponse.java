package com.api.core.backend.repositories.user.models.responses;

import defpackage.InterfaceC1247It1;
import defpackage.WF;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonForgotResponse;", "LIt1;", "LWF;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "token", "getToken", "method", "getMethod", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonForgotResponse implements InterfaceC1247It1<WF> {

    @Nullable
    private final String code = "";

    @Nullable
    private final String token = "";

    @Nullable
    private final String method = "";

    @Override // defpackage.InterfaceC1247It1
    public final WF a() {
        String str = this.token;
        return str != null ? new WF(str) : new WF("");
    }
}
