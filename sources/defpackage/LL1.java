package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class LL1 extends ML0 implements Function0<String> {
    public final /* synthetic */ ML1<Object> d;
    public final /* synthetic */ char e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LL1(ML1<Object> ml1, char c) {
        super(0);
        this.d = ml1;
        this.e = c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Expected " + this.d.b + " but got " + this.e;
    }
}
