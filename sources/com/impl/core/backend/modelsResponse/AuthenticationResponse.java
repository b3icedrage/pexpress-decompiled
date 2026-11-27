package com.impl.core.backend.modelsResponse;

import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.C1332Jw;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/modelsResponse/AuthenticationResponse;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "", "timeZoneOffset", "I", "f", "()I", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticationResponse extends WebSocketResponseAbstractImpl {

    @NotNull
    public static final String NAME = "successauth";

    @InterfaceC2691aI1("timezone")
    private final int timeZoneOffset;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthenticationResponse) && this.timeZoneOffset == ((AuthenticationResponse) obj).timeZoneOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final int hashCode() {
        return Integer.hashCode(this.timeZoneOffset);
    }

    @NotNull
    public final String toString() {
        return C1332Jw.a(this.timeZoneOffset, "AuthenticationResponse(timeZoneOffset=", ")");
    }
}
