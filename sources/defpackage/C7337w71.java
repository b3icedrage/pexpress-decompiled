package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: w71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7337w71 extends ML0 implements Function0<String> {
    public final /* synthetic */ C2590Zo1 d;
    public final /* synthetic */ C7758y71<Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7337w71(C2590Zo1 c2590Zo1, C7758y71<Object> c7758y71) {
        super(0);
        this.d = c2590Zo1;
        this.e = c7758y71;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Only found " + this.d.d + " digits in a row, but need to parse " + this.e.b();
    }
}
