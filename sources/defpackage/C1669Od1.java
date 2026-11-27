package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Od1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1669Od1 extends ML0 implements Function0<String> {
    public final /* synthetic */ C1747Pd1<Object> d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669Od1(C1747Pd1 c1747Pd1, String str, int i, int i2) {
        super(0);
        this.d = c1747Pd1;
        this.e = str;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(this.d.a);
        sb.append(" but got ");
        int i = this.h;
        int i2 = this.g;
        sb.append(this.e.subSequence(i2, i + i2 + 1).toString());
        return sb.toString();
    }
}
