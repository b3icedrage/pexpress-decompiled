package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7824yS1 extends ML0 implements Function2<String, List<? extends String>, Unit> {
    public final /* synthetic */ C8034zS1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7824yS1(C8034zS1 c8034zS1) {
        super(2);
        this.d = c8034zS1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, List<? extends String> list) {
        String name = str;
        List<? extends String> values = list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.d.b(name, values);
        return Unit.a;
    }
}
