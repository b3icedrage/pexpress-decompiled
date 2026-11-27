package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class S71 extends ML0 implements Function0<MH1> {
    public final /* synthetic */ T71<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S71(T71 t71) {
        super(0);
        this.d = t71;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MH1 invoke() {
        return SH1.c("kotlin.Unit", RS1.d.a, new MH1[0], new R71(this.d, 0));
    }
}
