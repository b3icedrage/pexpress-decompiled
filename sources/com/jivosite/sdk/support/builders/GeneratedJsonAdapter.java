package com.jivosite.sdk.support.builders;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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

/* JADX INFO: renamed from: com.jivosite.sdk.support.builders.ContactInfoJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/support/builders/ContactInfoJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/support/builders/ContactInfo;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<ContactInfo> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<String> c;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "email", "phone", "description");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"name\", \"email\", \"phone\",\n      \"description\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<String> abstractC5897pG0C2 = moshi.c(String.class, c6702t60, "email");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(String::cl…mptySet(),\n      \"email\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final ContactInfo a(AbstractC8000zH0 reader) {
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
                if (iQ != 0) {
                    AbstractC5897pG0<String> abstractC5897pG1 = this.c;
                    if (iQ == 1) {
                        strA2 = abstractC5897pG1.a(reader);
                        if (strA2 == null) {
                            EG0 eg0L = C6596sc2.l("email", "email", reader);
                            Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"email\", …ail\",\n            reader)");
                            throw eg0L;
                        }
                    } else if (iQ == 2) {
                        strA3 = abstractC5897pG1.a(reader);
                        if (strA3 == null) {
                            EG0 eg0L2 = C6596sc2.l("phone", "phone", reader);
                            Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"phone\", …one\",\n            reader)");
                            throw eg0L2;
                        }
                    } else if (iQ == 3) {
                        strA4 = abstractC5897pG0.a(reader);
                    }
                } else {
                    strA = abstractC5897pG0.a(reader);
                }
            } else {
                reader.u();
                reader.I();
            }
        }
        reader.B0();
        if (strA2 == null) {
            EG0 eg0F = C6596sc2.f("email", "email", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"email\", \"email\", reader)");
            throw eg0F;
        }
        if (strA3 != null) {
            return new ContactInfo(strA, strA2, strA3, strA4);
        }
        EG0 eg0F2 = C6596sc2.f("phone", "phone", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"phone\", \"phone\", reader)");
        throw eg0F2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, ContactInfo contactInfo) {
        ContactInfo contactInfo2 = contactInfo;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (contactInfo2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, contactInfo2.a);
        writer.q("email");
        AbstractC5897pG0<String> abstractC5897pG1 = this.c;
        abstractC5897pG1.e(writer, contactInfo2.b);
        writer.q("phone");
        abstractC5897pG1.e(writer, contactInfo2.c);
        writer.q("description");
        abstractC5897pG0.e(writer, contactInfo2.d);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(ContactInfo)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
