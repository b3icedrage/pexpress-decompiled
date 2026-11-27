package com.impl.core.backend.modelsResponse;

import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.AbstractC7783yF;
import defpackage.C5807oq;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00102\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/impl/core/backend/modelsResponse/BetOpenFailedResponseImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "LyF;", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "", "amount", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "error", "getError", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BetOpenFailedResponseImpl extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<AbstractC7783yF> {

    @NotNull
    public static final String NAME = "failopenOrder";

    @InterfaceC2691aI1("amount")
    @Nullable
    private final Double amount;

    @InterfaceC2691aI1("asset")
    @Nullable
    private final String asset;

    @InterfaceC2691aI1("error")
    @Nullable
    private final String error;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r0.equals("NotEnoughMoney") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r0.equals("NotEnoughFunds") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "message");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        return new defpackage.C7141vB0(r0, r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.InterfaceC1247It1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC7783yF a() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.core.backend.modelsResponse.BetOpenFailedResponseImpl.a():java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetOpenFailedResponseImpl)) {
            return false;
        }
        BetOpenFailedResponseImpl betOpenFailedResponseImpl = (BetOpenFailedResponseImpl) obj;
        return Intrinsics.a(this.asset, betOpenFailedResponseImpl.asset) && Intrinsics.a(this.amount, betOpenFailedResponseImpl.amount) && Intrinsics.a(this.error, betOpenFailedResponseImpl.error);
    }

    public final int hashCode() {
        String str = this.asset;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.amount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.error;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.asset;
        Double d = this.amount;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("BetOpenFailedResponseImpl(asset=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", error=");
        return C5807oq.b(sb, str2, ")");
    }
}
