package com.jivosite.sdk.model.pojo.history;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.C6918u72;
import defpackage.EG0;
import defpackage.YH0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.history.HistoryJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/history/HistoryJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/history/History;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<History> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<List<HistoryMessage>> b;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("messages");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"messages\")");
        this.a = aVarA;
        AbstractC5897pG0<List<HistoryMessage>> abstractC5897pG0C = moshi.c(C6918u72.d(List.class, HistoryMessage.class), C6702t60.d, "messages");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(Types.newP…  emptySet(), \"messages\")");
        this.b = abstractC5897pG0C;
    }

    @Override // defpackage.AbstractC5897pG0
    public final History a(AbstractC8000zH0 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        List<HistoryMessage> listA = null;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0 && (listA = this.b.a(reader)) == null) {
                EG0 eg0L = C6596sc2.l("messages", "messages", reader);
                Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"messages\", \"messages\", reader)");
                throw eg0L;
            }
        }
        reader.B0();
        if (listA != null) {
            return new History(listA);
        }
        EG0 eg0F = C6596sc2.f("messages", "messages", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"messages\", \"messages\", reader)");
        throw eg0F;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, History history) {
        History history2 = history;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (history2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("messages");
        this.b.e(writer, history2.d);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(History)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
