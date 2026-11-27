package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TG0 implements RJ0<JsonElement> {

    @NotNull
    public static final TG0 a = new TG0();

    @NotNull
    public static final OH1 b = SH1.c("kotlinx.serialization.json.JsonElement", AbstractC7448wf1.b.a, new MH1[0], a.d);

    public static final class a extends ML0 implements Function1<YC, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(YC yc) {
            YC buildSerialDescriptor = yc;
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            YC.a(buildSerialDescriptor, "JsonPrimitive", new UG0(OG0.d));
            YC.a(buildSerialDescriptor, "JsonNull", new UG0(PG0.d));
            YC.a(buildSerialDescriptor, "JsonLiteral", new UG0(QG0.d));
            YC.a(buildSerialDescriptor, "JsonObject", new UG0(RG0.d));
            YC.a(buildSerialDescriptor, "JsonArray", new UG0(SG0.d));
            return Unit.a;
        }
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        JsonElement value = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.f(C7159vH0.a, value);
        } else if (value instanceof JsonObject) {
            encoder.f(C6110qH0.a, value);
        } else if (value instanceof JsonArray) {
            encoder.f(C6526sG0.a, value);
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
        return C5207m.c(decoder).l();
    }
}
