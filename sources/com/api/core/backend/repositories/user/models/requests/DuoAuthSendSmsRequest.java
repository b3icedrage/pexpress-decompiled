package com.api.core.backend.repositories.user.models.requests;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/DuoAuthSendSmsRequest;", "", "", "method", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "token", "getToken", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DuoAuthSendSmsRequest {

    @NotNull
    private final String method;

    @NotNull
    private final String token;
}
