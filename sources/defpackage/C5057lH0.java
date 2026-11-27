package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5057lH0 implements RJ0<JsonNull> {

    @NotNull
    public static final C5057lH0 a = new C5057lH0();

    @NotNull
    public static final OH1 b = SH1.c("kotlinx.serialization.json.JsonNull", VH1.b.a, new MH1[0], RH1.e);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        encoder.e();
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C5207m.c(decoder);
        if (!decoder.w()) {
            return JsonNull.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new IG0("Expected 'null' literal");
    }
}
