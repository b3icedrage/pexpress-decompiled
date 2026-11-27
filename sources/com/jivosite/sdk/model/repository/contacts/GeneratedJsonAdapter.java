package com.jivosite.sdk.model.repository.contacts;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.EG0;
import defpackage.YH0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.jivosite.sdk.model.repository.contacts.ContactFormJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/repository/contacts/ContactFormJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/repository/contacts/ContactForm;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<ContactForm> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<Long> c;

    @Nullable
    public volatile Constructor<ContactForm> d;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "email", "timestamp");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"name\", \"phone\", \"email\",\n      \"timestamp\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<Long> abstractC5897pG0C2 = moshi.c(Long.TYPE, c6702t60, "timestamp");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final ContactForm a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        Long lA = 0L;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        int i = -1;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0) {
                strA = this.b.a(reader);
                if (strA == null) {
                    EG0 eg0L = C6596sc2.l(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"name\", \"name\", reader)");
                    throw eg0L;
                }
                i &= -2;
            } else if (iQ == 1) {
                strA2 = this.b.a(reader);
                if (strA2 == null) {
                    EG0 eg0L2 = C6596sc2.l("phone", "phone", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"phone\", …e\",\n              reader)");
                    throw eg0L2;
                }
                i &= -3;
            } else if (iQ == 2) {
                strA3 = this.b.a(reader);
                if (strA3 == null) {
                    EG0 eg0L3 = C6596sc2.l("email", "email", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"email\", …l\",\n              reader)");
                    throw eg0L3;
                }
                i &= -5;
            } else if (iQ == 3) {
                lA = this.c.a(reader);
                if (lA == null) {
                    EG0 eg0L4 = C6596sc2.l("timestamp", "timestamp", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L4, "unexpectedNull(\"timestam…     \"timestamp\", reader)");
                    throw eg0L4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        reader.B0();
        if (i == -16) {
            Intrinsics.c(strA, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.c(strA2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.c(strA3, "null cannot be cast to non-null type kotlin.String");
            return new ContactForm(lA.longValue(), strA, strA2, strA3);
        }
        Constructor<ContactForm> declaredConstructor = this.d;
        if (declaredConstructor == null) {
            declaredConstructor = ContactForm.class.getDeclaredConstructor(String.class, String.class, String.class, Long.TYPE, Integer.TYPE, C6596sc2.c);
            this.d = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "ContactForm::class.java.…his.constructorRef = it }");
        }
        ContactForm contactFormNewInstance = declaredConstructor.newInstance(strA, strA2, strA3, lA, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(contactFormNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return contactFormNewInstance;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, ContactForm contactForm) {
        ContactForm contactForm2 = contactForm;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (contactForm2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, contactForm2.a);
        writer.q("phone");
        abstractC5897pG0.e(writer, contactForm2.b);
        writer.q("email");
        abstractC5897pG0.e(writer, contactForm2.c);
        writer.q("timestamp");
        this.c.e(writer, Long.valueOf(contactForm2.d));
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(ContactForm)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
