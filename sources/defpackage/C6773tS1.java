package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: tS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6773tS1 extends ML0 implements Function0<String> {
    public final /* synthetic */ C6563sS1<Object> d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int g;
    public final /* synthetic */ C2590Zo1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6773tS1(C6563sS1 c6563sS1, String str, int i, C2590Zo1 c2590Zo1) {
        super(0);
        this.d = c6563sS1;
        this.e = str;
        this.g = i;
        this.h = c2590Zo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Expected " + this.d.b + " but got " + this.e.subSequence(this.g, this.h.d).toString();
    }
}
