package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WA0 implements RJ0<VA0> {

    @NotNull
    public static final WA0 a = new WA0();

    @NotNull
    public static final C5986ph1 b = SH1.a("kotlinx.datetime.Instant", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        VA0 value = (VA0) obj;
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
        VA0.a aVar = VA0.Companion;
        String input = decoder.t();
        IT format = C6984uT.b.a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            return ((C6984uT) format.parse(input)).a();
        } catch (IllegalArgumentException e) {
            throw new NT("Failed to parse an instant from '" + ((Object) input) + '\'', e);
        }
    }
}
