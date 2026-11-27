package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8138zx implements Function1 {
    public static final C8138zx e = new C8138zx(0);
    public static final C8138zx g = new C8138zx(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C8138zx(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                UH uh = C0633Ax.a;
                Intrinsics.checkNotNullParameter((Class) obj, "it");
                return new ConcurrentHashMap();
            default:
                AbstractC4649jL0 it = (AbstractC4649jL0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
        }
    }
}
