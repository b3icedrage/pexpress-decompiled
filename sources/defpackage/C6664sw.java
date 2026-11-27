package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6664sw extends ML0 implements Function0<Boolean> {
    public final /* synthetic */ AbstractC8135zw d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6664sw(AbstractC8135zw abstractC8135zw, int i) {
        super(0);
        this.d = abstractC8135zw;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AbstractC8135zw abstractC8135zw = this.d;
        return Boolean.valueOf(abstractC8135zw.d() < this.e && !abstractC8135zw.k());
    }
}
