package com.jivosite.sdk.network.retrofit.error;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.C6918u72;
import defpackage.EG0;
import defpackage.YH0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.jivosite.sdk.network.retrofit.error.ErrorResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/network/retrofit/error/ErrorResponseJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/network/retrofit/error/ErrorResponse;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<ErrorResponse> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<Boolean> b;

    @NotNull
    public final AbstractC5897pG0<Map<String, String>> c;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("ok", "violation_list");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"ok\", \"violation_list\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<Boolean> abstractC5897pG0C = moshi.c(Boolean.TYPE, c6702t60, "isOk");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(Boolean::c…emptySet(),\n      \"isOk\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<Map<String, String>> abstractC5897pG0C2 = moshi.c(C6918u72.d(Map.class, String.class, String.class), c6702t60, "violationList");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Types.newP…tySet(), \"violationList\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final ErrorResponse a(AbstractC8000zH0 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        Boolean boolA = null;
        Map<String, String> mapA = null;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0) {
                boolA = this.b.a(reader);
                if (boolA == null) {
                    EG0 eg0L = C6596sc2.l("isOk", "ok", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"isOk\", \"ok\",\n            reader)");
                    throw eg0L;
                }
            } else if (iQ == 1 && (mapA = this.c.a(reader)) == null) {
                EG0 eg0L2 = C6596sc2.l("violationList", "violation_list", reader);
                Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"violatio…\"violation_list\", reader)");
                throw eg0L2;
            }
        }
        reader.B0();
        if (boolA == null) {
            EG0 eg0F = C6596sc2.f("isOk", "ok", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"isOk\", \"ok\", reader)");
            throw eg0F;
        }
        boolean zBooleanValue = boolA.booleanValue();
        if (mapA != null) {
            return new ErrorResponse(zBooleanValue, mapA);
        }
        EG0 eg0F2 = C6596sc2.f("violationList", "violation_list", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"violati…\"violation_list\", reader)");
        throw eg0F2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, ErrorResponse errorResponse) {
        ErrorResponse errorResponse2 = errorResponse;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (errorResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("ok");
        this.b.e(writer, Boolean.valueOf(errorResponse2.a));
        writer.q("violation_list");
        this.c.e(writer, errorResponse2.b);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(ErrorResponse)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
