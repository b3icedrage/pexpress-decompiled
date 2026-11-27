package com.jivosite.sdk.model.pojo.message;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.EG0;
import defpackage.TZ0;
import defpackage.YH0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.message.ClientMessageJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/message/ClientMessageJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/message/ClientMessage;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<ClientMessage> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<Long> c;

    @NotNull
    public final AbstractC5897pG0<TZ0> d;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("context", "timestamp", "type", "data", "status");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"context\", \"timestamp…,\n      \"data\", \"status\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, "context");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…tySet(),\n      \"context\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<Long> abstractC5897pG0C2 = moshi.c(Long.TYPE, c6702t60, "timestamp");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.c = abstractC5897pG0C2;
        AbstractC5897pG0<TZ0> abstractC5897pG0C3 = moshi.c(TZ0.class, c6702t60, "status");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C3, "moshi.adapter(MessageSta…va, emptySet(), \"status\")");
        this.d = abstractC5897pG0C3;
    }

    @Override // defpackage.AbstractC5897pG0
    public final ClientMessage a(AbstractC8000zH0 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        Long lA = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        TZ0 tz0A = null;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ != -1) {
                AbstractC5897pG0<String> abstractC5897pG0 = this.b;
                if (iQ == 0) {
                    strA = abstractC5897pG0.a(reader);
                    if (strA == null) {
                        EG0 eg0L = C6596sc2.l("context", "context", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"context\"…       \"context\", reader)");
                        throw eg0L;
                    }
                } else if (iQ == 1) {
                    lA = this.c.a(reader);
                    if (lA == null) {
                        EG0 eg0L2 = C6596sc2.l("timestamp", "timestamp", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"timestam…     \"timestamp\", reader)");
                        throw eg0L2;
                    }
                } else if (iQ == 2) {
                    strA2 = abstractC5897pG0.a(reader);
                    if (strA2 == null) {
                        EG0 eg0L3 = C6596sc2.l("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"type\", \"type\",\n            reader)");
                        throw eg0L3;
                    }
                } else if (iQ == 3) {
                    strA3 = abstractC5897pG0.a(reader);
                    if (strA3 == null) {
                        EG0 eg0L4 = C6596sc2.l("data_", "data", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                        throw eg0L4;
                    }
                } else if (iQ == 4 && (tz0A = this.d.a(reader)) == null) {
                    EG0 eg0L5 = C6596sc2.l("status", "status", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L5, "unexpectedNull(\"status\",…        \"status\", reader)");
                    throw eg0L5;
                }
            } else {
                reader.u();
                reader.I();
            }
        }
        reader.B0();
        if (strA == null) {
            EG0 eg0F = C6596sc2.f("context", "context", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"context\", \"context\", reader)");
            throw eg0F;
        }
        if (lA == null) {
            EG0 eg0F2 = C6596sc2.f("timestamp", "timestamp", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"timestamp\", \"timestamp\", reader)");
            throw eg0F2;
        }
        long jLongValue = lA.longValue();
        if (strA2 == null) {
            EG0 eg0F3 = C6596sc2.f("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"type\", \"type\", reader)");
            throw eg0F3;
        }
        if (strA3 == null) {
            EG0 eg0F4 = C6596sc2.f("data_", "data", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"data_\", \"data\", reader)");
            throw eg0F4;
        }
        if (tz0A != null) {
            return new ClientMessage(strA, jLongValue, strA2, strA3, tz0A);
        }
        EG0 eg0F5 = C6596sc2.f("status", "status", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F5, "missingProperty(\"status\", \"status\", reader)");
        throw eg0F5;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, ClientMessage clientMessage) {
        ClientMessage clientMessage2 = clientMessage;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (clientMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("context");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, clientMessage2.a);
        writer.q("timestamp");
        this.c.e(writer, Long.valueOf(clientMessage2.b));
        writer.q("type");
        abstractC5897pG0.e(writer, clientMessage2.c);
        writer.q("data");
        abstractC5897pG0.e(writer, clientMessage2.d);
        writer.q("status");
        this.d.e(writer, clientMessage2.e);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(ClientMessage)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
