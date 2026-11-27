package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D81 extends ML0 implements Function2<String, String, Unit> {
    public final /* synthetic */ C4543is1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D81(C4543is1.a aVar) {
        super(2);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String key = str;
        String value = str2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list = C1159Hq0.a;
        if (!Intrinsics.a(key, "Content-Length")) {
            this.d.a(key, value);
        }
        return Unit.a;
    }
}
