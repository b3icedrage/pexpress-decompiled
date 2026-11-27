package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AR0 implements RJ0<C7189vR0> {

    @NotNull
    public static final AR0 a = new AR0();

    @NotNull
    public static final C5986ph1 b = SH1.a("kotlinx.datetime.LocalDate", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        C7189vR0 value = (C7189vR0) obj;
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
        C7189vR0.a aVar = C7189vR0.Companion;
        String input = decoder.t();
        KT<C7189vR0> kt = C7189vR0.b.a;
        KW1 kw1 = C7820yR0.a;
        KT format = (KT) kw1.getValue();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(format, "format");
        if (format != ((KT) kw1.getValue())) {
            return (C7189vR0) format.parse(input);
        }
        try {
            return new C7189vR0(LocalDate.parse(input));
        } catch (DateTimeParseException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new NT(cause);
        }
    }
}
