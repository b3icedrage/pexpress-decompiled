package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: dT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3366dT0 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3366dT0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                return ((InterfaceC5887pD) this.e).a((JM) obj);
            default:
                return AbstractC7909yq1.e((AbstractC7909yq1) this.e, (JM) obj);
        }
    }
}
