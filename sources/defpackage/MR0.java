package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MR0 implements RJ0<FR0> {

    @NotNull
    public static final MR0 a = new MR0();

    @NotNull
    public static final C5986ph1 b = SH1.a("kotlinx.datetime.LocalTime", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        FR0 value = (FR0) obj;
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
        FR0.a aVar = FR0.Companion;
        String input = decoder.t();
        KW1 kw1 = LR0.a;
        GR0 format = (GR0) kw1.getValue();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(format, "format");
        if (format != ((GR0) kw1.getValue())) {
            return (FR0) format.parse(input);
        }
        try {
            return new FR0(LocalTime.parse(input));
        } catch (DateTimeParseException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new NT(cause);
        }
    }
}
