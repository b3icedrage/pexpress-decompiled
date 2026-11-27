package com.impl.core.backend.modelsRequest;

import com.impl.core.backend.abstractModels.WebSocketRequestImpl;
import defpackage.C5491nL;
import defpackage.EF0;
import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/modelsRequest/AuthenticationRequest;", "Lcom/impl/core/backend/abstractModels/WebSocketRequestImpl;", "Lcom/impl/core/backend/modelsRequest/AuthenticationRequest$Payload;", "payload", "Lcom/impl/core/backend/modelsRequest/AuthenticationRequest$Payload;", "f", "()Lcom/impl/core/backend/modelsRequest/AuthenticationRequest$Payload;", "Payload", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequest extends WebSocketRequestImpl<Payload> {

    @InterfaceC2691aI1("auth")
    @NotNull
    private final Payload payload;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/impl/core/backend/modelsRequest/AuthenticationRequest$Payload;", "", "", "session", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "", "isDemo", "I", "c", "()I", "", "uid", "J", "b", "()J", "platform", "getPlatform", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payload {
        private final int isDemo;
        private final int platform;

        @InterfaceC2691aI1("session")
        @NotNull
        private final String session;
        private final long uid;

        public Payload(String session, int i, long j) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.session = session;
            this.isDemo = i;
            this.uid = j;
            this.platform = 1;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getUid() {
            return this.uid;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIsDemo() {
            return this.isDemo;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.a(this.session, payload.session) && this.isDemo == payload.isDemo && this.uid == payload.uid && this.platform == payload.platform;
        }

        public final int hashCode() {
            return Integer.hashCode(this.platform) + C5491nL.a(EF0.a(this.isDemo, this.session.hashCode() * 31, 31), 31, this.uid);
        }

        @NotNull
        public final String toString() {
            return "Payload(session=" + this.session + ", isDemo=" + this.isDemo + ", uid=" + this.uid + ", platform=" + this.platform + ")";
        }
    }

    public AuthenticationRequest(@NotNull String session, int i, long j) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.payload = new Payload(session, i, j);
    }

    @Override // com.impl.core.backend.abstractModels.WebSocketRequestImpl
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @NotNull
    public final Payload f() {
        return this.payload;
    }
}
