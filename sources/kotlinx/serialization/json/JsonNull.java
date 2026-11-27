package kotlinx.serialization.json;

import defpackage.C5057lH0;
import defpackage.EnumC4403iP0;
import defpackage.ML0;
import defpackage.RJ0;
import defpackage.XH1;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = C5057lH0.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "LRJ0;", "serializer", "()LRJ0;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    @NotNull
    public static final String d = "null";
    public static final /* synthetic */ Object e = XO0.a(EnumC4403iP0.d, a.d);

    public static final class a extends ML0 implements Function0<RJ0<Object>> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final RJ0<Object> invoke() {
            return C5057lH0.a;
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public final String b() {
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @NotNull
    public final RJ0<JsonNull> serializer() {
        return (RJ0) e.getValue();
    }
}
