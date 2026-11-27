package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.h;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4169hH0 implements RJ0<C3959gH0> {

    @NotNull
    public static final C4169hH0 a = new C4169hH0();

    @NotNull
    public static final C5986ph1 b = SH1.a("kotlinx.serialization.json.JsonLiteral", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        Boolean bool;
        C3959gH0 value = (C3959gH0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        boolean z = value.d;
        String str = value.e;
        if (z) {
            encoder.B(str);
            return;
        }
        Long lC0 = StringsKt.c0(str);
        if (lC0 != null) {
            encoder.z(lC0.longValue());
            return;
        }
        S72 s72E = h.e(str);
        if (s72E != null) {
            Intrinsics.checkNotNullParameter(S72.e, "<this>");
            encoder.m(W72.b).z(s72E.d);
            return;
        }
        Double d = IS1.d(str);
        if (d != null) {
            encoder.g(d.doubleValue());
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.l(bool.booleanValue());
        } else {
            encoder.B(str);
        }
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementL = C5207m.c(decoder).l();
        if (jsonElementL instanceof C3959gH0) {
            return (C3959gH0) jsonElementL;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw C1874Qu.e(BX.b(C2017Sp1.a, jsonElementL.getClass(), sb), jsonElementL.toString(), -1);
    }
}
