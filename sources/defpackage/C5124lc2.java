package defpackage;

import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5124lc2 implements RJ0<Rb2> {

    @NotNull
    public static final C5124lc2 a = new C5124lc2();

    @NotNull
    public static final C5986ph1 b = SH1.a("kotlinx.datetime.UtcOffset", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        Rb2 value = (Rb2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.B(value.toString());
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Rb2.a aVar = Rb2.Companion;
        String input = decoder.t();
        KW1 kw1 = Vb2.a;
        Tb2 format = (Tb2) kw1.getValue();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(format, "format");
        if (format == ((Tb2) kw1.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) C4446ic2.a.getValue();
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatter, "access$getIsoFormat(...)");
            return C4446ic2.a(input, dateTimeFormatter);
        }
        if (format == ((Tb2) Vb2.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) C4446ic2.b.getValue();
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return C4446ic2.a(input, dateTimeFormatter2);
        }
        if (format != ((Tb2) Vb2.c.getValue())) {
            return (Rb2) format.parse(input);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) C4446ic2.c.getValue();
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return C4446ic2.a(input, dateTimeFormatter3);
    }
}
