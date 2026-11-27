package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7928yx implements Function1 {
    public static final C7928yx e = new C7928yx(0);
    public static final C7928yx g = new C7928yx(1);
    public static final C7928yx h = new C7928yx(2);
    public static final C7928yx i = new C7928yx(3);
    public final /* synthetic */ int d;

    public /* synthetic */ C7928yx(int i2) {
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Class it = (Class) obj;
                UH uh = C0633Ax.a;
                Intrinsics.checkNotNullParameter(it, "it");
                C3545eJ0 c3545eJ0A = C0633Ax.a(it);
                C5653o60 c5653o60 = C5653o60.d;
                return C5276mJ0.a(c3545eJ0A, c5653o60, true, c5653o60);
            case 1:
                IJ0<Object>[] ij0Arr = C3802fZ.Y;
                Intrinsics.checkNotNullParameter((Xc2) obj, "it");
                return "...";
            case 2:
                int i2 = TO0.p;
                InterfaceC5044lD interfaceC5044lDC = ((AbstractC4649jL0) obj).V0().c();
                if (interfaceC5044lDC instanceof FC) {
                    return (FC) interfaceC5044lDC;
                }
                return null;
            default:
                C4267hk1 it2 = (C4267hk1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Integer.valueOf(it2.h.size());
        }
    }
}
