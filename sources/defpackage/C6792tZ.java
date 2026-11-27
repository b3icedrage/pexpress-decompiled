package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6792tZ implements InterfaceC2396Xc {
    public static final /* synthetic */ IJ0<Object>[] e;

    @NotNull
    public final I51 d;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        e = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C6792tZ.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C6792tZ(@NotNull C2720aS0 storageManager, @NotNull Function0 compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        storageManager.getClass();
        this.d = new C2720aS0.h(storageManager, compute);
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.b(this, c1758Ph0);
    }

    @Override // defpackage.InterfaceC2396Xc
    public boolean isEmpty() {
        return ((List) Nm2.f(this.d, e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        return ((List) Nm2.f(this.d, e[0])).iterator();
    }

    @Override // defpackage.InterfaceC2396Xc
    @Nullable
    public final InterfaceC1583Nc p(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.a(this, c1758Ph0);
    }
}
