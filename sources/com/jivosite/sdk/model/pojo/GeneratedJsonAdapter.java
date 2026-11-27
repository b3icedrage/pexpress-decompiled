package com.jivosite.sdk.model.pojo;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.EG0;
import defpackage.YH0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.CustomDataJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/CustomDataJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/CustomData;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<CustomData> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("content", "title", "link", "key");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"content\", \"title\", \"link\", \"key\")");
        this.a = aVarA;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, C6702t60.d, "content");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…tySet(),\n      \"content\")");
        this.b = abstractC5897pG0C;
    }

    @Override // defpackage.AbstractC5897pG0
    public final CustomData a(AbstractC8000zH0 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ != -1) {
                AbstractC5897pG0<String> abstractC5897pG0 = this.b;
                if (iQ == 0) {
                    strA = abstractC5897pG0.a(reader);
                    if (strA == null) {
                        EG0 eg0L = C6596sc2.l("content", "content", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"content\"…       \"content\", reader)");
                        throw eg0L;
                    }
                } else if (iQ == 1) {
                    strA2 = abstractC5897pG0.a(reader);
                    if (strA2 == null) {
                        EG0 eg0L2 = C6596sc2.l("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw eg0L2;
                    }
                } else if (iQ == 2) {
                    strA3 = abstractC5897pG0.a(reader);
                    if (strA3 == null) {
                        EG0 eg0L3 = C6596sc2.l("link", "link", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"link\", \"link\",\n            reader)");
                        throw eg0L3;
                    }
                } else if (iQ == 3 && (strA4 = abstractC5897pG0.a(reader)) == null) {
                    EG0 eg0L4 = C6596sc2.l("key", "key", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"key\", \"key\", reader)");
                    throw eg0L4;
                }
            } else {
                reader.u();
                reader.I();
            }
        }
        reader.B0();
        if (strA == null) {
            EG0 eg0F = C6596sc2.f("content", "content", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"content\", \"content\", reader)");
            throw eg0F;
        }
        if (strA2 == null) {
            EG0 eg0F2 = C6596sc2.f("title", "title", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"title\", \"title\", reader)");
            throw eg0F2;
        }
        if (strA3 == null) {
            EG0 eg0F3 = C6596sc2.f("link", "link", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"link\", \"link\", reader)");
            throw eg0F3;
        }
        if (strA4 != null) {
            return new CustomData(strA, strA2, strA3, strA4);
        }
        EG0 eg0F4 = C6596sc2.f("key", "key", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"key\", \"key\", reader)");
        throw eg0F4;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, CustomData customData) {
        CustomData customData2 = customData;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (customData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("content");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, customData2.a);
        writer.q("title");
        abstractC5897pG0.e(writer, customData2.b);
        writer.q("link");
        abstractC5897pG0.e(writer, customData2.c);
        writer.q("key");
        abstractC5897pG0.e(writer, customData2.d);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(CustomData)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
