package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0639Az extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0639Az(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                UL0 language = (UL0) obj;
                Intrinsics.checkNotNullParameter(language, "p0");
                C1263Iz c1263Iz = (C1263Iz) this.e;
                c1263Iz.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                c1263Iz.i.setValue(language);
                break;
            default:
                ((InterfaceC2672aC0) this.e).a((Throwable) obj);
                break;
        }
        return Unit.a;
    }
}
