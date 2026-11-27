package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7159vH0 implements RJ0<JsonPrimitive> {

    @NotNull
    public static final C7159vH0 a = new C7159vH0();

    @NotNull
    public static final OH1 b = SH1.c("kotlinx.serialization.json.JsonPrimitive", AbstractC5356mh1.i.a, new MH1[0], RH1.e);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        JsonPrimitive value = (JsonPrimitive) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        if (value instanceof JsonNull) {
            encoder.f(C5057lH0.a, JsonNull.INSTANCE);
        } else {
            encoder.f(C4169hH0.a, (C3959gH0) value);
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
        if (jsonElementL instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementL;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw C1874Qu.e(BX.b(C2017Sp1.a, jsonElementL.getClass(), sb), jsonElementL.toString(), -1);
    }
}
