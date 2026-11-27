package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3303d82 extends ML0 implements Function2<String, List<? extends String>, Unit> {
    public final /* synthetic */ Z72 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3303d82(Z72 z72) {
        super(2);
        this.d = z72;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, List<? extends String> list) {
        String key = str;
        List<? extends String> values = list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.d.i.b(key, values);
        return Unit.a;
    }
}
