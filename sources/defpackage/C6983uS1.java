package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: uS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6983uS1 extends ML0 implements Function1<Pair<? extends String, ? extends C6563sS1.a>, Integer> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6983uS1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Pair<? extends String, ? extends C6563sS1.a> pair) {
        return Integer.valueOf(BG.a((String) pair.d, this.d));
    }
}
